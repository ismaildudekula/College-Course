package com.ismail.College_Course.Service;


import com.ismail.College_Course.Model.College;
import com.ismail.College_Course.Repository.CollegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollegeService {

    @Autowired
    private CollegeRepository collegeRepository;

    public List<College> getCollegeList(){
        return collegeRepository.findAll();
    }

    public College getCollegeById(Long id){
        return collegeRepository.findById(id).orElse(null);
    }

}
