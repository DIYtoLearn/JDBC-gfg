package com.example.jpaRelationships;
import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.jpaRelationships.entityManyToMany.Course;
import com.example.jpaRelationships.entityManyToMany.Student;
import com.example.jpaRelationships.repoManyToMany.CourseRepository;
import com.example.jpaRelationships.repoManyToMany.StudentRepository;

@Component
public class AppRunner implements CommandLineRunner {
	
	private final CourseRepository courseRepository;
	private final StudentRepository studentRepository;


	public AppRunner(
			CourseRepository courseRepository, StudentRepository studentRepository) {
			
		this.courseRepository = courseRepository;
		this.studentRepository =studentRepository;
	}

	@Override
	public void run(String... args) {
	
		  // 🔹 Many-to-Many
        Course course1 = new Course();
        course1.setTitle("Mathematics");
        courseRepository.save(course1);

        Course course2 = new Course();
        course2.setTitle("Computer Science");
        courseRepository.save(course2);

        Student student = new Student();
        student.setName("David");
        student.setCourses(Arrays.asList(course1, course2));
        studentRepository.save(student);

        System.out.println("Many-to-Many: " + studentRepository.findAll());
    }

}