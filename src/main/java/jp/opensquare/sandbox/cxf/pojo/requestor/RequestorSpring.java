package jp.opensquare.sandbox.cxf.pojo.requestor;


import jp.opensquare.sandbox.cxf.pojo.provider.Hello;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RequestorSpring {

	private RequestorSpring() {
	}
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("requestor-beans.xml");

		Hello client = (Hello)context.getBean("helloService");
		String result = client.sayHi("Apache CXF");
		System.out.println("result: " + result);
		System.exit(0); 		
	}
}
