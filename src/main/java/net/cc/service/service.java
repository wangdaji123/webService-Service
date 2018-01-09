package net.cc.service;

import javax.xml.ws.Endpoint;

import net.cc.helloworldc.HelloWorld;
import net.cc.helloworldc.HelloWorldImpl;


/**
 *
 */
public class service
{
	/**
	*
	*/
	public service()
	{

		final HelloWorld hello = new HelloWorldImpl();
		final String address = "http://192.168.10.137:9000/HelloWorld";
		Endpoint.publish(address, hello);
	}

	/**
	 * @param args
	 */
	public static void main(final String[] args)
	{

		final service servers = new service();
		System.out.println("server start ..." + servers);
	}

}
