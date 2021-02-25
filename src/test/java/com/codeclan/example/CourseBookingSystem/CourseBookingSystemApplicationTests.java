package com.codeclan.example.CourseBookingSystem;

import com.codeclan.example.CourseBookingSystem.models.Booking;
import com.codeclan.example.CourseBookingSystem.models.Course;
import com.codeclan.example.CourseBookingSystem.models.Customer;
import com.codeclan.example.CourseBookingSystem.repositories.BookingRepository;
import com.codeclan.example.CourseBookingSystem.repositories.CourseRepository;
import com.codeclan.example.CourseBookingSystem.repositories.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.Table;

@SpringBootTest
class CourseBookingSystemApplicationTests {

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Autowired
	CustomerRepository customerRepository;




	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateBookingCourseAndCustomer(){
		Booking booking1 = new Booking("25-02-2021");
		bookingRepository.save(booking1);
		Course course = new Course("intro to python", "Edinburgh", 5);
		courseRepository.save(course);
		Customer customer = new Customer("Andre", "Dunfermline", 29);
		customerRepository.save(customer);
	}

}
