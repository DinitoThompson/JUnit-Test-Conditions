import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomTestConditionsTest {

    @Test
    void oneMillionDollarSalaryShouldPay250000 () {
        var testConditions = new RandomTestConditions();
        assertEquals(750000, testConditions.calculateSalaryAfterTax(1000000.00));
    }

    @Test
    void taxRateFor1000000SalaryShouldBe250000 () {
        var testConditions = new RandomTestConditions();
        assertEquals(250000.0, testConditions.calculateTaxBasedOnSalary(1000000));
    }

    @Test
    void numbersThatStartWithPlus1876ShouldBeAllowed () {
        var testConditions = new RandomTestConditions();
        assertTrue(testConditions.verifyJamaicanNumber("+18763671273"));
    }

    @Test
    void numbersThatDontStartWithPlus1876ShouldFail () {
        var testConditions = new RandomTestConditions();
        assertFalse(testConditions.verifyJamaicanNumber("+14452343355"));
    }

    String correctEmail = "dinitothompson@gmail.com";
    String incorrectEmail = "dinitothompson@yahoo.com";
    String incorrectEmail2 = "dinitothompson%yahoo.com";

    @Test
    void correctEmailShouldReturnTrue () {
        var textConditions = new RandomTestConditions();
        assertTrue(textConditions.verifyGmailEmail(correctEmail));
    }

    @Test
    void incorrectEmailShouldReturnFalse () {
        var textConditions = new RandomTestConditions();
        assertFalse(textConditions.verifyGmailEmail(incorrectEmail));
    }

    @Test
    void incorrectEmail2ShouldReturnFalse () {
        var textConditions = new RandomTestConditions();
        assertFalse(textConditions.verifyGmailEmail(incorrectEmail2));
    }

}