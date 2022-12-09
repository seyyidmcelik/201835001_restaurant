import java.util.*;

public class ReservationInfo {
    Set<String> reservationInfo = new HashSet<String>();

    public void addReservationInfo(String reservationInfo) {
        this.reservationInfo.add(reservationInfo);
    }

    public String getReservationInfo() {
        String result = "";
        for (String n : this.reservationInfo) {
            result += n;
        }
        return result;
    }
}
