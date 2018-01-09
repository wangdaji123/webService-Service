package net.cc.servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 *
 */
public class myListener implements ServletContextListener
{

	public void contextDestroyed(final ServletContextEvent arg0)
	{
		// TODO Auto-generated method stub

	}

	public void contextInitialized(final ServletContextEvent arg0)
	{
		// TODO Auto-generated method stub
		System.out.println("Æô¶¯Tomcat...");
		final ClassPathXmlApplicationContext act = new ClassPathXmlApplicationContext("/net/cc/service/spring-beans.xml");
	}

}
