package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dao.ShipmentRepo;
import com.example.demo.model.Shipment;

@Controller
public class ShipmentController {

	@Autowired
	private ShipmentRepo repo;

	@RequestMapping("/")
	public String showHome() {
		return "home.jsp";
	}

	@PostMapping(value = "/saveShipment")
	public String saveShipment(Shipment shipment) {
		System.out.println("recieved :: "+shipment);
		repo.save(shipment);
		return "home.jsp";
	}

	@GetMapping(value = "/getShipments")
	public String getShipment() {
		String ret = null;
		ret = repo.findAll().toString();
		return ret;
	}
}
