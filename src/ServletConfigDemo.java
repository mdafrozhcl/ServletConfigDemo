import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Enumeration;

public class ServletConfigDemo extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		//Enumeration<String> parameters = getInitParameterNames();
		ServletConfig config = getServletConfig();
		Enumeration parameters=config.getInitParameterNames();
		out.print("<title>Servlet Config</title>");
		while(parameters.hasMoreElements()){
			String s = (String) parameters.nextElement();
			out.print(s+" : "+getInitParameter(s)+"<br>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
