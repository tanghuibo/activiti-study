# 基础配置

## 建库脚本

```sql
-- 用于存放业务相关的表
create database activiti_study_business;
-- 用于存放框架相关的表
create database activiti_study_framework; 
```

activiti_study_business
```sql
-- 用户表
create table basic_user
(
	id bigint auto_increment comment '用户id',
	name varchar(255) not null comment '用户名称',
	constraint table_name_pk
		primary key (id)
);


```