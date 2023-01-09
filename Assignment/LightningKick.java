package com.masai.behavioralDesign.StrategyDesign.Assignment;

public class LightningKick implements KickBehavior{

	@Override
	public void kick() {
		System.out.println("This is a Lightning Kick");
	}

}
