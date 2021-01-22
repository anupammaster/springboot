package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Shipment;

public interface ShipmentRepo extends CrudRepository<Shipment, Integer>{

}
