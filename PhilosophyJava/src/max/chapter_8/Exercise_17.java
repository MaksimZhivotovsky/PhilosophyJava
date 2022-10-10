package max.chapter_8;

public class Exercise_17 {
	
	public Exercise_17() {
		AlterStatus alterStatus = new AlterStatus();
		AlterStatus start = new Statr();
		AlterStatus stop = new Stop();
		AlterStatus turn = new Turn();
		Starship starship = new Starship();
		System.out.println(starship.status(alterStatus));
		System.out.println(starship.status(start));
		System.out.println(starship.status(stop));
		System.out.println(starship.status(turn));
	}

	public class Starship {
		
		public String status(AlterStatus alterStatus) {
			return alterStatus.getStatus();
		}
	}
	public class AlterStatus {

		public String getStatus() {
			return "No Status";
		}
 	}
	public class Statr extends AlterStatus {
		@Override
		public String getStatus() {
			return "Start";
		}
	}
	public class Stop extends AlterStatus {
		@Override
		public String getStatus() {
			return "Stop";
		}
	}
	public class Turn extends AlterStatus {
		@Override
		public String getStatus() {
			return "Turn";
		}
	}
	
}
