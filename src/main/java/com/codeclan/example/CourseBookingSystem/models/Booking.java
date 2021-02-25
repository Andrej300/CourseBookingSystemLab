package com.codeclan.example.CourseBookingSystem.models;



public class Booking {

    private String date;

    private Long id;

    private Course course;

    private Customer customer;

    public Booking(String date) {
        this.date = date;
    }

    public Booking() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void addCourse(Course course){
        this.course = course;
    }

    public void addCustomer(Customer customer){
        this.customer = customer;
    }
}
