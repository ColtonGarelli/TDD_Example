import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class StringCalculatorTest extends StringCalculator{

    @Test
    void addEmptyStringTest() {
        String testString = "";
        int returned = Add(testString);
        assertEquals(0,returned, "Fail. Add did not return 0 for numbempty string");
    }

    @Test
    public void addOneNumberTest(){
        String testString1 = "1";
        int returned = Add(testString1);
        assertEquals(1,returned,"One number fail.");
        returned = 0;
        String largeTestString = "234892";
        returned = Add(largeTestString);
    }

    @Test
    public void addSmallNumbersTest(){
        String testString = "4,2";
        int returned = Add(testString);
        assertEquals(6,returned,"Add failed to add two small numbers");
        testString = "8,0";
        returned = Add(testString);
        assertEquals(8,returned,"Add failed to add 8 and 0");
    }
    @Test
    public void addLargeNumbersTest(){
        String testString1 = "3039,23412";
        int returned = Add(testString1);
        assertEquals(3039+23412, returned, "Add failed to add two large numbers");

        String testString2 = "5321,0";
        returned = Add(testString1);
        assertEquals(5321, returned, "Add failed to add a large number and 0");

        String testString3 = "9693,24";
        returned = Add(testString1);
        assertEquals(9693+24, returned, "Add failed to add a large number with a small number");




    }

}