package cz.borec.reverseRESTService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	//--- Spring boot servlet solution:
/*	@Bean
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
*/
	
	
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
}
