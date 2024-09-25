package com.ismail.College_Course.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "course_fees")
//@NoArgsConstructor
//@AllArgsConstructor
public class CourseFee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double feeAmount;
    private double accommodationFee;  // Fee for accommodation (AC/Non-AC)

    public CourseFee() {
    }

    public CourseFee(double feeAmount, double accommodationFee) {
        this.feeAmount = feeAmount;
        this.accommodationFee = accommodationFee;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(double feeAmount) {
        this.feeAmount = feeAmount;
    }

    public double getAccommodationFee() {
        return accommodationFee;
    }

    public void setAccommodationFee(double accommodationFee) {
        this.accommodationFee = accommodationFee;
    }
}
