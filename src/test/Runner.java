package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {
		final String[] configFiles = { "/spring.xml" };
		final ApplicationContext context = new FileSystemXmlApplicationContext(configFiles);

		TestBean bean = context.getBean(TestBean.class);

		bean.doit();
	}

}
