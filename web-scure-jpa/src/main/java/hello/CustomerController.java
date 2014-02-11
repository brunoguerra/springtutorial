package hello;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerController {

	@Autowired
	CustomerRepository customerRepository;
	
	@RequestMapping("/customers")
	public String index(@RequestParam(required=false) String search, Model model) {
		List<Customer> customers = (List<Customer>) customerRepository.findAll();
		model.addAttribute("customers",	customers);
		return "customers/index";
	}
}
