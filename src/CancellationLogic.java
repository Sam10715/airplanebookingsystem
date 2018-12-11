import java.util.List;

public class CancellationLogic {


    public static List cancel(Ticket ticket, AirPlane airPlane) {
        ticket.setPassenger(null);

        airPlane.getTicketList().remove(ticket);
        airPlane.getSeatList().remove(ticket.getSeat());
        ticket.setSeat(null);


        return airPlane.getTicketList();


    }
}
