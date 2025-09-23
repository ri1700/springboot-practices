package ex02;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import ex02.component.MyComponent;

@SpringBootTest
public class MyApplicationTest {
	
	@Test
	public void testMyComponentNotNull(ApplicationContext applicationContext) {
		MyComponent myComponent = applicationContext.getBean("MyComponent", MyComponent.class);
		assertNotNull(myComponent);
	}
}