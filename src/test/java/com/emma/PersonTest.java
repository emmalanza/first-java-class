package com.emma;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    @Test
    public void testToString() {

        Person person = new Person("Emma", "Lanza", "123456789", 1995);
        
        String expected = "Emma Lanza 123456789 1995";        

        assertEquals(expected, person.toString(), "El método toString no devuelve la cadena esperada");
    }
}
