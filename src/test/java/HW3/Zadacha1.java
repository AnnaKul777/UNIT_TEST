package HW3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Zadacha1 {
    /**
     * Тестируем корректность четного числа
     * ожидаем получить от метода evenOddNumber - true
     */
    @Test
    void checkEvenNumber() {
        assertTrue(Zadacha.evenOddNumber(4));
    }
}
/**
 * Тестируем корректность четного числа
 * ожидаем получить от метода evenOddNumber - false
 */
