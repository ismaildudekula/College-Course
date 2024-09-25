package com.ismail.College_Course.Model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "courses")
//@NoArgsConstructor
//@AllArgsConstructor
@JsonIgnoreProperties({"college", "hibernateLazyInitializer", "handler"})
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String duration;
    private String accommodationType;

    @ManyToOne
    @JoinColumn(name = "college_id")
    private College college;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "course_fee_id", referencedColumnName = "id")
    private CourseFee courseFee;

    public Course() {
    }

    public Course(String name, String duration, String accommodationType) {
        this.name = name;
        this.duration = duration;
        this.accommodationType = accommodationType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getAccommodationType() {
        return accommodationType;
    }

    public void setAccommodationType(String accommodationType) {
        this.accommodationType = accommodationType;
    }

    public College getCollege() {
        return college;
    }

    public void setCollege(College college) {
        this.college = college;
    }

    public CourseFee getCourseFee() {
        return courseFee;
    }

    public void setCourseFee(CourseFee courseFee) {
        this.courseFee = courseFee;
    }
}
