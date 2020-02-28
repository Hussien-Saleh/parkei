package eg.edu.guc.parkei.park.rides;

import java.util.ArrayList;

import eg.edu.guc.parkei.amusers.Amuser;
import eg.edu.guc.parkei.amusers.Baby;
import eg.edu.guc.parkei.exceptions.CannotBoardException;

import eg.edu.guc.parkei.exceptions.OutOfOrderException;
import eg.edu.guc.parkei.exceptions.UnsuitableAgeCategoryException;

import eg.edu.guc.parkei.utilities.Effect;
import eg.edu.guc.parkei.utilities.Ticket;

public class WaterRide extends FunRide {

	public WaterRide() {
		super();
	}

	public WaterRide(String name, int duration, int batchSize) {
		super(name, duration, batchSize);
	}

	public boolean eligibleToRide(Amuser amuser) throws CannotBoardException,
			OutOfOrderException {
		if (this.inMaintenance()) {
			throw new OutOfOrderException("Sorry");
		}

		if (amuser instanceof Baby) {
			throw new UnsuitableAgeCategoryException(" Sorry ");
		} else {
			return true;
		}
	}

	public ArrayList<Effect> affects(Amuser amuser) {

		ArrayList<Effect> affects = new ArrayList<Effect>();

		if (amuser.getTicket() == Ticket.Mini) {

			if (amuser.getAge() > 4 && amuser.getAge() < 14) {
				affects.add(Effect.Wet);
				affects.add(Effect.Thrilled);
			} else {

				affects.add(Effect.Wet);
				affects.add(Effect.Angry);

			}
		}

		if (amuser.getTicket() == Ticket.Maxi) {
			affects.add(Effect.Wet);
			affects.add(Effect.Happy);
		}
		return affects;

	}
}
