import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class FirstServlet extends HttpServlet{
		public void init(){
			//super.init();
			System.out.println("init");
		}
		//FirstServlet.init();
		//@overriding
		public void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException,IOException{
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			String unm=req.getParameter("User");
			String pwd=req.getParameter("PassWord");
			out.println(unm);
			String UserName = req.getHeader("User");
			String PWd = req.getHeader("PassWord"); 
			System.out.println("User is " + UserName + "and  PassWord is " + PWd);
			
		}
	
}