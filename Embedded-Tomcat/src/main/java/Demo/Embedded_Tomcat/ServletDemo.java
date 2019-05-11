package Demo.Embedded_Tomcat;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDemo extends HttpServlet {
	public void service(HttpServletRequest request , HttpServletResponse response) 
	{
		 PrintWriter writer;
		try {
			writer = response.getWriter();
			writer.println("hello World");
		} catch (IOException e) {
			e.printStackTrace();
		}
         
	}

}
