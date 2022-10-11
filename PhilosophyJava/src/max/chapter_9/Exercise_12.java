package max.chapter_9;

public class Exercise_12 {
	
	public Exercise_12() {
		Adventure adventure = new Adventure();
		Hero hero = new Hero();
		adventure.t(hero);
		adventure.u(hero);
		adventure.v(hero);
		adventure.w(hero);
	}
	
	public interface CanFight {
		void figth();
	}
	public interface CanSwim {
		void swim();
	}
	public interface CanFly {
		void fly();
	}
	public class ActionCharacter {
		public void figth() {
			System.out.println("ActionCharacter.figth");
		}
	}
	public class Hero extends ActionCharacter
	implements CanFight, CanSwim, CanFly {

		@Override
		public void fly() {
			System.out.println("Hero.fly");
		}
		@Override
		public void swim() {
			System.out.println("Hero.swim");
		}
	}
	public class Adventure {
		public void t(CanFight canFight) { canFight.figth();}
		public void u(CanSwim canSwim) { canSwim.swim();}
		public void v(CanFly canFly) { canFly.fly();}
		public void w(ActionCharacter actionCharacter) {
			actionCharacter.figth();
		}
	}
}
