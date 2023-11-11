import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seminar3.homeWork3.MainHW;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HW3_Test {
    MainHW mainTest;

    @BeforeEach
    void setUp(){
        mainTest = new MainHW();
    }

    @Test
    void evenOddNumberTest() {
        assertTrue(mainTest.evenOddNumber(12));
        assertFalse(mainTest.evenOddNumber(11));
    }
}
