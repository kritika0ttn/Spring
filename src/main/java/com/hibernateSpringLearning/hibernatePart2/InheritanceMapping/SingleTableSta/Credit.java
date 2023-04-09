package com.hibernateSpringLearning.hibernatePart2.InheritanceMapping.SingleTableSta;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("cc")
public class Credit extends Payment{
    private String credit;

    public String getCredit() {
        return credit;
    }

    public void setCreditcard(String credit) {
        this.credit = credit;
    }
}