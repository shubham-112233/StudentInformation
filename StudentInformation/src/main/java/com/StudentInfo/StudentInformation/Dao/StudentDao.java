package com.StudentInfo.StudentInformation.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.StudentInfo.StudentInformation.Entity.Student;

@Repository
public class StudentDao {
@Autowired
SessionFactory sf;

	public List<Student> getallstudent() {
		Session session =sf.openSession();
	Criteria criteria=session.createCriteria(Student.class);
	List <Student>list=criteria.list();
	System.out.println(list);
		return list;
		
		
	}

}
