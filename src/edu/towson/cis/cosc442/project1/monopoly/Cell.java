package edu.towson.cis.cosc442.project1.monopoly;
// TODO: Auto-generated Javadoc

/**
 * The Class Cell.
 */
public abstract class Cell implements IOwnable {
	
	/** The name. */
	private String name;
	
	/** The owner. */
	protected Player theOwner;
	
	/** The available. */
	private boolean available = true;

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/* (non-Javadoc)
	 * @see edu.towson.cis.cosc442.project1.monopoly.IOwnable#getTheOwner()
	 */
	@Override
	public Player getTheOwner() {
		return theOwner;
	}
	
	/**
	 * Gets the price.
	 *
	 * @return the price
	 */
	public int getPrice() {
		return 0;
	}

	/* (non-Javadoc)
	 * @see edu.towson.cis.cosc442.project1.monopoly.IOwnable#isAvailable()
	 */
	@Override
	public boolean isAvailable() {
		return available;
	}
	
	/**
	 * Play action.
	 */
	public abstract void playAction();

	/* (non-Javadoc)
	 * @see edu.towson.cis.cosc442.project1.monopoly.IOwnable#setAvailable(boolean)
	 */
	@Override
	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	void setName(String name) {
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see edu.towson.cis.cosc442.project1.monopoly.IOwnable#setTheOwner(edu.towson.cis.cosc442.project1.monopoly.Player)
	 */
	@Override
	public void setTheOwner(Player owner) {
		this.theOwner = owner;
	}
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString() {
        return name;
    }

	/**
	 * Player moved.
	 *
	 * @param player the player
	 * @param playerIndex the player index
	 * @param gameMaster the game master
	 */
	public abstract void playerMoved(Player player, int playerIndex, GameMaster gameMaster);
}
