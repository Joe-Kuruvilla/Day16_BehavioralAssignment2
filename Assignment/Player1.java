package com.masai.behavioralDesign.StrategyDesign.Assignment;

public class Player1 extends Fighter{
	
	public Player1(JumpBehavior jumpBehavior, KickBehavior kickBehavior) {
		super(jumpBehavior, kickBehavior);
	}

	@Override
	public void play() {
		System.out.println("Player 1");
	}
}
