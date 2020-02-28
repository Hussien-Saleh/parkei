package eg.edu.guc.parkei.amusers;

import eg.edu.guc.parkei.exceptions.WrongAgeException;
import eg.edu.guc.parkei.exceptions.WrongTicketException;
import eg.edu.guc.parkei.utilities.Ticket;

public class Adult extends Amuser implements Rider {

	public Adult() {
		super();

	}

	public Adult(String name, int age, int height) throws WrongAgeException {
		super(name, age, height);
		if (!(getAge() > 14 && getAge() < 60)) {
			throw new WrongAgeException(" Sorry");
		}
	}

	public Ticket getTicket() {
		return Ticket.Maxi;
	}

	public void buyTicket(Ticket ticket) throws WrongTicketException {

		if (ticket != Ticket.Maxi) {
			throw new WrongTicketException("Sorry");
		}
		ticket = Ticket.Maxi;
	}

}
