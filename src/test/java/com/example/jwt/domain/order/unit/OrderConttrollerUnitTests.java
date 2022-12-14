package com.example.jwt.domain.order.unit;

import com.example.jwt.core.security.config.AuthorizationSchemas;
import com.example.jwt.core.security.config.JwtProperties;
import com.example.jwt.domain.authority.Authority;
import com.example.jwt.domain.authority.AuthorityRepository;
import com.example.jwt.domain.category.Category;
import com.example.jwt.domain.category.CategoryService;
import com.example.jwt.domain.country.Country;
import com.example.jwt.domain.country.CountryRepository;
import com.example.jwt.domain.order.Order;
import com.example.jwt.domain.order.OrderRepository;
import com.example.jwt.domain.order.OrderService;
import com.example.jwt.domain.placeorder.PlaceOrder;
import com.example.jwt.domain.placeorder.PlaceOrderRepository;
import com.example.jwt.domain.product.Product;
import com.example.jwt.domain.product.ProductRepository;
import com.example.jwt.domain.rank.Rank;
import com.example.jwt.domain.rank.RankRepository;
import com.example.jwt.domain.role.Role;
import com.example.jwt.domain.role.RoleRepository;
import com.example.jwt.domain.user.User;
import com.example.jwt.domain.user.UserRepository;
import com.example.jwt.domain.user.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@SpringBootTest
@ActiveProfiles("test")
@AutoConfigureMockMvc()
public class OrderConttrollerUnitTests {

    @Autowired
    private MockMvc mvc;

    @Autowired
    private JwtProperties jwtProperties;

    @MockBean
    private UserService userService;

    @MockBean
    private OrderService orderService;

    private User dummyUser;
    private Rank dummyRank;
    private Authority dummyAuthority;
    private Role dummyRole;

    private String dummyToken;
    private Order dummyOrder;
    private Order dummyOrder2;

   private List<Order> dummyOrders = new ArrayList<>();

    private String generateToken() {
        byte[] keyBytes = Decoders.BASE64.decode(jwtProperties.getSecret());

        return Jwts.builder()
                .setClaims(Map.of("sub", UUID.randomUUID()))
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + jwtProperties.getExpirationMillis()))
                .setIssuer(jwtProperties.getIssuer())
                .signWith(Keys.hmacShaKeyFor(keyBytes))
                .compact();
    }


    @BeforeEach
    public void setUp() {
        dummyToken = generateToken();

            dummyRank = new Rank(UUID.randomUUID(), "TestRank", 0, 0, true);

            dummyAuthority = new Authority(UUID.randomUUID(), "ORDER_READ");

            dummyRole = new Role(UUID.randomUUID(),"USER",Set.of(dummyAuthority));

            dummyUser = new User(UUID.randomUUID(), "Test", "Test", 25, "test.test@test.ch", "pw", true, dummyRank, 0,Set.of(dummyRole));

            dummyOrder = new Order(UUID.randomUUID(),true,20,dummyUser,20.0);
            dummyOrder2 = new Order(UUID.randomUUID(),true,20,dummyUser,20.0);

        System.out.println("First order ID: -------->"+dummyOrder.getId() + dummyOrder.toString());
        dummyOrders.add(dummyOrder);
        dummyOrders.add(dummyOrder2);


    }



    @Test
    /*
        @WithUserDetails(setupBefore = TestExecutionEvent.TEST_EXECUTION, userDetailsServiceBeanName = "userServiceImpl", value = "robert@gmail.com")
        Above annotation invokes the [userDetailsServiceBeanName].loadUserByUsername(String email) method with the parameter [value]. Hence, the method
        loadUserByUsername(String email) needs to be mocked accordingly. Even though the returned user is saved as principal in the security context, the
        result of the test method stays "FALSE: Status Expected:<200> but was:<403>". This is due to the fact that WebSecurityConfig.filterChain()
        gets invoked by mvc.perform() AFTER the annotation @WithUserDetails got triggered. This leads to a SecurityContextHolder.clearContext() by
        CustomAuthorizationFilter as no valid JWT was passed to doFilterInternal(). Following approach solves the given issue:
        -   Pass a dummy JWT to the requests triggered by mvc.perform()
        -   Mock the method UserService.findById and return the desired users with the requested roles and authorities
    */
    public void rfindAll_requestAllProducts_expectAllProductsAsDTOS() throws Exception {
        given(userService.findById(any(UUID.class))).willReturn(dummyUser);
        given(orderService.findallOrdersbyUser()).willReturn(new HashSet<>(dummyOrders));

        mvc.perform(MockMvcRequestBuilders
                        .get("/order")
                        .header(HttpHeaders.AUTHORIZATION, AuthorizationSchemas.BEARER + " " + dummyToken)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$", hasSize(2)))
                .andExpect(MockMvcResultMatchers.jsonPath("$[*].id").value(Matchers.containsInAnyOrder(dummyOrders.get(0).getId().toString(), dummyOrders.get(1).getId().toString())));


        verify(orderService, times(1)).findallOrdersbyUser();
    }


}
