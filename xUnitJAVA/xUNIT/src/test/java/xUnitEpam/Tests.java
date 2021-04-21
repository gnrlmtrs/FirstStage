package xUnitEpam;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {
        Calculator calculator;

        @BeforeEach
        public void tetObject() {
            calculator = new Calculator();
        }

        @Test
        public void testSubtract() {
            double expectedValue = 3.0;
            assertEquals(expectedValue, calculator.Subtract(6, 3));
        }

        @Test
        public void testSum() {
            double expectedValue = 6.0;
            assertEquals(expectedValue, calculator.Sum(3, 3));
        }

        @Test
        public void testMultiplication() {
            double expectedValue = 9;
            assertEquals(expectedValue, calculator.Multiplication(3, 3));
        }

        @Test()
        public void testDividingByZero() {
            try {
                calculator.Dividing(2, 0);

            }
            catch (ArithmeticException exception){
                Assert.fail("Dividing By Zero");
            }
        }

        @Test
        public void testDivide() {
            double expectedValue = 1.5;
            assertEquals(expectedValue, calculator.Dividing(3, 2));
        }

        @Test
        public void testForGettingSin() {
            assertEquals(calculator.GetSin(Math.PI), 0, 0.1);
        }

        @Test
        public void testForGettingCos() {
            assertEquals(calculator.GetCos(Math.PI), 1, 0.1);
        }

        @Test
        public void testingFirstDegree() {
            assertTrue(calculator.CarryToTheDegree(2, 0) == 1.0);
        }

        @Test
        public void testCarryingNumIntoDegree() {
            double expectedValue = 8;
            assertEquals(expectedValue, calculator.CarryToTheDegree(2, 3));
        }

        @Test
        public void testCheckingRightPercentage() {
            double expectedValue = 50;
            assertEquals(expectedValue, calculator.GettingPercent(70, 35));
        }

        @Test
        public void testCheckGettingCTan(){
            assertEquals(calculator.GetTan(45), calculator.GetCTan(45));
        }

        @Test
        public void testGettingRottOfNumber() {
            double expectedValue = 2;
            assertEquals(expectedValue, calculator.GetRoot(4));
        }

}
