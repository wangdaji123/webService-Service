package net.cc.helloworldc;

import javax.jws.WebParam;
import javax.jws.WebService;


/**
 *
 */
@WebService(serviceName = "HelloWorld")
public class HelloWorldImpl implements HelloWorld
{

	public String sayHello(@WebParam(name = "userName") final String userName)
	{
		// TODO Auto-generated method stub
		System.out.println("�ͻ����ύ��Ϣ�� " + userName);
		return "say Hello " + userName;
	}


}
