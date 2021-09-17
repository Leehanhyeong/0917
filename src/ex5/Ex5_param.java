package ex5;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex5_param
 */
@WebServlet("/Ex5")
public class Ex5_param extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ex5_param() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//요청
		
		request.setCharacterEncoding("utf-8");
		
		//파라미터 값들 가져오기
		
		String[] name = request.getParameterValues("f_name");
			
		for(String n : name)
			if(n != null && n.trim().length() > 0 && !n.isEmpty())
				//n이 널이아니고 공백아아니고 0보다 작을때
				//n이 비어있지 않을 때 
			System.out.println("친구들 :"+n);
		
		
		String loc = request.getParameter("loc");	
		
		
		System.out.println("사는곳 :"+loc);
	}	
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
