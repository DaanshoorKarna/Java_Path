package com.spring.bo;

import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.Courier;
import com.spring.model.ServiceChargeInfo;
import com.spring.service.CourierService;

public class CourierBO {

	public double calculateCourierCharge(Courier cObj, String city) {

		double courierCharge = 0.0;
		float appropriateServiceCharge = 0;

		ServiceChargeInfo sci = cObj.getServiceCharge();

		Map<String, Float> locationServiceCharge = sci.getLocationServiceCharge();

		for (Map.Entry<String, Float> entry : locationServiceCharge.entrySet()) {
			if (entry.getKey().equals(city)) {
				appropriateServiceCharge = entry.getValue();
			}
		}
		courierCharge = cObj.getWeight() * cObj.getChargePerKg();
		courierCharge += appropriateServiceCharge;
		return courierCharge;
	}

}
