package net.cc.helloworldc;

import javax.jws.WebService;


/**
 *
 */
@WebService(serviceName = "HelloWorld")
public class HelloWorldImpl implements HelloWorld
{

	public String sayHello(final String text)
	{
		// TODO Auto-generated method stub
		System.out.println(text);
		return "say " + text;
	}

	/**
	 * @param args
	 */
	public static void main(final String[] args)
	{
		System.out.println("Êä³ö");
	}

}
