package pack3;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



/**
 * Servlet implementation class jdtut
 */
public class jdtut extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/world";
			String user = "devUser";
			String pass = "dev1234";
			
			Connection con = DriverManager.getConnection(url, user, pass);
			
			response.getWriter().append(" :: "+con);
			
			String query = "Select * from user;";
			PreparedStatement st = con.prepareStatement(query);
			
			ResultSet res = st.executeQuery();
			
			response.getWriter().append("\n");
			while (res.next()) {
				response.getWriter().append(res.getString("idUser"));
				response.getWriter().append("------->"+res.getString("passWord"));
				response.getWriter().append("\n");
			}
			
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
	}

}
