package com.hibernateSpringLearning.hibernatePart2.InheritanceMapping.SingleTableSta;

import jakarta.persistence.*;

@Entity

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="pmode",discriminatorType = DiscriminatorType.STRING)
public class Payment {
    @Id
    private int Pid;
   private double amount;

    public int getId() {
        return Pid;
    }

    public void setId(int Pid) {
        this.Pid = Pid;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
