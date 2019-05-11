package Demo.Embedded_Tomcat;

import java.io.File;

import org.apache.catalina.Context;
import org.apache.catalina.Wrapper;
import org.apache.catalina.startup.Tomcat;

/**
 * Hello world!
 *
 */
public class App 
{
	 public static void main(String[] args) throws Exception
	 {       
			 Tomcat tomcat = new Tomcat();
			 tomcat.setBaseDir("Demo");
			 tomcat.setPort(8080);
	        String Path = "/";
	        Context Continer = tomcat.addContext(Path, new File(".").getAbsolutePath());         
	        String servletName = "ServletDemo";	         
	        Wrapper wrapper =  tomcat.addServlet(Path, servletName, new ServletDemo());      
	        wrapper.setAsyncSupported(true);
	        Continer.addServletMappingDecoded("/hello", servletName);
	        tomcat.start();
	        tomcat.getServer().await();
	    }
}
