package com.service;

import org.springframework.context.annotation.Configuration;

import com.model.HelperBean;

//use appropriate annotation to configure HelperService as a Service
@Configuration
public class HelperService {
	
	
	//calculate the totalCost and return the cost
	public double calculateTotalCost(HelperBean helperBean)
	{
		String serviceType = helperBean.getServiceType();
		int noOfHours = helperBean.getNoOfHours();
		double total=0.0;
		
		if(serviceType.equals("ACService"))
		{
			helperBean.setServiceCostPerHour(400);
			double serviceCostPerHour = helperBean.getServiceCostPerHour();
			total = total + (serviceCostPerHour*noOfHours);
		}
		else if(serviceType.equals("WashingMachineService"))
		{
			helperBean.setServiceCostPerHour(500);
			double serviceCostPerHour = helperBean.getServiceCostPerHour();
			total = total + (serviceCostPerHour*noOfHours);
		}
		else if(serviceType.equals("RefrigeratorService"))
		{
			helperBean.setServiceCostPerHour(300);
			double serviceCostPerHour = helperBean.getServiceCostPerHour();
			total = total + (serviceCostPerHour*noOfHours);
		}
		return total;
		
		
	}

}
	 	  	    	    	     	      	 	
