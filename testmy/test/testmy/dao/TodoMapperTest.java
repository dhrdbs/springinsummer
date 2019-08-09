package testmy.dao;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import testmy.config.ApplicationConfig;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=ApplicationConfig.class)
public class TodoMapperTest {
	@Autowired
	TodoMapper todoDao;
	@Autowired
	DataSource ds;
	@Test
	public void datasource() {
		System.out.println(ds);
	}
	@Test
	public void getTodo() {
		System.out.println(todoDao.getTodo(1));
	}
}
