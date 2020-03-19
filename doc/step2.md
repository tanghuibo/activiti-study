# 基础配置

## 建库脚本

```sql
-- 用于存放业务相关的表
create database activiti_study_business;
-- 用于存放框架相关的表
create database activiti_study_framework; 
```

### activiti_study_business
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

### activiti_study_framework

#### 创建 activiti.cfg.xml

内容如下:

```xml
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans   http://www.springframework.org/schema/beans/spring-beans.xsd">
    <bean id="processEngineConfiguration" class="org.activiti.engine.impl.cfg.StandaloneProcessEngineConfiguration">
        <property name="jdbcUrl"
                  value="jdbc:mysql://localhost:3306/activiti_study_framework?useUnicode=true&amp;characterEncoding=UTF-8&amp;useJDBCCompliantTimezoneShift=true&amp;useLegacyDatetimeCode=false&amp;serverTimezone=UTC"/>
        <property name="jdbcDriver" value="com.mysql.cj.jdbc.Driver"/>
        <property name="jdbcUsername" value="root"/>
        <property name="jdbcPassword" value="123456"/>
        <property name="databaseSchemaUpdate" value="true"/>
    </bean>
</beans>
```
### 配置文件 ActivitiConfig.java 

```java
package tanghuibo.github.io.activitistudy.config;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author tanghuibo
 * @date 2020/3/20上午12:20
 */
@Configuration
public class ActivitiConfig {

    @Bean
    public ProcessEngine buildProcessEngine() {
        return ProcessEngineConfiguration.createProcessEngineConfigurationFromResourceDefault().buildProcessEngine();
    }
}
```
