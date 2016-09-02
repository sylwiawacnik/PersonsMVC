package pl.sylwia.persons.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.filter.ShallowEtagHeaderFilter;

import pl.sylwia.persons.domain.Form;
import pl.sylwia.persons.domain.ListHistory;
import pl.sylwia.persons.service.PersonService;

@Controller
@Transactional
public class PersonController {

	@Autowired
	private PersonService personService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("form", new Form());
		model.addAttribute("history", personService.showHistory());
		return "home";
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String completeForm(Model model, @Valid Form form, BindingResult bindingResult,HttpServletRequest request) {

		if (bindingResult.hasErrors())
			return "home";

		personService.saveListPersons(form);
		model.addAttribute("history", personService.showHistory());
		return "home";
	}

	@RequestMapping(value = "/clean", method = RequestMethod.POST)
	public String clean(Model model, Form form) {
		return "redirect:/";
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable("id") String id) {
		personService.deleteRecord(Long.valueOf(id));
		return "redirect:/";
	}
	
	@RequestMapping(value="/edit/{id}",method=RequestMethod.GET )
	public String edit(@PathVariable("id") String id, Model model){
		Form form = new Form();
		ListHistory history = personService.getHistory(Long.valueOf(id));
		form.setId(id);
		form.setName(history.getName());
		form.setLastName(history.getLastName());
		form.setCity(history.getCity());
		form.setEmail(history.getEmail());
		form.setNrApartment(history.getNrApartment());
		form.setNrHouse(history.getNrHouse());
		form.setPhone(history.getPhone());
		form.setStreet(history.getStreet());
		form.setZipCode(history.getZipCode());
		
		model.addAttribute("form", form);
		return "edit";
	}
	@RequestMapping(value="/edit/saveEdit", method=RequestMethod.POST)
	public String saveEdit( Model model,@Valid Form form, BindingResult bindingResult ){
		if(bindingResult.hasErrors())
		return "edit";
		personService.editRecord(form);
		return "redirect:/";
	}
	
}
