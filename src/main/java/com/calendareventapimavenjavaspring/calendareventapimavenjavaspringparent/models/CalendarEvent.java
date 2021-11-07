package com.calendareventapimavenjavaspring.calendareventapimavenjavaspringparent.models;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class CalendarEvent {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String title;
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
  private LocalDateTime eventDateTime;
  private Integer duration;
  private String location;
//  @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//  private LocalDateTime reminderDateTime;
//  private boolean reminderSent;

	public CalendarEvent(){}

  public CalendarEvent(Long id, String title, LocalDateTime eventDateTime, Integer duration, String location) {
		super();
		this.id = id;
		this.title = title;
		this.eventDateTime = eventDateTime;
		this.duration = duration;
		this.location = location;
	}

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public LocalDateTime getEventDateTime() {
    return eventDateTime;
  }

  public void setEventDateTime(LocalDateTime eventDateTime) {
    this.eventDateTime = eventDateTime;
  }
	
	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

//  public LocalDateTime getReminderDateTime() {
//    return reminderDateTime;
//  }

//  public void setReminderDateTime(LocalDateTime reminderDateTime) {
//    this.reminderDateTime = reminderDateTime;
//  }

//  public boolean isReminderSent() {
//    return reminderSent;
//  }

//  public void setReminderSent(boolean reminderSent) {
//    this.reminderSent = reminderSent;
//  };

}
