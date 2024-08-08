import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class ArithmeticOpretion extends HttpServlet{
		public void init(){
			//super.init();
			System.out.println("init");
		}
		//FirstServlet.init();
		//@overriding
		public void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException,IOException{
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			double Number1 = Double.parseDouble(req.getParameter("n1"));
			double Number2 = Double.parseDouble(req.getParameter("n2"));
			double ans=0.0;
			String Operation = req.getParameter("opp");
		
			switch(Operation){
				case "add":ans = Number1+Number2;
							break;
				case "sub":ans = Number1-Number2;
							break;
				case "mul":ans = Number1*Number2;
							break;
				case "div":ans = Number1/Number2;
							break;
				default:out.println("");
			}
			out.println("<h1>Two Num "+Operation+" is ="+ans+"</h1>");
			/*
			out.println(unm);
			String UserName = req.getHeader("User");
			String PWd = req.getHeader("PassWord"); 
			System.out.println("User is " + UserName + "and  PassWord is " + PWd);
			*/
		}
	
}