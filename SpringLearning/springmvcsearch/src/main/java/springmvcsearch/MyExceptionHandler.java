package springmvcsearch;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyExceptionHandler {
	//Handling exception in out spring mvc
		@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
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
		}
		
		

}
