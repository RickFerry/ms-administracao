insert into users (name, email, password) values ('John Doe', 'john@me.com', '$2a$12$PFmC4laPEfWMSDzBGR2b4.9ERcBad0MczRwxBKN2fXcaM9gGHLbNK'); // 123456
insert into users (name, email, password) values ('Jane Doe', 'jane@me.com', '$2a$12$v16SpOk2Ad3kldfdP6oLZu200O0TUXMxzvIMmmi0UXrwJhssmd2MO'); // 654321

insert into roles (name) values ('ROLE_OPERATOR');
insert into roles (name) values ('ROLE_ADMIN');

insert into user_roles (user_id, role_id) values (1, 1);
insert into user_roles (user_id, role_id) values (2, 1);
insert into user_roles (user_id, role_id) values (2, 2);
