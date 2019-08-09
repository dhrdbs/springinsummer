package kr.ac.skuniv.autoconfigExam;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/app-config.xml")
public class TVTest {
	@Autowired
	TV tv;
	
	@Test
	public void turnOn() {
		tv.turnOn();
	}
	
	@Test
	public void 소리를키우다() {
		tv.소리를키우다();
	}
	
	
}
