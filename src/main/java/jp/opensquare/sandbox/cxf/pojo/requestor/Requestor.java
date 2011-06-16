package jp.opensquare.sandbox.cxf.pojo.requestor;


import jp.opensquare.sandbox.cxf.pojo.provider.Hello;

import org.apache.cxf.frontend.ClientProxyFactoryBean;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;

public class Requestor {

	private Requestor() {
	}
	
	public static void main(String[] args) {
		ClientProxyFactoryBean clientfactory = new ClientProxyFactoryBean();
		clientfactory.setServiceClass(Hello.class);
		clientfactory.setAddress("http://localhost:9000/helloService");
		clientfactory.getInInterceptors().add(new LoggingInInterceptor());
		clientfactory.getOutInterceptors().add(new LoggingOutInterceptor());

		Hello client = (Hello)clientfactory.create();
		String result = client.sayHi("Apache CXF");
		System.out.println("result: " + result);
		System.exit(0); 		
	}
}
