package com.hibernateSpringLearning.hibernatePart2.InheritanceMapping.SingleTableSta;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("ch")
public class Check extends Payment{
    private String check;

    public String getCheck() {
        return check;
    }

    public void setCheckcard(String check) {
        this.check = check;
    }
}