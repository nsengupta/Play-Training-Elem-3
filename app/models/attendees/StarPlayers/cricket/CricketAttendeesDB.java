package models.attendees.StarPlayers.cricket;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import models.attendees.StarPlayers.SoccerAttendeeRecord;

public class CricketAttendeesDB {
	
	public final Map<String,SoccerAttendeeRecord> attendees= new HashMap<String,SoccerAttendeeRecord>();
	
	public CricketAttendeesDB () {
		
		attendees.put("Gavaskar",     new SoccerAttendeeRecord("Gavaskar","Sunil"));
		attendees.put("Tendulkar",    new SoccerAttendeeRecord("Tendulkar","Sachin"));
		attendees.put("Nikhanj",      new SoccerAttendeeRecord("Nikhanj","Kapil Dev"));
		
	}
	
	public List<String> getAll() {
		
		List<String> players = new ArrayList<String>();
		
		for (Entry<String, SoccerAttendeeRecord> s: this.attendees.entrySet()) 
			players.add(s.getValue().toString());
		
		return (players);
	}
	
	public String getBySurname(String sname) {
		
		SoccerAttendeeRecord soccerAttendee = attendees.get(sname);
		if (soccerAttendee == null)
			return ("No player with " + sname+ ", found");
		else 
			return (soccerAttendee.toString());
	}
	
	public int attendeeCount() {
		return (attendees.size());
	}
	
	public Integer addNewAttendee(SoccerAttendeeRecord sa) {
		attendees.put(sa.getLastName(), sa);
		return (attendeeCount());
	}

}
