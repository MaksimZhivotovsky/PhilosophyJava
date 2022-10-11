package max.chapter_9;

public class Exercise_10 {


	public Exercise_10() {
		Music music = new Music();
		Instrument[] orchestra = {
				new Wind(), new Percussion(), new Stringed(),
				new Brass(), new Woodwind()
		};
		music.tuneAll(orchestra);
	}
	
	public enum Note {
		MIDDLE_C, C_SHARP, B_FLAT;
	}
	
	public interface Playable {
		void play (Note note);
	}
	
	public abstract class Instrument implements Playable {
		public abstract void adjust();
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
			System.out.println(this + ".adjusting()");
		}
	}
	public class Percussion extends Instrument {
		@Override
		public void play(Note note) {
			System.out.println(this + ".play() " + note);
		}
		@Override
		public String toString() {
			return "Percussion";
		}
		@Override
		public void adjust() {
			System.out.println(this +".adjusting");
		}
	}
	public class Stringed extends Instrument {
		@Override
		public void play(Note note) {
			System.out.println(this +".play() " + note);
		}
		@Override
		public String toString() {
			return "Stringed";
		}
		@Override
		public void adjust() {
			System.out.println(this +".adjusting");
		}
	}
	public class Brass extends Wind {
		@Override
		public void play(Note note) {
			System.out.println(this +".play() " + note);
		}
		@Override
		public void adjust() {
			System.out.println(this +".adjusting");
		}
		@Override
		public String toString() {
			return "Brass";
		}
	}
	public class Woodwind extends Wind {
		@Override
		public void play(Note note) {
			System.out.println(this +".play() " + note);
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
//				System.out.println(i.toString());
//				System.out.println();
				tune(i);
			}
		}
	}
}
