

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReadCookies
 */
@WebServlet("/ReadCookies")
public class ReadCookies extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReadCookies() {
        super();
        // TODO Auto-generated constructor stub
    }

    public void doGet(HttpServletRequest request,
    		HttpServletResponse response)
    		throws ServletException, IOException
    		{
    		Cookie cookie = null;
    		Cookie[] cookies = null;
    		// Get an array of Cookies associated with this dom ain
    		cookies = request.getCookies();
    		// Set response content type
    		response.setContentType("text/html");
    		PrintWriter out = response.getWriter();
    		String title = "Reading Cookies Example";
    		String docType =
    		"<!doctype htm l public \"-//w3c//dtd html 4.0 " +
    		"transitional//en\">\n";
    		out.println(docType +
    		"<htm l>\n" +
    		"<head><title>" + title + "</title></head>\n" +
    		"<body bgcolor=\"#f0f0f0\">\n" );
    		if( cookies != null ){
    		out.println("<h2> Found Cookies Name and Value</h2>");
    		for (int i = 0; i < cookies.length; i++){
    		cookie = cookies[i];
    		out.print("Name : " + cookie.getName( ) + ", ");
    		out.print("Value: " + cookie.getValue( )+" <br/>");
    		}
    		}else{
    		out.println(
    		"<h2>No cookies founds</h2>");
    		}
    		out.println("</body>");
    		out.println("</htm l>");
    		}

}
