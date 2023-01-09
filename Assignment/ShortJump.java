package com.masai.behavioralDesign.StrategyDesign.Assignment;

public class ShortJump implements JumpBehavior{

	@Override
	public void jump() {
		System.out.println("This is a short jump");
	}

}
