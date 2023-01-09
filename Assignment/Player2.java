package com.masai.behavioralDesign.StrategyDesign.Assignment;

public class Player2 extends Fighter{

	public Player2(JumpBehavior jumpBehavior, KickBehavior kickBehavior) {
		super(jumpBehavior, kickBehavior);
	}

	@Override
	public void play() {
		System.out.println("Player2");
	}
	


}
