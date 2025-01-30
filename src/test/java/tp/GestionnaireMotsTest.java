package tp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GestionnaireMotsTest {

    GestionnaireMots gestionnaireMots;

    @BeforeEach
    void setUp() {
        gestionnaireMots = new GestionnaireMots();

    }

    @Test
    @DisplayName("should add 2 mots")
    void addMot() {
        gestionnaireMots.addMot("Bonjour");
        gestionnaireMots.addMot("Bonsoir");
        assertTrue(gestionnaireMots.containMot("Bonjour"));
        assertTrue(gestionnaireMots.containMot("Bonsoir"));
    }

    @Test
    @DisplayName("Throw IllegalArgumentException when mot is empty")
    void addEmptyMot() {

        assertThrows(IllegalArgumentException.class,
                () -> gestionnaireMots.addMot(""));
    }

    @Test
    @DisplayName("Throw IllegalArgumentException when mot is null")
    void addNullMot() {

        assertThrows(IllegalArgumentException.class,
                () -> gestionnaireMots.addMot(null));
    }


    @Test
    @DisplayName("should remove mot")
    void removeMot() {

        gestionnaireMots.addMot("Bonjour");
        boolean removeMot = gestionnaireMots.removeMot("Bonjour");
        assertTrue(removeMot);
    }
    @Test
    @DisplayName("not remove")
    void notremoveMot() {

        gestionnaireMots.addMot("Bonjour");
        boolean actual = gestionnaireMots.removeMot("Bonsoir");
        assertFalse(actual);
    }

    @Test
    void containMot() {
    }

    @Test
    void countMots() {

        assertEquals(0, gestionnaireMots.countMots());
    }

    @Test
    void clearMots() {
    }
}