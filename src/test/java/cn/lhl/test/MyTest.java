package cn.lhl.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyTest {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MyTest.class);
	
	@Test
	public void test1() {
		System.out.println("测试 stdout");
		LOGGER.error("测试 error");
		LOGGER.warn("测试 warn");
		LOGGER.info("测试 info");
		LOGGER.debug("测试 debug");
	}
}
