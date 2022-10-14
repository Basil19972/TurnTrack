
/*ROLES */
insert into roles (id, name) values ('a05d3a73-5f6a-4cb3-ac13-a493163515a4', 'USER');
insert into roles (id, name) values ('4d0f7301-c123-4189-9636-066531275bf4', 'DEV');
insert into roles (id, name) values ('8383b369-3f33-4b39-97dd-ddf172b39e45', 'ADMIN');


/*AUTHORITIES */
insert into authorities (id, name) values ('4ab22cdc-0cf9-4354-92ab-68702d54ffd0', 'USER_READ');
insert into authorities (id, name) values ('d1519f54-f849-4543-816b-b24f4c5173e9', 'USER_MODIFY');
insert into authorities (id, name) values ('c1e9ccd6-1d29-40a1-a544-f133a14dc246', 'USER_DELETE');

insert into authorities (id, name) values ('b7a6d679-9ebc-4f8a-b5be-52aa35a2285c', 'WEEKDAY_READ');
insert into authorities (id, name) values ('85248618-f314-4e25-ae50-ba7341c146ef', 'PLAN_CATEGORY_READ');
insert into authorities (id, name) values ('fd22ce26-6e5a-45a7-ab37-2c5e0ca83777', 'WEEKDAY_WRITE');
insert into authorities (id, name) values ('8e3ad5cf-d25c-47b3-81a2-d2d0a98a0445', 'EXERCISE_WRITE');
insert into authorities (id, name) values ('52b6c76f-3749-4494-9c91-1c311a544776', 'ORDER_READ');
insert into authorities (id, name) values ('041ac4c7-3de5-4872-8059-bc9664a9de0a', 'EXERCISE_READ');
insert into authorities (id, name) values ('8663b6c1-8dbd-445a-8f11-7ca5371519f7', 'USER_WEIGHT_HISTORY_WRITE');
insert into authorities (id, name) values ('c4a81033-d3d6-4a4e-99aa-b54b1af3777f', 'USER_BMI_READ');
insert into authorities (id, name) values ('09250646-f1f6-4f59-b783-64fef86a3d2d', 'WEEKPLAN_WRITE');








/*USER */
insert into role_authority (role_id, authority_id) values ('a05d3a73-5f6a-4cb3-ac13-a493163515a4', '4ab22cdc-0cf9-4354-92ab-68702d54ffd0');

insert into role_authority (role_id, authority_id) values ('a05d3a73-5f6a-4cb3-ac13-a493163515a4', 'b7a6d679-9ebc-4f8a-b5be-52aa35a2285c');
insert into role_authority (role_id, authority_id) values ('a05d3a73-5f6a-4cb3-ac13-a493163515a4', '85248618-f314-4e25-ae50-ba7341c146ef');
insert into role_authority (role_id, authority_id) values ('a05d3a73-5f6a-4cb3-ac13-a493163515a4', 'fd22ce26-6e5a-45a7-ab37-2c5e0ca83777');
insert into role_authority (role_id, authority_id) values ('a05d3a73-5f6a-4cb3-ac13-a493163515a4', '52b6c76f-3749-4494-9c91-1c311a544776');
insert into role_authority (role_id, authority_id) values ('a05d3a73-5f6a-4cb3-ac13-a493163515a4', '8e3ad5cf-d25c-47b3-81a2-d2d0a98a0445');
insert into role_authority (role_id, authority_id) values ('a05d3a73-5f6a-4cb3-ac13-a493163515a4', '041ac4c7-3de5-4872-8059-bc9664a9de0a');
insert into role_authority (role_id, authority_id) values ('a05d3a73-5f6a-4cb3-ac13-a493163515a4', '8663b6c1-8dbd-445a-8f11-7ca5371519f7');
insert into role_authority (role_id, authority_id) values ('a05d3a73-5f6a-4cb3-ac13-a493163515a4', 'c4a81033-d3d6-4a4e-99aa-b54b1af3777f');
insert into role_authority (role_id, authority_id) values ('a05d3a73-5f6a-4cb3-ac13-a493163515a4', '09250646-f1f6-4f59-b783-64fef86a3d2d');



/*DEV */
insert into role_authority (role_id, authority_id) values ('4d0f7301-c123-4189-9636-066531275bf4', '4ab22cdc-0cf9-4354-92ab-68702d54ffd0');
insert into role_authority (role_id, authority_id) values ('4d0f7301-c123-4189-9636-066531275bf4', 'd1519f54-f849-4543-816b-b24f4c5173e9');
insert into role_authority (role_id, authority_id) values ('4d0f7301-c123-4189-9636-066531275bf4', 'c1e9ccd6-1d29-40a1-a544-f133a14dc246');

insert into role_authority (role_id, authority_id) values ('4d0f7301-c123-4189-9636-066531275bf4', 'b7a6d679-9ebc-4f8a-b5be-52aa35a2285c');
insert into role_authority (role_id, authority_id) values ('4d0f7301-c123-4189-9636-066531275bf4', '85248618-f314-4e25-ae50-ba7341c146ef');
insert into role_authority (role_id, authority_id) values ('4d0f7301-c123-4189-9636-066531275bf4', 'fd22ce26-6e5a-45a7-ab37-2c5e0ca83777');
insert into role_authority (role_id, authority_id) values ('4d0f7301-c123-4189-9636-066531275bf4', '52b6c76f-3749-4494-9c91-1c311a544776');


/*ADMIN*/
insert into role_authority (role_id, authority_id) values ('8383b369-3f33-4b39-97dd-ddf172b39e45', '4ab22cdc-0cf9-4354-92ab-68702d54ffd0');
insert into role_authority (role_id, authority_id) values ('8383b369-3f33-4b39-97dd-ddf172b39e45', 'd1519f54-f849-4543-816b-b24f4c5173e9');
insert into role_authority (role_id, authority_id) values ('8383b369-3f33-4b39-97dd-ddf172b39e45', 'c1e9ccd6-1d29-40a1-a544-f133a14dc246');

insert into role_authority (role_id, authority_id) values ('8383b369-3f33-4b39-97dd-ddf172b39e45', 'b7a6d679-9ebc-4f8a-b5be-52aa35a2285c');
insert into role_authority (role_id, authority_id) values ('8383b369-3f33-4b39-97dd-ddf172b39e45', '85248618-f314-4e25-ae50-ba7341c146ef');
insert into role_authority (role_id, authority_id) values ('8383b369-3f33-4b39-97dd-ddf172b39e45', 'fd22ce26-6e5a-45a7-ab37-2c5e0ca83777');
insert into role_authority (role_id, authority_id) values ('8383b369-3f33-4b39-97dd-ddf172b39e45', '52b6c76f-3749-4494-9c91-1c311a544776');

insert into role_authority (role_id, authority_id) values ('8383b369-3f33-4b39-97dd-ddf172b39e45', '041ac4c7-3de5-4872-8059-bc9664a9de0a');







/* PlanCategory*/
insert into plan_category (id,name) values ('4277bafa-bcb6-4ee8-b2f8-aa65dceaf77a','Heavy Weight');
insert into plan_category (id,name) values ('d9caa201-a093-4cec-b2aa-320277b06271','Medium Weight');
insert into plan_category (id,name) values ('2d403deb-f02f-41e9-b7a3-767a24a61f90','Light Weight');
insert into plan_category (id,name) values ('1ea0769d-7736-4e7f-84b9-08d630fc5bd3','Cardio');

/* exercises */





