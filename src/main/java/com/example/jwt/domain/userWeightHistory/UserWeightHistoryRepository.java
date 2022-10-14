package com.example.jwt.domain.userWeightHistory;

import com.example.jwt.core.generic.ExtendedRepository;
import com.example.jwt.domain.user.User;
import com.example.jwt.domain.user.dto.UserIdNameAndPriceSpendDTO;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserWeightHistoryRepository extends ExtendedRepository<UserWeightHistory> {

   // Optional<UserWeightHistory> findDistinctFirstByCreatedAt();

    /*

    @Query(value = "select users.first_name as firstname ,users.last_name as lastname, sum(o.discount) as sumdiscount from users\n" +
            "            left join orders o on users.id = o.user_id\n" +
            "            left join place_order po on o.id = po.order_id\n" +
            "            where po.ordertime between :date1 and :date2\n" +
            "            group by users.first_name, users.last_name;", nativeQuery = true)
    List<NameSumDisxountDTO> getUsersSumDiscount(@Param("date1") Timestamp date1, @Param("date2") Timestamp date2);

     */

}