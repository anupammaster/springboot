package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Shipment implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8231694488329037616L;

	@Id
	private Integer id;

	private String type;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Shipment [id=" + id + ", type=" + type + "]";
	}

}
