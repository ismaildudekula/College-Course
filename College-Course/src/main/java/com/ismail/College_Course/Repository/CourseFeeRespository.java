package com.ismail.College_Course.Repository;


import com.ismail.College_Course.Model.CourseFee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseFeeRespository extends JpaRepository<CourseFee,Long> {
}
