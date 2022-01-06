package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entity.Course;

@Service
public class CourseServiceImpl implements CourseService {

	List<Course> list;
	 
	@Autowired
	private CourseDao coursedao;
	public CourseServiceImpl() {
//		list = new ArrayList<>();
//		list.add(new Course(145,"Java","This has basics of java"));
//		list.add(new Course(146,"Python", "This has basic of python"));
		
	}
	
	@Override
	public List<Course> getCourse() {
		return coursedao.findAll();
	}

	@Override
	public Course getCourse(long courseId) {
		
//		Course c = null;
//		for(Course course:list) {
//			if(course.getId()==courseId) {
//				c=course;
//				break;
//			}
//		}
		
		return coursedao.getOne(courseId);
	}

	@Override
	public Course addCourse(Course course) {
		
//		list.add(course);
		
		coursedao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
	
//		list.forEach(e ->{
//			if(e.getId()== course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
		coursedao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(Long courseId) {
		
//		list=this.list.stream().filter(e -> e.getId() != courseId).collect(Collectors.toList());
//		Course course = coursedao.getById(courseId);
//		coursedao.delete(course);
		coursedao.deleteById(courseId);
	}

	
}
