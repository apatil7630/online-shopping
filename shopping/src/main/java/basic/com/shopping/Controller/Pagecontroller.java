package basic.com.shopping.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Pagecontroller {
	
	@RequestMapping(value= {"/","home","index"})
	public ModelAndView index() {
		
		ModelAndView mv= new ModelAndView("page");
		
		mv.addObject("greeting", "welcome to wev mvc");
		return mv;
	}

}
