package springmvcsearch;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	@RequestMapping("/home")
	public String home()
	{
		String str=null;
		System.out.println(str.length());
		return "home";
	}
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String query)
	{
		RedirectView redirectView=new RedirectView();
		String url="https://www.google.com/search?q="+query;
		redirectView.setUrl(url);
		return redirectView;
	}
	
	
	@RequestMapping("/user/{userID}/{userName}")
	public String getUserDetails(@PathVariable("userID") int userId,@PathVariable("userName") String name)
	{
		System.out.println(userId);
		System.out.println(name);
		Integer.parseInt(name);
		return "home";
	}
	
	@RequestMapping("/learninterceptor")
	public String learnInterCeptor()
	{
		return "learnintcep";
	}
	
	@RequestMapping("/welcome")
	
	public String welcome(@RequestParam("user") String name ,Model m)
	{
		System.out.println(name);
		m.addAttribute("name",name);
		
		return "welcome";
	}
	
	
	
	//Handling exception in out spring mvc
	/*@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=NullPointerException.class)
	public String exceptionHandlernull(Model m)
	{
		m.addAttribute("msg","NullPointerException has occured !");
		return "null_page";
	}
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=NumberFormatException.class)
	public String exceptionHandlernumber(Model m)
	{
		m.addAttribute("msg","NumberFormatException has occured !");
		return "null_page";
	}
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=Exception.class)
	public String exceptionHandlerGeneric(Model m)
	{
		m.addAttribute("msg","Exception has occured !");
		return "null_page";
	}*/
	
	
	

}
