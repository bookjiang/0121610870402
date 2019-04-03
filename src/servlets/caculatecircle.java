package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import beans.circle;
/**
 * Servlet implementation class caculatecircle
 */
@WebServlet("/caculatecircle")
public class caculatecircle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public caculatecircle() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		double r=Double.parseDouble(request.getParameter("r"));
		circle c=new circle(r);
		double result=c.caculate();
		double result1=c.perimeter();
		request.setAttribute("outputMessage", result);
		request.setAttribute("outputMessage1", result1);
		request.getRequestDispatcher("/output.jsp").forward(request, response);
		
		doGet(request, response);
	}

}
