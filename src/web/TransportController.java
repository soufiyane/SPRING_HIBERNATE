package web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import metier.ITransportMetier;

@Controller
public class TransportController {
	@Autowired
	private ITransportMetier metier;
	
	@RequestMapping(value = "/index")
	public String index() {
		return "Transport";
	}
	
	@RequestMapping(value = "/chercher")
	public String chercher(@RequestParam(value="motCle")String mc,Model model) {
		model.addAttribute("mc",mc);
		model.addAttribute("marchandises",metier.getMarchandises(mc));
		
		return "Transport";
	}

}
