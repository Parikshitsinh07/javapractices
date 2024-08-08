package springmvc.controller;



import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {
	
	@RequestMapping(path="/home",method=RequestMethod.GET)
	public String home(Model model)
	{
		model.addAttribute("name","Maulik B Parmar");
		return "index";
	}
	
	@RequestMapping("/about")
	public String about()
	{
		
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help()
	{
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("name", "Yasvi");
		modelAndView.addObject("roll", 33);
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(34);
		list.add(35);
		list.add(36);
		list.add(37);
		modelAndView.addObject("marks",list);
		
		
		
		modelAndView.setViewName("help");
		return modelAndView;
		
	}

}
