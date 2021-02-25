package com.codeclan.example.CourseBookingSystem.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity

@Table(name="bookings")
public class Booking {

    @Column(name = "date")
    private String date;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne
    @JoinColumn(name = "course_id")
    @JsonIgnoreProperties({"bookings"})
    private Course course;


    @ManyToOne
    @JoinColumn(name = "customer_id")
    @JsonIgnoreProperties({"bookings"})
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
