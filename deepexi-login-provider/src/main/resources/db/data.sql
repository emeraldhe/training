DROP TABLE IF EXISTS product;

CREATE TABLE IF NOT EXISTS product(id varchar(32) unsigned not null primary key,name varchar(32),price int,tenant_id varchar(32),created_by varchar(32),updated_by varchar(32),created_time date,updated_time date, is_deleted int(1));

INSERT INTO product(id, name, price, tenant_id, created_by, updated_by, created_time, updated_time, is_deleted) VALUES ('1', '苹果', 20, null, null, null, null, null, 0),
('2', '梨', 10, null, null ,null, null, null, 0),
('3', '桃子', 123, null, null ,null, null, null, 0),
('4', '香蕉', 11, null, null ,null, null, null, 0),
('5', '猕猴桃', 50, null, null ,null, null, null, 0),
('6', '桔子', 33, null, null ,null, null, null, 0),
('7', '菠萝', 90, null, null ,null, null, null, 0),
('8', '芒果', 766, null, null ,null, null, null, 0),
('9', '红枣', 29, null, null ,null, null, null, 0),
('10', '榴莲', 990, null, null ,null, null, null, 0),
('11', '柚子', 291, null, null ,null, null, null, 0),
('12', '小番茄', 200, null, null ,null, null, null, 0);
CREATE TABLE IF NOT EXISTS commodity_property(
    id int  not null primary key,    tenant_id int  not null ,    app_id int  not null ,    parent_id int   ,    path varchar(255) not null ,    property_code varchar(255) not null ,    property_name varchar(255) not null ,    property_desc varchar(255)  ,    input_type tinyint not null ,    version int  not null ,    remark varchar(255)  ,    is_deleted tinyint not null ,    created_by varchar(255) not null ,    created_time datetime not null ,    updated_by varchar(255) not null ,    updated_time datetime not null );
CREATE TABLE IF NOT EXISTS commodity_category_property_group_relationship(
    id int  not null primary key,    tenant_id int  not null ,    app_id int  not null ,    property_group_id int  not null ,    property_id int  not null ,    is_required tinyint not null ,    property_types varchar(255) not null ,    version int  not null ,    remark varchar(255)  ,    is_deleted tinyint not null ,    created_by varchar(255) not null ,    created_time datetime not null ,    updated_by varchar(255) not null ,    updated_time datetime not null );
