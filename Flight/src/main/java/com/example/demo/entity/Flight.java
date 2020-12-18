package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Flight {
	@Id
	private int id;
	private String name;
	private String source;
	private String destination;
	private int duration;

	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Flight(int id, String name, String source, String destination, int duration) {
		super();
		this.id = id;
		this.name = name;
		this.source = source;
		this.destination = destination;
		this.duration = duration;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Flight [id=" + id + ", name=" + name + ", source=" + source + ", destination=" + destination
				+ ", duration=" + duration + "]";
	}

}
