package com.calendareventapimavenjavaspring.calendareventapimavenjavaspringparent.data;

import java.lang.Exception;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.calendareventapimavenjavaspring.calendareventapimavenjavaspringparent.models.Calendar;
import com.calendareventapimavenjavaspring.calendareventapimavenjavaspringparent.models.CalendarEvent;

@Component
public class DataBuilder {
	/*final static private*/
	ArrayList<Calendar> calendars;
	ArrayList<CalendarEvent> calendarEvents;

	public ArrayList<Calendar> createCalendar() {
		Calendar calendar1 = new Calendar(12345678910L, "Calendar1");
		try {
			calendars = new ArrayList<Calendar>(Arrays.asList(calendar1));
			return calendars;
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public ArrayList<CalendarEvent> createCalendarEvent() {
		CalendarEvent calendarEvent1 = new CalendarEvent(57493728710L, "Daily Standup", LocalDateTime.of(2022, 07, 21, 9, 0, 0), 15, "Meeting Room1");
		try {
			calendarEvents = new ArrayList<CalendarEvent>(Arrays.asList(calendarEvent1));
			return calendarEvents;
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
