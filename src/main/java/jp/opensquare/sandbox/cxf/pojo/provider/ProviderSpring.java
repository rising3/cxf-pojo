package jp.opensquare.sandbox.cxf.pojo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProviderSpring {
	
	private ProviderSpring() {
	}
	
	public static void main(String[] args) throws Exception {
		new ClassPathXmlApplicationContext("provider-beans.xml");

		System.out.println("Service ready...");
		Thread.sleep(1000 * 60 * 1);
		System.out.println("Service exiting");
		System.exit(0);
	}
}
