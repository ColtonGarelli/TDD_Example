import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class StringCalculatorTest extends StringCalculator{

    @Test
    void addEmptyStringTest() {
        String testString = "";
        int sum = Add(testString);
        assertEquals(0,sum, "Fail. Add did not return 0 for numbempty string");
    }

    @Test
    void addOneNumber(){


    }

    @Test
    void addTwoSmallNumbers(){


    }
}