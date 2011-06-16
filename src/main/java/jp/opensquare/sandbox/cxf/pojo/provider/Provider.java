package jp.opensquare.sandbox.cxf.pojo.provider;

import org.apache.cxf.frontend.ServerFactoryBean;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;

public class Provider {
	
	private Provider() {
	}

	private void publish() {
		// Create service implementation
		HelloImpl helloCxfImpl = new HelloImpl();

		// Create Server
		ServerFactoryBean serverFactory = new ServerFactoryBean();
		serverFactory.setServiceClass(Hello.class);
		serverFactory.setServiceBean(helloCxfImpl);
		serverFactory.setAddress("http://localhost:9000/helloService");
		serverFactory.getInInterceptors().add(new LoggingInInterceptor());
		serverFactory.getOutInterceptors().add(new LoggingOutInterceptor());

		serverFactory.create();				
	}
	
	public static void main(String[] args) throws Exception {
		new Provider().publish();
		System.out.println("Service ready...");
		Thread.sleep(1000 * 60 * 1);
		System.out.println("Service exiting");
		System.exit(0);
	}
}
