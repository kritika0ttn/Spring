package com.hibernateSpringLearning.hibernatePart2.ComponentMapping;

import jakarta.persistence.Embeddable;

@Embeddable
public class Salary {
    public long getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(long basicSalary) {
        this.basicSalary = basicSalary;
    }

    public long getBonusSalary() {
        return bonusSalary;
    }

    public void setBonusSalary(long bonusSalary) {
        this.bonusSalary = bonusSalary;
    }

    public long getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(long taxAmount) {
        this.taxAmount = taxAmount;
    }

    public long getSpecialAllowanceSalary() {
        return SpecialAllowanceSalary;
    }

    public void setSpecialAllowanceSalary(long specialAllowanceSalary) {
        SpecialAllowanceSalary = specialAllowanceSalary;
    }

    private long basicSalary;
    private long bonusSalary;
    private long taxAmount;
    private long SpecialAllowanceSalary;




}
