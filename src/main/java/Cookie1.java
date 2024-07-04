

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;


/**
 * Servlet implementation class Cookie1
 */
@WebServlet("Cookie1")
public class Cookie1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cookie1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html");
		String n = request.getParameter("usrid");
		String p = request.getParameter("names");
		PrintWriter out = response.getWriter();
		//Create cookies for user Id and names
		Cookie usrid1 = new Cookie("u1","24360");
		Cookie names1 = new Cookie("n1", "Joan ENGONE");
		int flag = 0;
		String userIds[] = {usrid1.getValue()};
		String names[] = {names1.getValue()};
		for(int i=0;i< userIds.length;i++) {
			if(userIds[i].equals(n) &&  names[i].equals(p)) {
				flag = 1;
				break;
			}
		}
		if(flag==1) {
			out.println("Welcome "+p.toUpperCase());
		}
		else {
			out.println("You are not an authenticated user");
		}
		}
		
}
