package com.learn.patterns.design.behavioral.mediator.impl2;

import java.util.ArrayList;
import java.util.List;

public interface Mediator {

	void addBuyer(Buyer buyer);
	void findHighestBigger();
}

class AuctionMediator implements Mediator {
	
	private List<Buyer> buyers;
	
	public AuctionMediator() {
		buyers = new ArrayList<>();
	}

	@Override
	public void addBuyer(Buyer buyer) {
		buyers.add(buyer);
	}

	@Override
	public void findHighestBigger() {
		int maxBid = 0;
		Buyer winner = null;
		for (Buyer b : buyers) {
			if (b.price > maxBid) {
				maxBid = b.price;
				winner = b;
			}
			b.auctionHasEnded();
		}
		System.out.println("The auction winner is " + winner.name + 
				". He paid " + winner.price + "$ for the item.");
	}
}
