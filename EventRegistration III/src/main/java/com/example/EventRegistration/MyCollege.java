package com.example.EventRegistration;

public class MyCollege implements College{


    private String name = "IIT Bombay";
    CollegeEvent event;

    private void init(){
        System.out.println("MyCollege bean created!!");
    }

    private void destroy(){
        System.out.println("MyCollege bean destroyed");
    }

    public void setEvent(CollegeEvent event) {
        this.event = event;
    }

    @Override
    public String getCollegeName() {
        return name;
    }

    @Override
    public CollegeEvent getEvent() {
        return event;
    }

}
