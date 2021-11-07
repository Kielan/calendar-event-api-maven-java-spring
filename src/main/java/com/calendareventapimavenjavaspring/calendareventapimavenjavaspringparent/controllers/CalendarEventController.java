package com.calendareventapimavenjavaspring.calendareventapimavenjavaspringparent.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.calendareventapimavenjavaspring.calendareventapimavenjavaspringparent.models.CalendarEvent;
import com.calendareventapimavenjavaspring.calendareventapimavenjavaspringparent.models.CalendarEventRepository;

/*
@RestController indicates that the data returned by each method will be written straight into the response body instead of rendering a template.

test with curl -v localhost:8080/calendars
*/

@RestController
class CalendarEventController {

  private final CalendarEventRepository repository;

  CalendarEventController(CalendarEventRepository repository) {
    this.repository = repository;
  }

  // Aggregate root
  // tag::get-aggregate-root[]
  @GetMapping("/calendar-events")
  List<CalendarEvent> all() {
    return repository.findAll();
  }
  // end::get-aggregate-root[]
}
                  
