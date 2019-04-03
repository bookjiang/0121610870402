package beans;
import java.sql.*;
import javax.sql.*;
import javax.naming.*;
import java.util.ArrayList;
import beans.BookBean;
public class BookDAO
{  
	private static InitialContext context= null;
	private DataSource dataSource = null;        

// 根据书号查询图书信息
	public BookBean searchBook(String bookid){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rst = null;
		BookBean  book = new BookBean();
		try{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String dburl = "jdbc:sqlserver://localhost:1433;DatabaseName=bookstore";
			String userName="sa";
			String userPwd="zhiqiang";
			conn = DriverManager.getConnection(dburl, userName, userPwd);
			pstmt = conn.prepareStatement("SELECT * FROM books WHERE bookid=?");
			pstmt.setString(1,bookid);
			rst = pstmt.executeQuery();
			if(rst.next()){
				book.setBookid(rst.getString("bookid"));
				book.setTitle(rst.getString("title"));
				book.setAuthor(rst.getString("author"));
				book.setPublisher(rst.getString("publisher"));
				book.setPrice(rst.getFloat("price"));
				return book;          } 
			else {
				return  null;
				}
			} catch (Exception e){
				return null;} 
		finally {
					try{
						conn.close();
						} catch (SQLException se){
							
						}       } } 
	}
