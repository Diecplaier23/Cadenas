import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongitudIIITest {

    @Test
    void comprueba() {
        assertAll(
                () -> assertTrue(LongitudIII.comprueba("1 22 555", 6)),
                () -> assertFalse(LongitudIII.comprueba("1 22 7777777", 4))
        );
    }
}