import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradeConverterTest {
    @Test
    void convertUSGradeToDanishGrade() throws Exception {
        assertEquals("A", GradeConverter.convertGradeFromDanishToUS("12"));
        assertEquals("B", GradeConverter.convertGradeFromDanishToUS("10"));
        assertEquals("C", GradeConverter.convertGradeFromDanishToUS("7"));
        assertEquals("D", GradeConverter.convertGradeFromDanishToUS("4"));
        assertEquals("F", GradeConverter.convertGradeFromDanishToUS("00"));
    }

    @Test
    void convertUSGradeToDanishGradeWithException() {
        assertThrows(Exception.class, () -> {
            String x = GradeConverter.convertGradeFromDanishToUS("BLEH");
        });
    }

    @Test
    void convertGradeFromUSToDanish() throws Exception{
        assertEquals("12", GradeConverter.convertGradeFromUSToDanish("A"));
        assertEquals("10", GradeConverter.convertGradeFromUSToDanish("B"));
        assertEquals("7", GradeConverter.convertGradeFromUSToDanish("C"));
        assertEquals("4", GradeConverter.convertGradeFromUSToDanish("D"));
        assertEquals("00", GradeConverter.convertGradeFromUSToDanish("F"));
    }

    @Test
    void convertDanishGradeFromUSGradeWithException() {
        assertThrows(Exception.class, () -> {
            String x = GradeConverter.convertGradeFromUSToDanish("BLEH");
        });
    }
}