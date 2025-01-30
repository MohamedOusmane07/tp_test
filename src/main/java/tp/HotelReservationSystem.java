package tp;

import java.time.LocalDate;
import java.util.List;


public class HotelReservationSystem {

    public LocalDate startDate;
    public LocalDate endDate;
    public Integer guests;
    public String roomType;
    
    

    public List<String> searchRooms(LocalDate startDate, LocalDate endDate, int guests, String roomType) {
        if (startDate == null || endDate == null || guests <= 0 || roomType == null || roomType.isEmpty()) {
            throw new IllegalArgumentException("Invalid input parameters.");
        }
        if (endDate.isBefore(startDate)) {
            throw new IllegalArgumentException("End date must be after start date.");
        }
        // Simulons des chambres disponibles
        List<String> availableRooms = List.of("Room 101", "Room 102", "Room 103");
        return guests <= 3 ? availableRooms : List.of(); // Exemple simple
    }


}
