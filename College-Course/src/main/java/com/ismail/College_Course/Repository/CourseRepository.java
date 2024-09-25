package com.ismail.College_Course.Repository;

import com.ismail.College_Course.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {
}
