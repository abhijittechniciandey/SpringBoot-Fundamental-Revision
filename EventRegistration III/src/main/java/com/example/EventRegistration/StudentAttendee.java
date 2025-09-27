package com.example.EventRegistration;

public class StudentAttendee implements Attendee {

    private String name;
    private String department;
    private int batch;

    private void init(){
        System.out.println("StudentAttendee bean created!!");
    }

    @Override
    public void setAttendeeDetails(String name, String department, int batch) {
        this.batch = batch;
        this.department = department;
        this.name = name;
    }

    @Override
    public void printRegistrationConfirmation() {
        System.out.println("Hi " + name + " your registration for Graduation Ceremony is successful");
    }

    @Override
    public String getAttendeeName() {
        return name;
    }

}
