package com.spring.main;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.exception.InvalidParcelWeightException;
import com.spring.service.CourierService;

public class Driver {

	public static void main(String[] args) {

		double total = 0.0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the courier ID:");
		int id = sc.nextInt();
		System.out.println("Enter the total weight of parcel:");
		int weight = sc.nextInt();
		System.out.println("Enter the city:");
		String city = sc.next();
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		CourierService cs = (CourierService) ctx.getBean("courierService");
		try {
			total = cs.calculateCourierCharge(id, weight, city);
			System.out.println("Total Courier Charge:" + total);
		} catch (InvalidParcelWeightException e) {
			System.out.println(e.getMessage());
		}
	}
}