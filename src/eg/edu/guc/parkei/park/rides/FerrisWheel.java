package eg.edu.guc.parkei.park.rides;

import java.util.ArrayList;

import eg.edu.guc.parkei.amusers.Amuser;
import eg.edu.guc.parkei.utilities.Effect;
import eg.edu.guc.parkei.utilities.Ticket;

public class FerrisWheel extends FunRide {

	public FerrisWheel() {
		super();
	}

	public FerrisWheel(String name, int duration, int batchSize) {
		super(name, duration, batchSize);
	}

	public boolean eligibleToRide(Amuser amuser) {
		return true;
	}

	public ArrayList<Effect> affects(Amuser amuser) {

		if (!eligibleToRide(amuser)) {
			return null;
		} else {
			ArrayList<Effect> affects = new ArrayList<Effect>();

			if (amuser.getTicket() == Ticket.Micro) {
				affects.add(Effect.Thrilled);
			}

			if (amuser.getTicket() == Ticket.Mini) {
				affects.add(Effect.Happy);

			}
			if (amuser.getTicket() == Ticket.Maxi) {
				affects.add(Effect.Bored);
			}

			return affects;
		}
	}
}
