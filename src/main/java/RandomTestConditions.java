public class RandomTestConditions {
    double taxRate = 0.25;
    String JamaicaAreaCode = "+1876";
    int phoneNumberLength = 11;

    double qualifyingIncomeAfterTax = 600000.0;

    public double calculateSalaryAfterTax(double salary) {
        return salary - (salary * taxRate);
    }

    public double calculateTaxBasedOnSalary(double salary) {
        return salary * taxRate;
    }

    public boolean verifyJamaicanNumber (String phoneNumber) {
        if (phoneNumber.startsWith(JamaicaAreaCode)) return true;
        else if (phoneNumber.startsWith(JamaicaAreaCode) && phoneNumber.length() == phoneNumberLength) return true;
        return false;
    }

    public boolean verifyGmailEmail (String email) {
        if (email.contains("@") && email.endsWith("gmail.com")) return true;
        else return false;
    }

    public boolean upperClassParty(String email, String phoneNumber, double salary) {
        if (!verifyGmailEmail(email)) {
            return false;
        }
        if (!verifyJamaicanNumber(phoneNumber)) {
           return false;
        }
        if (calculateSalaryAfterTax(salary) >= qualifyingIncomeAfterTax) {
            return true;
        }
        return false;
    }



}
