package com.ismail.College_Course.Repository;


import com.ismail.College_Course.Model.College;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollegeRepository extends JpaRepository<College,Long> {

}
