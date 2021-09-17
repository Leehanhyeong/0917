package ex6;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex6_param
 */
@WebServlet("/Ex6")
public class Ex6_param extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ex6_param() {
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
    	response.setContentType("text/html; charset=utf-8");
    	
    	//파라미터 값들 가져오기
    	String id = request.getParameter("u_id");
		String pw = request.getParameter("u_pw");
		
		//응답을위한 스트림 준비 
		PrintWriter out = response.getWriter();
		
		String inputId ="admin";
		String inputPw ="1234";
		
		if(id.equals(inputId) && pw.equals(inputPw)) {
				out.write("로그인완료");
		}else
				out.write("로그인실패");
		
		
		out.close();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
