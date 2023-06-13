package com.StudentInfo.StudentInformation.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentInfo.StudentInformation.Dao.StudentDao;
import com.StudentInfo.StudentInformation.Entity.Student;

@Service
public class StudentService {
	@Autowired
	 StudentDao sd;

	public List<Student> getallstudent() {
		return sd.getallstudent();

	}

}
