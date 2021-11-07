package com.calendareventapimavenjavaspring.calendareventapimavenjavaspringparent.data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.calendareventapimavenjavaspring.calendareventapimavenjavaspringparent.models.Calendar;
import com.calendareventapimavenjavaspring.calendareventapimavenjavaspringparent.models.CalendarEvent;

@Component
public class DataBuilder {
  public List<Calendar> createCalendar() {
		Calendar calendar1 = null;

//		try {
      calendar1 = new Calendar(12345678910L, "Calendar1");
      return Arrays.asList(calendar1);			
//		} catch(ParseException e) {
//			e.printStackTrace();
//			return null;
//		}
	}
	public List<CalendarEvent> createCalendarEvent() {
		CalendarEvent calendarEvent1 = null;

//		try {
			calendarEvent1 = new CalendarEvent(57493728710L, "Daily Standup", LocalDateTime.of(2022, 07, 21, 9, 0, 0), 15, "Meeting Room1");
      return Arrays.asList(calendarEvent1);
//		}
//		catch(ParseException e) {
//			e.printStackTrace();
 //   	return null;
//		}
	}
}
