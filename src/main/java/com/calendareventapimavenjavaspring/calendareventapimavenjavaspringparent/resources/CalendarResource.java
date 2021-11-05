package com.calendareventapimavenjavaspring.calendareventapimavenjavaspringparent.resources;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.calendareventapimavenjavaspring.calendareventapimavenjavaspringparent.errors.CalendarNotFoundException;
import com.calendareventapimavenjavaspring.calendareventapimavenjavaspringparent.errors.InvalidRequestException;
import com.calendareventapimavenjavaspring.calendareventapimavenjavaspringparent.models.Calendar;
import com.calendareventapimavenjavaspring.calendareventapimavenjavaspringparent.service.CalendarService;

@RestController
@RequestMapping("/v1")
public class CalendarResource {

  @Autowired
  private CalendarService calendarService;

  @GetMapping("/")
  public String sayHello() {
    return "Welcome to the Calendar REST API!";
  }

  @GetMapping("/calendars/{id}")
  public Calendar retrieveCalendar(@PathVariable long id) throws CalendarNotFoundException
  {
    Calendar calendar = calendarService.retrieveCalendar(id);
    if(calendar == null)
    {
      throw new CalendarNotFoundException("id->" + id);
    }
    else
    {
      return calendar;
    }
  }

  @GetMapping("/calendars")
  public List<Calendar> retrieveAllCalendars() {
    return calendarService.retrieveAllCalendars();
  }

  @PostMapping(value = "/calendars/add")
  public Calendar addCalendar(@RequestBody Calendar calendar) throws InvalidRequestException
  {
    if(/*calendar.getUser() */ calendar != null)
    {
      return calendarService.addCalendar(calendar);
    }
    else
    {
      throw new InvalidRequestException("Provide user details to create a calendar.");
    }
  }

  @PutMapping(value = "/calendars/update")
  public Calendar updateCalendar(@RequestBody Calendar calendar) throws InvalidRequestException
  {
    Calendar updated = calendarService.updateCalendar(calendar);
    if(updated != null)
    {
      return updated;
    }
    else
    {
      throw new CalendarNotFoundException("id->" + calendar.getId());
    }
  }

  @DeleteMapping(value = "/calendars/delete")
  public void deleteCalendar(@RequestBody Calendar calendar) {
    calendarService.deleteCalendar(calendar);
  }
}
