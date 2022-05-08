create table products (product_id bigint not null auto_increment, company varchar(255) not null, product_name varchar(255) not null, price double precision not null, primary key (product_id)) engine=InnoDB;
create table sku (sku_id bigint not null auto_increment, quantity bigint, product_id bigint not null, primary key (sku_id)) engine=InnoDB;
create table user (id bigint not null auto_increment, name varchar(255), primary key (id)) engine=InnoDB;
alter table sku add constraint FKgwo5kflvih98koqpubtg1y3ps foreign key (product_id) references products (product_id);
