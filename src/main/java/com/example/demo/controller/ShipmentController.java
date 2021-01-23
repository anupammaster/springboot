package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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

	@RequestMapping("/saveShipment")
	public String saveShipment(Shipment shipment) {
		repo.save(shipment);
		return "home.jsp";
	}
	
	@RequestMapping("/getShipments")
	@ResponseBody
	public String getShipment() {
		String ret = null;
		ret = repo.findAll().toString();
		return ret;
	}
}
