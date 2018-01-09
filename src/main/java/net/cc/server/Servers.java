package net.cc.server;

import javax.xml.ws.Endpoint;

import net.cc.helloworldc.HelloWorld;
import net.cc.helloworldc.HelloWorldImpl;


/**
 *
 */
public class Servers
{
	/**
	*
	*/
	public Servers()
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

		final Servers servers = new Servers();
		System.out.println("server start ..." + servers);
	}
}
