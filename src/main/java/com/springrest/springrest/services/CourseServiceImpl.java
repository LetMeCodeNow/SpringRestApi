package com.springrest.springrest.services;

import java.util.ArrayList; 
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	List<Course> list;
	
	public CourseServiceImpl() {
		list=new ArrayList<>();
		list.add(new Course(123,"java","this is basic java course"));
		list.add(new Course(234,"python","new python course"));
	}
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}
	@Override
	public Course getCourse(long courseId) {
		Course c=null;
		for(Course course:list) {
			if(course.getId()==courseId) {
				c=course;
				break;
			}
		}
		return c;
	}
	@Override
	public Course AddCourse(Course course) {
		list.add(course);
		return course;
	}
	

}
