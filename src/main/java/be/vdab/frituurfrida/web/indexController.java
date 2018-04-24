package be.vdab.frituurfrida.web;


import java.time.DayOfWeek;
import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import be.vdab.frituurfrida.valueObjects.Adres;
import be.vdab.frituurfrida.valueObjects.Gemeente;

@Controller
@RequestMapping("/")

class indexController {
	
	@GetMapping
	ModelAndView index() {
		String boodschap;
		DayOfWeek weekdag = LocalDate.now().getDayOfWeek();
		if (weekdag.equals(DayOfWeek.TUESDAY) || weekdag.equals(DayOfWeek.THURSDAY)){
			boodschap = "gesloten";
		}
		else {
			boodschap = "open";
		}
		ModelAndView modelandview = new ModelAndView("index", "boodschap", boodschap);
		modelandview.addObject("ongeluksgetal", 13);
		modelandview.addObject(new Adres("Zandwege", 4, new Gemeente("Varsenare", 8490)));
		
		return modelandview;
	}
	

}
