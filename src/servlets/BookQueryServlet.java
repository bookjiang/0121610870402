package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;  
import beans.BookBean; 
import beans.BookDAO;   
/**
 * Servlet implementation class BookQueryServlet
 */
@WebServlet("/BookQueryServlet")
public class BookQueryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookQueryServlet() {
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
		String bookid = request.getParameter("bookid");
		BookDAO bookdao = new BookDAO();
		BookBean book = bookdao.searchBook(bookid);
		System.out.println(bookid);
	     if(book!=null){
	    	 request.getSession().setAttribute("book", book);
	    	 RequestDispatcher view = request.getRequestDispatcher("/display.jsp");
	    	 view.forward(request, response);
	    	 } else {  
	    		 RequestDispatcher view = request.getRequestDispatcher("/errorPage.jsp");
	    		 view.forward(request, response);      
	    		 }  
		doGet(request, response);
	}

}
