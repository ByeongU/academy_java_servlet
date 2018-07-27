package listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * 이 서블릿 컨텍스트 리스너가 서비스 초기화 시점에
 * 구동이 되기 위해서는 web.xml 에
 * <listener> 엘리먼트로 등록되어야 합니다.
 * 혹은 클래스 작성시 @WebListener 에노테이션으로 등록한다.
 * 
 * 둘 중 한가지만 작성하면 리스너로 작동함
 * @author PC38209
 *
 */
//@WebListener
public class MyListener implements ServletContextListener {
	
	/**
	 * 서블릿 컨텍스트가 초기화될 때
	 * 자동으로 수행되는 초기화 메소드
	 */
	@Override
	public void contextInitialized(ServletContextEvent event) {
		// 1. 이 서비스의 전체 정보를 담는 컨텍스트 객체를 얻음
		ServletContext context;
		context = event.getServletContext();
		
		// 2. context 객체에서 이 서비스 정보를 추출
		// (1) 실제 물리 경로 확인
		String realpath = context.getRealPath("/");
		System.out.println("realpath" + realpath);
		
		// (2) 논리 경로를 확인
		String ctxpath = context.getContextPath();
		System.out.println("context path" + ctxpath);
		
		System.out.println("============================");
		// 3. web.xml 에 작성된 컨텍스트 초기화 파라미터를 추출
		String dao = context.getInitParameter("dao");
		String appName = context.getInitParameter("appName");
		
		System.out.println("dao" + dao);
		System.out.println("appName" + appName);
		
	}
	
	/**
	 * 서블릿 컨텍스트가 종료될 때
	 * 자동으로 수행되는 정리 메소드
	 */
	@Override
	public void contextDestroyed(ServletContextEvent event) {
		// 1. 종료하고 있는  서블릿 컨텍스트 객체를 얻어냄
		ServletContext context = event.getServletContext();
		
		// 2. addName 를  사용하여 종료메시지 출력
		String appName = context.getInitParameter("appName");
		System.out.printf("현재 %s 서비스를 종료합니다.%n", appName);
		
	}


}
