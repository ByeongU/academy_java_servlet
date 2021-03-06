package include;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 서블릿 페이지 이동 방식 중 <br/>
 * include 방식을 사용하여 페이지 이동을<br/>
 * 테스트하는 클래스<br/>
 * -----------------------------<br/>
 * include 방식으로 페이지를 이동시키면<br/>
 * 최초의 request, response 가 유지되며 이동한다.<br/>
 * 
 * 이동된 두번째 서블릿의 실행결과를 이 서블릿이 다시 받아서<br/>
 * 이 서블릿이 다시 받아서<br/>
 * 포함하여  여기서 응답을 일으킨다.<br/>
 * @author PC38209
 *
 */
@WebServlet("/include")
public class MyIncludeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request
						 , HttpServletResponse response)
								 throws ServletException, IOException {
		
		// 0. 응답객체 한글 처리
		//    include 방식은 첫 서블릿이 응답하므로
		//    응답 하는 서블릿에서 한글설정이 되지 않으면
		//    한글 처리된 응답을 하지 못한다.
		response.setContentType("text/html; charset=utf-8");
		
		// 1. request 객체에 name 속성을 추가
		request.setAttribute("name", "강병우");
		
		// 2. include 로 next 서블릿 이동을 위하여
		// (1) RequestDispatcher 를 얻어냄
		RequestDispatcher reqd;
		reqd = request.getRequestDispatcher("next");
		
		// (2) 얻어진 dispatcher 객체에 include() 적용
		//     이때, 최초의 request, response 를 전달
		reqd.include(request, response);
	}

}
