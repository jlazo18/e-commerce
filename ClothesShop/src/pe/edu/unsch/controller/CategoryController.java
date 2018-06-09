package pe.edu.unsch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("category")
public class CategoryController {
	
	@RequestMapping(method = RequestMethod.GET)
	 public String category(ModelMap modelMap) {
	  modelMap.put("title", "Category");
	  return "home.category";
	 }

}
