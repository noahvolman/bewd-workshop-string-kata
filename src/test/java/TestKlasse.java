import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestKlasse {
    @BeforeEach
    public void setup() {
        testCalculator();
    }


    @Test
    void testCalculator() {
        var sut = new StringCalculator();

        var testValue = sut.add("");

        Assertions.assertSame(0, testValue);
    }
}