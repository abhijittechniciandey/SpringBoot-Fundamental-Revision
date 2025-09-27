package com.example.EventRegistration;

import java.util.ArrayList;
import java.util.List;

public class GraduationCeremonyEvent implements CollegeEvent {

    private final String name = "Graduation Ceremony";
    private final String address = "Auditorium";
    private final String time = "10AM";
    private final String date = "12 Nov 2023";
    private int count = 0;
    private Attendee attendee;

    public void setAttendee(Attendee attendee) {
        this.attendee = attendee;
    }

    private void init(){
        System.out.println("Graduation Ceremony bean created!!");
    }

    private void destroy(){
        System.out.println("Graduation Ceremony bean destroyed");
    }


    private final List<Attendee> eventAttendees = new ArrayList<>();

    @Override
    public void registerStudent(Attendee user) {
        eventAttendees.add(user);
        count++;
    }


    @Override
    public List<Attendee> getAllAttendees() {
        return eventAttendees;
    }

    @Override
    public void printEventDetails() {
        System.out.println("The " + name + " details are as follows: " + "\nVenue: " + address + "\nTime: " + time + "\nDate: " + date);
    }

    @Override
    public int getAttendeeCount() {
        return count;
    }
}
