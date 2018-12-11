import java.time.LocalDateTime;
import java.util.List;

public class BookingLogic {

    public static void checkBooking(AirPlane airPlane, String seatClass, List<Seat> allSeatList) {


        if (airPlane.getNumberOfSeats() > airPlane.getSeatList().size()) {

            for (Seat seat : allSeatList) {

                if (!airPlane.getSeatList().contains(seat)) {
                    if (seat.getTravelingClass().equals(seatClass)) {
                        System.out.println("Booking for Seat: " + seat.getId() + " Is available");

                    } else {
                        System.out.println("Booking for Seat: " + seat.getId() + " Is available for different class");
                    }
                } else {
                    System.out.println("Booking for Seat: " + seat.getId() + " Is not available");
                }

            }

        } else {
            System.out.println("Booking for this flight is not available");
        }

    }

    public static List book(AirPlane airPlane, Ticket ticket, LocalDateTime localDateTime, String seatClass, Passenger passenger, Seat seat1) {
        if (passenger.getPaidAmount() >= TicketLogic.CalculateTicketPrice(seat1, localDateTime, airPlane)) {

            if (airPlane.getNumberOfSeats() > airPlane.getSeatList().size()) {


                if (!airPlane.getSeatList().contains(seat1)) {
                    if (seat1.getTravelingClass().equals(seatClass)) {

                        airPlane.getSeatList().add(seat1);
                        airPlane.getTicketList().add(ticket);
                        ticket.setPassenger(passenger);
                        ticket.setSeat(seat1);
                        System.out.println("Welcome, you have made booking for:");
                        System.out.println("Name: " + passenger.getName());
                        System.out.println("Email: " + passenger.getEmailAddress());
                        System.out.println("Telephone: " + passenger.getTelephoneNumber());
                        System.out.println("your seat number is " + seat1.getId());
                        System.out.println("Your seat class is " + seat1.getTravelingClass());
                        System.out.println("Your ticket price is " + TicketLogic.CalculateTicketPrice(seat1, localDateTime, airPlane));
                        System.out.println("___________________________________________");
                        System.out.println("For the flight from " + airPlane.getSource() + " to " + airPlane.getDestination());
                        System.out.println("Leaving on " + airPlane.getDepartingTime() + " and arriving on " + airPlane.getArrivalTime());


                    } else {
                        System.out.println("Booking for this class in not available");
                    }
                }

            }

        } else {

            System.out.println("Sorry the money is not enough");
        }


        return airPlane.getTicketList();


    }


}
