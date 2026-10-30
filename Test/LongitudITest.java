import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongitudITest {

    @Test
    void comprueba() {
        assertAll(
                () -> assertEquals(2, LongitudI.comprueba("hola adiós cena balón pelota", 5)),
                () -> assertEquals(3, LongitudI.comprueba("hola adiós cena balón pelota gato", 4)),
                () -> assertEquals(0, LongitudI.comprueba("hola adiós cena balón pelota gato", 7))
        );
    }
}