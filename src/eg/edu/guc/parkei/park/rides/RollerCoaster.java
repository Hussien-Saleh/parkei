package eg.edu.guc.parkei.park.rides;

import java.util.ArrayList;

import eg.edu.guc.parkei.amusers.Amuser;
import eg.edu.guc.parkei.exceptions.CannotBoardException;

import eg.edu.guc.parkei.exceptions.UnsuitableAgeCategoryException;
import eg.edu.guc.parkei.exceptions.UnsuitableHeightException;
import eg.edu.guc.parkei.utilities.Effect;
import eg.edu.guc.parkei.utilities.Ticket;

public class RollerCoaster extends FunRide {

	public RollerCoaster() {
		super();
	}

	public RollerCoaster(String name, int duration, int batchSize) {
		super(name, duration, batchSize);
	}

	public boolean eligibleToRide(Amuser amuser) throws CannotBoardException {
		if (amuser.getAge() < 4) {
			throw new UnsuitableAgeCategoryException("Sorry");
		}

		if (amuser.getTicket() == Ticket.Maxi) {
			return true;
		}
		if (amuser.getTicket() == Ticket.Mini) {
			if (amuser.getAge() > 60) {
				throw new UnsuitableAgeCategoryException("Sorry");
			} else {
				if (amuser.getHeight() > 140) {
					return true;
				} else {
					throw new UnsuitableHeightException("Sorry");

				}
			}

		}

		return false;
	}

	public ArrayList<Effect> affects(Amuser amuser) {

		ArrayList<Effect> affects = new ArrayList<Effect>();
		if (amuser.getTicket() == Ticket.Mini) {
			affects.add(Effect.Sick);

		}
		if (amuser.getTicket() == Ticket.Maxi) {
			affects.add(Effect.High);
		}
		return affects;
	}

}