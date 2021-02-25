package com.codeclan.example.CourseBookingSystem.components;

import com.codeclan.example.CourseBookingSystem.models.Booking;
import com.codeclan.example.CourseBookingSystem.models.Course;
import com.codeclan.example.CourseBookingSystem.models.Customer;
import com.codeclan.example.CourseBookingSystem.repositories.BookingRepository;
import com.codeclan.example.CourseBookingSystem.repositories.CourseRepository;
import com.codeclan.example.CourseBookingSystem.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CourseRepository courseRepository;
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    BookingRepository bookingRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){

        Booking booking1 = new Booking("25-02-2021");
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("23-02-2021");
        bookingRepository.save(booking2);

        Booking booking3 = new Booking("24-12-2020");
        bookingRepository.save(booking3);

        Booking booking4 = new Booking("12-02-2021");
        bookingRepository.save(booking4);

        Booking booking5 = new Booking("15-01-2021");
        bookingRepository.save(booking5);

        Booking booking6 = new Booking("22-09-2020");
        bookingRepository.save(booking6);

        Booking booking7 = new Booking("23-05-2020");
        bookingRepository.save(booking7);

        Booking booking8 = new Booking("16-05-2020");
        bookingRepository.save(booking8);

        Booking booking9 = new Booking("25-01-2021");
        bookingRepository.save(booking9);


        Course course1 = new Course("intro to python", "Edinburgh", 5);
        courseRepository.save(course1);

        Course course2 = new Course("Intro to Java", "Edinburgh", 4);
        courseRepository.save(course2);

        Customer customer1 = new Customer("Andre", "Dunfermline", 28);
        customerRepository.save(customer1);

        Customer customer2 = new Customer("Jamie", "Falkirk", 27);
        customerRepository.save(customer2);

        Customer customer3 = new Customer("Laura", "Glasgow", 19);
        customerRepository.save(customer3);

        Customer customer4 = new Customer("Bob", "London", 39);
        customerRepository.save(customer4);

        Customer customer5 = new Customer("Greg", "Edinburgh", 29);
        customerRepository.save(customer5);

        Customer customer6 = new Customer("Jane", "Aberdeen", 30);
        customerRepository.save(customer6);

        Customer customer7 = new Customer("Liz", "Dundee", 32);
        customerRepository.save(customer7);

        Customer customer8 = new Customer("Arnold", "Inverness", 48);
        customerRepository.save(customer8);

        booking1.addCustomer(customer1);
        bookingRepository.save(booking1);

        booking2.addCustomer(customer2);
        bookingRepository.save(booking2);

        booking3.addCustomer(customer3);
        bookingRepository.save(booking3);

        booking4.addCustomer(customer4);
        bookingRepository.save(booking4);

        booking5.addCustomer(customer5);
        bookingRepository.save(booking5);

        booking6.addCustomer(customer6);
        bookingRepository.save(booking6);

        booking7.addCustomer(customer7);
        bookingRepository.save(booking7);

        booking8.addCustomer(customer8);
        bookingRepository.save(booking8);

        booking9.addCustomer(customer8);
        bookingRepository.save(booking9);

        booking1.addCourse(course1);
        bookingRepository.save(booking1);
        booking2.addCourse(course2);
        bookingRepository.save(booking2);

        booking3.addCourse(course2);
        bookingRepository.save(booking3);

        booking4.addCourse(course1);
        bookingRepository.save(booking4);

        booking5.addCourse(course1);
        bookingRepository.save(booking5);

        booking6.addCourse(course1);
        bookingRepository.save(booking6);

        booking7.addCourse(course2);
        bookingRepository.save(booking7);

        booking8.addCourse(course2);
        bookingRepository.save(booking8);
        booking9.addCourse(course2);
        bookingRepository.save(booking9);


    }
}
