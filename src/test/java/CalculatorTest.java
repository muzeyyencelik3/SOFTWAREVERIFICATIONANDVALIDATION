/*   MÜZEYYEN ÇELİK
     B211202351
     HMW2
     SOFTWARE VERIFICATION AND VALIDATION
     https://github.com/muzeyyencelik3/SOFTWAREVERIFICATIONANDVALIDATION
     https://github.com/muzeyyencelik3

    */




import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

   @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @ParameterizedTest
    @CsvSource({"18, 3, 6", "16.5, 3, 5.5", "25, 2.5, 10","48.5, 3.5, 13","27, 4, 6.75", })
    void dataDrivenDivide(double a, double b, int expectedValue) {

        assertEquals(expectedValue, Calculator.divide(a, b),
                "The result of Calculator.divide method is incorrect.");

    }

    @Test
    void testDivision1(){
        assertEquals(6, Calculator.divide(18,3));
    }

    @Test
    void testDivision2(){
        assertEquals(5.5, Calculator.divide(16.5,3));

    }

    @Test
    void testDivision3(){
        assertEquals(10, Calculator.divide(25,2.5));

    }

    @Test
    void testDivision4(){
        assertEquals(13, Calculator.divide(48.5,3.5));

    }
    @Test
    void testDivision5() {
       assertEquals(6.75, Calculator.divide(27,4));
    }

    @Test
    void testDivision6(){

        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> Calculator.divide(24, 0),
                "Should see IllegalArgumentException"
        );
    }


}