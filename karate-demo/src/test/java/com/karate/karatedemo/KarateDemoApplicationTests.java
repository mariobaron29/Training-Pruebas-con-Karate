package com.karate.karatedemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(Karate.class)
@CucumberOptions(features = "classpath:karate")
class KarateDemoApplicationTests {

	@Test
	void contextLoads() {
	}

}
