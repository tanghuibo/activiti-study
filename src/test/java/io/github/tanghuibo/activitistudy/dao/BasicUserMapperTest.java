package io.github.tanghuibo.activitistudy.dao;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import io.github.tanghuibo.activitistudy.entity.BasicUserDO;

import javax.annotation.Resource;

/**
 * @author tanghuibo
 * @date 2020/3/20上午12:41
 */
@SpringBootTest
class BasicUserMapperTest {

    @Resource
    BasicUserMapper basicUserMapper;

    @Test
    public void testInsert() {
        BasicUserDO user = new BasicUserDO();
        user.setName("hello");
        int insert = basicUserMapper.insert(user);
        assert insert > 0;
    }
}