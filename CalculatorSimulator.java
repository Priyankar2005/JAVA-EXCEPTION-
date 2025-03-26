package org.example;

class CalculatorSimulator {//  TaxCalculator class

    public static void testCase(TaxCalculator taxCalculator,String empName,double empSalary,boolean isIndian){
        try{// Try block to handle exceptions
            double tax = taxCalculator.calculateTax(empName, isIndian, empSalary);// calculate tax
            System.out.println("Tax amount is:- "+tax);
        }catch (CountryNotValidException|EmployeeNameInvalidException|TaxNotEligibleException e){
            System.out.println(e.getMessage());//  exception message
        }
    }
    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator(); // creating object of TaxCalculator class
        testCase(taxCalculator,"rahul",34000,false);//  case 1
        testCase(taxCalculator,"devraj",1000,true);//  case 2
        testCase(taxCalculator,"priyankar",55000,true);//  case 3
        testCase(taxCalculator,"",30000,true);//  case 4
    }
}
