package com.calendareventapimavenjavaspring.calendareventapimavenjavaspringparent.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Calendar {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String type;
//  @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//  private User user;
//  @OneToMany(cascade = CascadeType.ALL, orphanRemoval=true, fetch = FetchType.LAZY)
//  private List<CalendarEvent> events;

	public Calendar() {
		super();
	}

	public Calendar(Long id, String name/*, User user*/) {
		super();
		this.id = id;
		this.name = name;
//    this.user = user;
	}

	public String getType() {
		return type;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
