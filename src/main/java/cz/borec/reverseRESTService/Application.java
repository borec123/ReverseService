package cz.borec.reverseRESTService;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	@Bean
	public ServletRegistrationBean servletRegistrationBean(){
	    return new ServletRegistrationBean(new HttpServlet() {
			private static final long serialVersionUID = 1L;

			@Override
			protected void doPost(HttpServletRequest req, HttpServletResponse resp)
					throws ServletException, IOException {
				
				resp.setContentType("text/plain");

				IOUtils.copy(req.getInputStream(), resp.getOutputStream());
				
			}

			@Override
			protected void doGet(HttpServletRequest req, HttpServletResponse resp)
					throws ServletException, IOException {
				resp.setContentType("text/plain");
				resp.getWriter().write("GET works.");
				resp.getWriter().close();
			}
			
		}
		
		,"/servlet");
	}
	
/*	@Bean
	public Servlet foo() {
	    return new HttpServlet() {
			private static final long serialVersionUID = 1L;

			@Override
			protected void doPost(HttpServletRequest req, HttpServletResponse resp)
					throws ServletException, IOException {
				
				resp.setContentType("text/plain");
				resp.getWriter().write("Done.");
				resp.getWriter().close();
			}
			
		};
	}
*/	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
