import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertAll;


class LongitudIITest {

    @Test
    void comprueba() {
        assertAll(
                () -> assertTrue(LongitudII.comprueba("hola adiós cena balón pelota", 5)),
                () -> assertFalse(LongitudII.comprueba("hola adiós cena balón pelota gato", 7)),
                () -> assertTrue(LongitudII.comprueba("hola adiós cena balón pelota gato", 4))
        );
    }
}