package com.spring.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bo.CourierBO;
import com.spring.exception.InvalidParcelWeightException;
import com.spring.model.Courier;

public class CourierService {

	private CourierBO cBoObj;

	public CourierBO getcBoObj() {
		return cBoObj;
	}

	public void setcBoObj(CourierBO cBoObj) {
		this.cBoObj = cBoObj;
	}

	public double calculateCourierCharge(int courierId, int weight, String city) throws InvalidParcelWeightException {
		double courierCharge = 0.0;

		if (weight > 0 && weight < 1000) {
			ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
			Courier cb = (Courier) ctx.getBean("courier");
			cb.setWeight(weight);
			cb.setCourierId(courierId);
			courierCharge = cBoObj.calculateCourierCharge(cb, city);
		} else {
			throw new InvalidParcelWeightException("Invalid Parcel Weight");
		}
		return courierCharge;
	}

}