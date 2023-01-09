package com.masai.behavioralDesign.StrategyDesign.Assignment;

public abstract class Fighter {
	
		JumpBehavior jumpBehavior;
		KickBehavior kickBehavior;
		
		public Fighter(JumpBehavior jumpBehavior, KickBehavior kickBehavior) {
			super();
			this.jumpBehavior = jumpBehavior;
			this.kickBehavior = kickBehavior;
		}
		
		public void punch(){
		System.out.print("Default punch");
		}
		public void roll(){
		System.out.print("Default roll...");
		}
		public void jump(){
		jumpBehavior.jump();
		}
		public void kick(){
		kickBehavior.kick();
		}
		public abstract void play();
}
