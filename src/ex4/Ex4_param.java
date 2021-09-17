package ex4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex4_Param
 */
@WebServlet("/Ex4")
public class Ex4_param extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ex4_param() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//요청시 한글처리
		request.setCharacterEncoding("utf-8");
		
		//응답시 한글처리
		//response.setContentType("text/html; charset=utf-8");
		
		//파라미터 값들 받아오기
		String name = request.getParameter("u_name");
		
		String[] hobby = request.getParameterValues("u_hobby");
	
		
		System.out.println("받은이름 :"+name);
		
		System.out.println("취미 :");
		StringBuffer sb = new StringBuffer();
		for(String n : hobby)
			System.out.println(n+",");
		
		System.out.println(sb.toString());
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
