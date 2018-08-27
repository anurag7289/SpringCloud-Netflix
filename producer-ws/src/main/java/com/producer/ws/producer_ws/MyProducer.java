package com.producer.ws.producer_ws;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.producer.vo.Student;

@RestController
public class MyProducer {

	@RequestMapping(value="/student", method=RequestMethod.GET)
	public Student getStudentDetail() {
		Student stu=new Student();
		stu.setName("Anurag Kumar Gupta");
		stu.setRoll_no(7);
		stu.setBranch("CSE");
		stu.setAddress("BANGALORE");
		stu.setDob("15 AUG 1947");
		return stu;
	}
}
