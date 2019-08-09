package testWeb;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class HelloListener
 *
 */
@WebListener
public class HelloListener implements ServletContextListener {

    
    public HelloListener() {
        System.out.println("HelloListener");
    }

	
    public void contextDestroyed(ServletContextEvent arg0)  { 
    	System.out.println("contextDestroyed");
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0)  { 
    	System.out.println("ServletContextEvent");
    }
	
}
