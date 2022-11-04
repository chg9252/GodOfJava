package com.example.godofjava;

public class SalaryManager {

    private double MonthSalary;
    private double tax;
    private double WorkTax;
    private double nationalPension;
    private double healthInsurance;


    public static void main(String[] args) {
        SalaryManager salaryManager = new SalaryManager();

        double result = salaryManager.getMonthlySalary(20000000);

        System.out.println("최종 월급은: "+result);
    }

    //
    public double getMonthlySalary(int yearlySalary) {
        double MonthSalary = yearlySalary / 12.0;

        double WorkTax = calculateWorkTax(MonthSalary);
        double nationalPension = calculateNationalPension(MonthSalary);
        double healthInsurance = calculateHealthInsurance(MonthSalary);

        return MonthSalary - (WorkTax + nationalPension + healthInsurance);
    }

    public double calculateWorkTax(double MonthSalary) {
        double WorkTax = MonthSalary * (12.5 / 100.0);
        System.out.println("근로소득세는 " + WorkTax + " 원 입니다.");
        return WorkTax;
    }

    public double calculateNationalPension(double MonthSalary) {
        double nationalPension = MonthSalary * (8.1 / 100.0);
        System.out.println("국민연금은  " + nationalPension + " 원 입니다.");
        return nationalPension;
    }

    public double calculateHealthInsurance(double MonthSalary) {
        double healthInsurance = MonthSalary * (13.5 / 100.0);
        System.out.println("건강보험료는 " + healthInsurance + " 원 입니다.");
        return healthInsurance;
    }


}

