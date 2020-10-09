import java.util.*;

public class Player {

	Collection<Bucket> buckets;
	House house;
	private boolean isHisTurn;

	public boolean getIsHisTurn() {
		return this.isHisTurn;
	}

	/**
	 * 
	 * @param isHisTurn
	 */
	public void setIsHisTurn(boolean isHisTurn) {
		this.isHisTurn = isHisTurn;
	}

}