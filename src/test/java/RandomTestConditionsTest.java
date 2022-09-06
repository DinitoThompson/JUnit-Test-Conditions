import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomTestConditionsTest {

    String correctEmail = "dinitothompson@gmail.com";
    String incorrectEmail = "dinitothompson@yahoo.com";
    String incorrectEmail2 = "dinitothompson%yahoo.com";
    String correctPhoneNumber = "+18763671273";
    String incorrectPhoneNumber = "+14452343355";

    double upperClassSalary = 1000000.0;
    double middleClassSalary = 600000.0;
    double lowerClassSalary = 400000.0;

    @Test
    void testSalaryAfterTax_Given1Million_Expect750000 () {
        var testConditions = new RandomTestConditions();
        assertEquals(750000, testConditions.calculateSalaryAfterTax(1000000.00));
    }

    @Test
    void testSalaryBasedOnTax_Given1Million_RateOf25_Expect250000 () {
        var testConditions = new RandomTestConditions();
        assertEquals(250000.0, testConditions.calculateTaxBasedOnSalary(1000000));
    }

    @Test
    void testVerifyJamaicanNumber_GivenCorrectNumber_ExpectTure() {
        var testConditions = new RandomTestConditions();
        assertTrue(testConditions.verifyJamaicanNumber(correctPhoneNumber));
    }

    @Test
    void testVerifyJamaicanNumber_GivenIncorrectNumber_ExpectFalse () {
        var testConditions = new RandomTestConditions();
        assertFalse(testConditions.verifyJamaicanNumber(incorrectPhoneNumber));
    }

    @Test
    void testVerifyGmailEmail_GivenCorrectEmail_ExpectTrue () {
        var textConditions = new RandomTestConditions();
        assertTrue(textConditions.verifyGmailEmail(correctEmail));
    }

    @Test
    void testVerifyGmailEmail_GivenIncorrectEmail_ExpectFalse () {
        var textConditions = new RandomTestConditions();
        assertFalse(textConditions.verifyGmailEmail(incorrectEmail));
    }

    @Test
    void testVerifyGmailEmail_GivenIncorrectEmail2_ExpectFalse () {
        var textConditions = new RandomTestConditions();
        assertFalse(textConditions.verifyGmailEmail(incorrectEmail2));
    }

    @Test
    void testUpperClassParty_GivenValidData_ExpectTrue () {
        var testConditions = new RandomTestConditions();
        assertTrue(testConditions.upperClassParty(correctEmail, correctPhoneNumber, upperClassSalary));
    }

    @Test
    void testUpperClassParty_GivenInvalidPhoneNumber_ExpectFalse () {
        var testConditions = new RandomTestConditions();
        assertFalse(testConditions.upperClassParty(correctEmail, incorrectPhoneNumber, upperClassSalary));
    }

    @Test
    void testUpperClassParty_GivenInvalidSalary_ExpectFalse () {
        var testConditions = new RandomTestConditions();
        assertFalse(testConditions.upperClassParty(correctEmail, correctPhoneNumber, lowerClassSalary));
    }

    @Test
    void testUpperClassParty_GivenInvalidEmail_ExpectFalse () {
        var testConditions = new RandomTestConditions();
        assertFalse(testConditions.upperClassParty(incorrectEmail, correctPhoneNumber, upperClassSalary));
    }

    @Test
    void testCanMiddleClassAttendUpperClassParty_GivenMiddleClassSalary_ExpectFalse () {
        var testConditions = new RandomTestConditions();
        assertFalse(testConditions.upperClassParty(correctEmail, correctPhoneNumber, middleClassSalary));
    }
}