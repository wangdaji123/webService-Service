package net.cc.helloworldc;

import javax.jws.WebParam;
import javax.jws.WebService;


/**
 *
 */
@WebService
public interface HelloWorld
{
	/**
	 * @param text
	 * @return
	 */
	@SuppressWarnings("javadoc")
	String sayHello(@WebParam(name = "userName") String userName);
}
