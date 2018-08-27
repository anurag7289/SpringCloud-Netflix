package com.producer.wsh.producer_wsh;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.producer.vo.Student;





@RestController
public class MyProducer {

	@RequestMapping(value="/student", method=RequestMethod.GET)
	@HystrixCommand(fallbackMethod = "getDataFallBack")
	public Student getStudentDetail() {
		System.out.println("-----------------------------------@@@@@@@@@@@@@@@@@@@@@@#### "+"getStudentDetail");
		Student stu=new Student();
		stu.setName("Anurag Kumar Gupta");
		stu.setRoll_no(7);
		stu.setBranch("CSE");
		stu.setAddress("BANGALORE");
		stu.setDob("15 AUG 1947");
		if(stu.getRoll_no()==7) {
			throw new RuntimeException();
		}
		return stu;
	}
	
	public Student getDataFallBack() {
		System.out.println("******************************************************** "+"getDataFallBack");
		
		Student stu=new Student();
		stu.setName("Error");
		stu.setRoll_no(0);
		stu.setBranch("Error");
		stu.setAddress("Error");
		stu.setDob("Error");
		return stu;
	}
}
