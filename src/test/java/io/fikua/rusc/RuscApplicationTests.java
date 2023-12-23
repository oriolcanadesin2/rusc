package io.fikua.rusc;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class RuscApplicationTests {

	@Mock
	private ApplicationContext context;

	@Test
	void contextLoads() {
		assertNotNull(context, "Application context should not be null");
	}

}
