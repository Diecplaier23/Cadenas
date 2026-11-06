import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JokerTest {

    @Test
    void comprobarBoleto() {
        assertAll(
                () -> assertTrue(Joker.comprobarBoleto("12345", "23541")),
                () -> assertTrue(Joker.comprobarBoleto("41526", "26514")),
                () -> assertFalse(Joker.comprobarBoleto("12345", "22335")),
                () -> assertFalse(Joker.comprobarBoleto("98750", "69775"))
        );
    }
}