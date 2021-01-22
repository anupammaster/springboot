package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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

//	public Shipment getShipmentById(Integer id) {
//		return repo.findById(id).;
//	}
}
