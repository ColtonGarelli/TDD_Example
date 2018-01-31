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
    void addOneNumber(){
        String testString1 = "1";
        int returned = Add(testString1);
        assertEquals(1,returned,"One number fail.");
    }

    @Test
    void addSmallNumbers(){


    }
    @Test
    void addLargeNumbers(){

    }
}