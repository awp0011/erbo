package learing.springboot.dodo.erbo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import learing.springboot.service.UserService;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootApplication
public class UserServiceTest {
	@Autowired
	private UserService userSerivce;

	@Before
	public void setUp() throws Exception {
		// 准备，清空user表
		userSerivce.deleteAllUsers();
	}

	@Test
	public void test() {
		// 插入5个用户
		userSerivce.create("a", 1);
		userSerivce.create("b", 2);
		userSerivce.create("c", 3);
		userSerivce.create("d", 4);
		userSerivce.create("e", 5);
		// 查数据库，应该有5个用户
		Assert.assertEquals(5, userSerivce.getAllUsers().intValue());
		// 删除两个用户
		userSerivce.deleteByName("a");
		userSerivce.deleteByName("e");
		// 查数据库，应该有5个用户
		Assert.assertEquals(3, userSerivce.getAllUsers().intValue());
	}

}
