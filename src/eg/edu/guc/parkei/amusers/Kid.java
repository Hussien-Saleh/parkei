package eg.edu.guc.parkei.amusers;

import eg.edu.guc.parkei.exceptions.WrongAgeException;
import eg.edu.guc.parkei.exceptions.WrongTicketException;
import eg.edu.guc.parkei.utilities.Ticket;

public class Kid extends Amuser implements Rider {

	public Kid() {
		super();

	}

	public Kid(String name, int age, int height) throws WrongAgeException {
		super(name, age, height);
		if (!(getAge() > 4 && getAge() < 14)) {
			throw new WrongAgeException("Sorry");
		}
	}

	public Ticket getTicket() {
		return Ticket.Mini;
	}

	public void buyTicket(Ticket ticket) throws WrongTicketException {
		if (ticket != Ticket.Mini) {
			throw new WrongTicketException(" Sorry");
		}
		ticket = Ticket.Mini;
	}
}
