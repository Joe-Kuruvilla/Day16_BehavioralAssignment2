package com.masai.behavioralDesign.StrategyDesign.Assignment;

public class TornadoKick implements KickBehavior{

	@Override
	public void kick() {
		System.out.println("This is a tornado kick");
	}
	
}
