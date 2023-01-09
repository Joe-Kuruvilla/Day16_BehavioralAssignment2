package com.masai.behavioralDesign.StrategyDesign.Assignment;

public class Test {
	public static void main(String args[])
	{
		JumpBehavior shortJump = new ShortJump();
		JumpBehavior LongJump = new LongJump();
		KickBehavior tornadoKick = new TornadoKick();
		
		Fighter player1 = new Player1(shortJump,tornadoKick);
		player1.play();
		
		player1.punch();
		player1.kick();
		player1.jump();
	}
}
