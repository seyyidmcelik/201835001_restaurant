import java.util.ArrayList;
import java.util.List;

public class BookedTables extends ReservationInfo {
    List<Integer> bookedTables = new ArrayList<Integer>();

    public void addBookedTables(int bookedTable){
        bookedTables.add(Integer.valueOf(bookedTable));
    }

    public String getBookedTables() {
        return "Booked tables are: " + bookedTables;
    }
}
