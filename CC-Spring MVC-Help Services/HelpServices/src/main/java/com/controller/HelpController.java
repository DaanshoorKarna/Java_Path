package com.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.HelperBean;
import com.service.HelperService;
//use appropriate annotation to configure HelpController as Controller
@Controller
public class HelpController {
	@Autowired
	private HelperService helpService;
	
	@ModelAttribute("serviceList")
	public Map<String, String> buildState(){
		Map<String, String> map = new HashMap<String, String>();
		map.put("ACService", "ACService");
		map.put("WashingMachineService", "WashingMachineService");
		map.put("RefrigeratorService", "RefrigeratorService");
		
		return map;
		
	}
	
	@RequestMapping(value ="/helpDesk", method = RequestMethod.POST)
	//invoke the service class - calculateTotalCost method.
	public String calculateTotalCost(@ModelAttribute("helper") HelperBean helperBean,ModelMap model) {
		double total = helpService.calculateTotalCost(helperBean);
		model.put("cost",total);
		return "helpdesk";
			    
		}
	@RequestMapping(value ="/showPage", method = RequestMethod.GET)
	public String showPage(@ModelAttribute("helper") HelperBean helperBean) {
		return "showpage";
	}
	
	
	
}
	 	  	    	    	     	      	 	
