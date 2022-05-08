create table products
(
    product_id   bigint auto_increment
        primary key,
    company      varchar(255) not null,
    product_name varchar(255) not null,
    price        double       not null,
    quantity     bigint       not null
);

create table sku
(
    sku_id     bigint auto_increment
        primary key,
    quantity   bigint null,
    product_id bigint not null,
    constraint FKgwo5kflvih98koqpubtg1y3ps
        foreign key (product_id) references products (product_id)
);

create table user_table
(
    user_id bigint auto_increment
        primary key,
    name    varchar(255) null
);

create table orders_table
(
    id           bigint auto_increment
        primary key,
    date_created date   null,
    user_id      bigint not null,
    constraint FKe8vcwmddy0ab7a4aqpkd75d5v
        foreign key (user_id) references user_table (user_id)
);

create table order_product
(
    quantity   int    not null,
    product_id bigint not null,
    order_id   bigint not null,
    orders_id  bigint not null,
    primary key (order_id, product_id),
    constraint FKe68ouupfqjwkkfc562g5hqdtl
        foreign key (order_id) references orders_table (id),
    constraint FKjftdq530ll76seh18177jtnfl
        foreign key (orders_id) references orders_table (id),
    constraint FKo6helt0ucmegaeachjpx40xhe
        foreign key (product_id) references products (product_id)
);
