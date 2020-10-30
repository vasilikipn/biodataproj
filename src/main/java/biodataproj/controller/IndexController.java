package biodataproj.controller;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import biodataproj.service.IndexService;

@Controller
public class IndexController {


	private final Logger logger = LoggerFactory.getLogger(IndexController.class);
	private final IndexService indexService;

	@Autowired
	public IndexController(IndexService homeService) {
		this.indexService = homeService;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Map<String, Object> model) {

		logger.debug("index() is executed");

		model.put("title", indexService.getTitle(""));
		model.put("msg", indexService.getDesc());
		
		return "index";
	}

	@RequestMapping(value = "/hello/{name:.+}", method = RequestMethod.GET)
	public ModelAndView hello(@PathVariable("name") String name) {

		logger.debug("hello() is executed - $name {}", name);

		ModelAndView model = new ModelAndView();
		model.setViewName("index");
		
		model.addObject("title", indexService.getTitle(name));
		model.addObject("msg", indexService.getDesc());
		
		return model;

	}

}
