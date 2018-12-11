import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        AirPlane airPlane = new AirPlane();
        airPlane.setSource("Damascus");
        airPlane.setDestination("Amsterdam");


        Passenger passenger = new Passenger();
        Passenger passenger1 = new Passenger();
        Passenger passenger2 = new Passenger();


        Ticket ticket = new Ticket();
        Ticket ticket1 = new Ticket();
        Ticket ticket2 = new Ticket();


        Seat seat = new Seat();
        Seat seat1 = new Seat();
        Seat seat2 = new Seat();
        Seat seat3 = new Seat();


        passenger.setPaidAmount(300);
        passenger.setName("Samer");
        passenger.setEmailAddress("sam10715@hotmail.com");
        passenger.setTelephoneNumber("09329696327");


        ticket1.setPassenger(passenger1);
        ticket2.setPassenger(passenger2);


        seat.setTravelingClass("Economy");
        seat3.setTravelingClass("Business");
        seat.setId(0);
        seat3.setId(3);
        seat1.setId(1);
        seat2.setId(2);

        List<Seat> allSeat = new ArrayList<>();
        allSeat.add(seat);
        allSeat.add(seat1);
        allSeat.add(seat2);
        allSeat.add(seat3);


        List<Ticket> ticketList = new ArrayList<>();

        ticketList.add(ticket1);
        ticketList.add(ticket2);

        airPlane.setTicketList(ticketList);


        List<Seat> seatList = new ArrayList<>();

        seatList.add(seat2);
        seatList.add(seat1);


        airPlane.setSeatList(seatList);


        LocalDate date1 = LocalDate.of(2018, Month.DECEMBER, 28);
        LocalTime time1 = LocalTime.of(7, 0);
        LocalDateTime timeOfD = LocalDateTime.of(date1, time1);


        LocalDate date2 = LocalDate.of(2018, Month.DECEMBER, 28);
        LocalTime time2 = LocalTime.of(11, 0);
        LocalDateTime timeOfA = LocalDateTime.of(date2, time2);


        LocalDate date = LocalDate.of(2018, Month.DECEMBER, 15);
        LocalTime time = LocalTime.of(0, 0);
        LocalDateTime bookingRequest = LocalDateTime.of(date, time);


        airPlane.setArrivalTime(timeOfA);
        airPlane.setDepartingTime(timeOfD);

        airPlane.setTravelCost(100);
        airPlane.setNumberOfSeats(4);


        BookingLogic.checkBooking(airPlane, "Economy", allSeat);
        BookingLogic.book(airPlane, ticket, bookingRequest, "Economy", passenger, seat);


    }


}
