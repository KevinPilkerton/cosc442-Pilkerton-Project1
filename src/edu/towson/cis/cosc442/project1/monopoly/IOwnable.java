package edu.towson.cis.cosc442.project1.monopoly;

public interface IOwnable {

	Player getTheOwner();

	boolean isAvailable();

	void setAvailable(boolean available);

	void setTheOwner(Player owner);

}