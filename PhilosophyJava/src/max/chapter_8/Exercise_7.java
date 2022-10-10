package max.chapter_8;

public class Exercise_7 {

	public Exercise_7() {
		Music music = new Music();
		Instrument[] orchestra = {
				new Wind(), new Percussion(), new Stringed(),
				new Brass(), new Woodwind(), new Guitar()
		};
		music.tuneAll(orchestra);
	}

	
	public enum Note {
		MIDDLE_C, C_SHARP, B_FLAT;
	}
	
	public class Instrument {
		public void play (Note note) {
			System.out.println("Instrument.play() " + note);
		}
		@Override
		public String toString() {
			return "Instrument";
		}
		public void adjust() {
			System.out.println("Adjusting Instrument");
		}
	}
	public class Guitar extends Instrument {
		@Override
		public void play(Note note) {
			System.out.println("Guitar.play() " + note);
		}
		@Override
		public String toString() {
			return "Guitar";
		}
		@Override
		public void adjust() {
			System.out.println("Adjusting Guitar");
		}
	}
	public class Wind extends Instrument {	
		@Override
		 public void play(Note note) {
			System.out.println("Wind.play() " + note);
		}
		@Override
		public String toString() {
			return "Wind";
		}
		@Override
		public void adjust() {
			System.out.println("Adjusting Wind");
		}
	}
	public class Percussion extends Instrument {
		@Override
		public void play(Note note) {
			System.out.println("Percussion.play() " + note);
		}
		@Override
		public String toString() {
			return "Percussion";
		}
		@Override
		public void adjust() {
			System.out.println("Adjusting Percussion");
		}
	}
	public class Stringed extends Instrument {
		@Override
		public void play(Note note) {
			System.out.println("Stringed.play() " + note);
		}
		@Override
		public String toString() {
			return "Stringed";
		}
		@Override
		public void adjust() {
			System.out.println("Adjusting Stringed");
		}
	}
	public class Brass extends Wind {
		@Override
		public void play(Note note) {
			System.out.println("Brass.play() " + note);
		}
		@Override
		public void adjust() {
			System.out.println("Adjusting Brass");
		}
		@Override
		public String toString() {
			return "Brass";
		}
	}
	public class Woodwind extends Wind {
		@Override
		public void play(Note note) {
			System.out.println("Woodwind.play() " + note);
		}
		@Override
		public String toString() {
			return "Woodwind";
		}
	}
	public class Music {
		public void tune(Instrument instrument) {
			instrument.play(Note.MIDDLE_C);
		}
		public void tuneAll(Instrument[] instruments) {
			for(Instrument i : instruments) {
				System.out.println(i.toString());
			}
		}
	}
}
