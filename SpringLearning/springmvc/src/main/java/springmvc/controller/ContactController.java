package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	@Autowired
	private UserService userService;
	@ModelAttribute
	public void commonDataForModel(Model m)
	{
		m.addAttribute("Header","Hello from maulik-/contact");
	}
	
	@RequestMapping("/contact")
	public String showForm(Model m)
	{
		
		return "contact";
	}
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String hadleForm(@ModelAttribute User user,Model model)
	{
		
		if(user.getEmail().isBlank())
		{
			return "redirect:/contact";
		}
		
		
		int id=(int)this.userService.createUser(user);
		model.addAttribute("msg", "User Registration Successfull ! with "+id);
		
		return "success";
	}
	

}
/*
 *
 @RequestMapping(path="/processform",method=RequestMethod.POST)
	public String hadleForm(@RequestParam(name="email",required=false) String email,@RequestParam("password") String password,Model model)
	{
		
		
		User user=new User();
		user.setEmail(email);
		user.setPassword(password);
		model.addAttribute("user",user);
		
		return "success";
	}
 * 	
 * 
 */
