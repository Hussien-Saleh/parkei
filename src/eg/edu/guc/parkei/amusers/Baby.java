package eg.edu.guc.parkei.amusers;

import eg.edu.guc.parkei.exceptions.WrongAgeException;
import eg.edu.guc.parkei.exceptions.WrongTicketException;
import eg.edu.guc.parkei.utilities.Ticket;

public class Baby extends Amuser {
	
	public Baby(String name, int age, int height) throws WrongAgeException {
		super(name, age, height);
		if (getAge() > 4 || getAge() < 0) {
			throw new WrongAgeException("Sorry");
		}
	}

	public Baby() {
		super();

	}

	public Ticket getTicket() {
		return Ticket.Micro;
	}

	public void buyTicket(Ticket ticket) throws WrongTicketException {
		if (ticket != Ticket.Micro) {
			throw new WrongTicketException("Sorry");
		}
		ticket = Ticket.Micro;
	}
}
