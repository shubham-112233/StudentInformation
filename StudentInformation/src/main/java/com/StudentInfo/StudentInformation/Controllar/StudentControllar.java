package com.StudentInfo.StudentInformation.Controllar;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.StudentInfo.StudentInformation.Entity.Student;
import com.StudentInfo.StudentInformation.Service.StudentService;

@RestController
public class StudentControllar {
	@Autowired
	private StudentService ss;
	@GetMapping("/alldata")
	public List<Student> getallstudent() {
		return ss.getallstudent();
	}

}
