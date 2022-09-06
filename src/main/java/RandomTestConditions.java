public class RandomTestConditions {
    double taxRate = 0.25;
    String JamaicaAreaCode = "+1876";
    int phoneNumberLength = 11;

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

}