package tp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class HotelReservationSystemTest {

    HotelReservationSystem hotel;

    @BeforeEach
    public void setUp() {
        hotel = new HotelReservationSystem();
    }

    @Test
    public void testInvalidInput() {

        IllegalArgumentException exception=assertThrows(
                IllegalArgumentException.class,
                ()->hotel.searchRooms(null,null,0,null)
        );
        assertEquals(exception.getMessage(),"Invalid input parameters.");
    }


    @Test
    public void testEndDateBeforeStartDate() {

        IllegalArgumentException exception=assertThrows(
                IllegalArgumentException.class,
                ()->hotel.searchRooms(LocalDate.of(2025,11,23),LocalDate.of(2025,10,23),2,"t")
        );
        assertEquals(exception.getMessage(),"End date must be after start date.");
    }


    @Test
    public void testValidInputButExtendGuest() {


        List<String> actual = List.of();
        List<String> expected = hotel.searchRooms(LocalDate.of(2025,11,23),LocalDate.of(2025,12,23),4,"t");
        assertEquals(expected,actual);

    }
}
