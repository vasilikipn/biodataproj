package biodataproj.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import biodataproj.*;

@Controller
@RequestMapping
public class CollectionController {
  @Autowired 
  private CollectionRep repository;
  @RequestMapping("/collection/{id}")
	public String collection(@PathVariable Long id, Model model) {
		model.addAttribute("collection", repository.findOne(id));
		return "collection";
	}
}