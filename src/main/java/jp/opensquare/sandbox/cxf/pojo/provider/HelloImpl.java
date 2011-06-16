package jp.opensquare.sandbox.cxf.pojo.provider;

public class HelloImpl implements Hello {

	@Override
	public String sayHi(String text) {
		return "Hello, " + text;
	}
}
