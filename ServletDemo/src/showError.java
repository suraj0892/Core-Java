

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class showError
 */
@WebServlet("/showError")
public class showError extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public showError() {
        super();
        // TODO Auto-generated constructor stub
    }

 // Method to handle GET method request.
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
              throws ServletException, IOException
    {
        // Set error code and reason.
        response.sendError(407, "Need authentication!!!" );
    }
    // Method to handle POST method request.
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
        throws ServletException, IOException {
       doGet(request, response);
    }

}
