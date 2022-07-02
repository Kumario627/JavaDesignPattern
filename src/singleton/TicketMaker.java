package singleton;

public class TicketMaker {
    private int ticket = 1000;

    private final static TicketMaker ticketmaker = new TicketMaker();

    private TicketMaker() {

    }

    public int getNextTicketNumber() {
        return ticket++;
    }

    public synchronized TicketMaker getInstance() {
        return ticketmaker;
    }

}
