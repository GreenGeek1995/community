## 极客社区

## 资料
[Spring 文档](https://spring.io/guides)

[Spring Web](https://spring.io/guides/gs/serving-web-content/)

[es](https://elasticsearch.cn/explore)

[BootStrap](https://v3.bootcss.com/getting-started/)

[Github OAuth](https://developer.github.com/apps/building-oauth-apps/creating-an-oauth-app/)

[Spring](https://docs.spring.io/spring-boot/docs/2.0.0.RC1/reference/htmlsingle/)

[thymeleaf](https://www.thymeleaf.org/)
## 工具
[Git](https://git-scm.com/download)

[Flyway](https://flywaydb.org/)

[lombok](https://projectlombok.org/)
## 脚本
```sql
create table USER
(
	ID INT auto_increment,
	ACCOUNT_ID VARCHAR(100),
	NAME VARCHAR(50),
	TOKEN CHAR(36),
	GMT_CREATE BIGINT,
	GMT_MODIFIED BIGINT,
	constraint USER_PK
		primary key (ID)
);
```
```sql
mvn flyway:migrate
mvn -Dmybatis.generator.overwrite=true mybatis-generator:generate
```