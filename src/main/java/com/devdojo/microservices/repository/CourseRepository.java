package com.devdojo.microservices.repository;

import com.devdojo.microservices.model.Course;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {
}
