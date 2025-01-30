package tp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
        Circle circle;
    @BeforeEach
    void setUp() {
        circle = new Circle();
    }

    @Test
    @DisplayName("when radius is <0")
    void areawithnegatifradius() {
        assertThrows(IllegalArgumentException.class, () -> {
            circle.area(-1);
        });
    }
    @Test
    @DisplayName("when radius >=0")
    void area() {
        double actual=circle.area(3);
        double expected =28.26;
        assertEquals(expected,actual);
    }

}