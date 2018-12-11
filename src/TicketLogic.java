import java.time.LocalDateTime;

public class TicketLogic {


    public static double CalculateTicketPrice(Seat seat, LocalDateTime localDateTime, AirPlane airPlane) {
        double total0 = airPlane.getTravelCost();
        double total = 0;
        double total1 = 0;
        double total2 = 0;
        if (seat.getTravelingClass().equals("Economy")) {

            total = total0 * (0.5);
        } else if (seat.getTravelingClass().equals("Business")) {
            total = total0 * 8;
        }
        if (localDateTime.isAfter(airPlane.getDepartingTime().minusDays(10))) {

            total1 = total0;
        }
        if ((airPlane.getNumberOfSeats() - airPlane.getSeatList().size()) < 10) {

            total2 = total0 * (0.25);

        }
        double total3 = total + total1 + total0 + total2;
        return total3;
    }
}
