package ex3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex3_param
 */
@WebServlet("/Ex3")
public class Ex3_param extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ex3_param() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//1.요청(request)시 한글처리 - 너머오는 파라미터가 한글이 없다면 안해도 된다.
		request.setCharacterEncoding("utf-8");
		
		//2.응답(response)시 한글처리 MIME TYPE 지정
		response.setContentType("text/html; charset=utf-8");
		
		//3. **ex3_param.html문서로 부터 보내오는 파라미터(u_id,u_pw) name으로 받아야한다.
		String id = request.getParameter("u_id");
		String pw = request.getParameter("u_pw");
		
		//응답을 위한 스트림 준비
		PrintWriter out = response.getWriter();
		
		//응답을 할 문자열 생성
		String msg ="<h1>받은 ID :"+id+", PW :"+pw+"</h1>";
		
		out.print(msg);
		
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
