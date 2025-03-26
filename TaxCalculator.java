package org.example;

public class TaxCalculator {
    public double calculateTax(String empName, boolean isIndian, double empSal)throws
            CountryNotValidException , EmployeeNameInvalidException, TaxNotEligibleException {
        if (!isIndian) {              // if the emp is not an Indian citizen
            throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax.");
        }
        if (empName == null || empName.length() == 0) {               // If the employee name is empty
            throw new EmployeeNameInvalidException("The employee name cannot be empty");}

        if (empSal >= 100000) {                    // if the emp salary is greater than or equal to 100000
            return empSal * 0.08;
        } else if (empSal >= 50000) {              // if the emp salary is greater than or equal to 50000
            return empSal * 0.06;
        } else if (empSal >= 30000) {              // if the emp salary is greater than or equal to 30000
            return empSal * 0.05;
        } else if (empSal >= 10000) {             // if the emp salary is greater than or equal to 10000
            return empSal * 0.04;
        } else {        // if the emp salary is less than 10000
            throw new TaxNotEligibleException("The employee does not need to pay tax");
        }
    }

}

