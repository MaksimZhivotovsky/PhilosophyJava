package max.chapter_7;

public class Exercise_6 {

	public Exercise_6() {
		new Chess();
	}
}
class Game {
	public Game(int i) {
		System.out.println("Game.constract");
	}
}
class BoardGame extends Game {
	public BoardGame(int i) {
		super(i);
		System.out.println("BoardGame.constract");
	}
}
class Chess extends BoardGame {
	public Chess() {
		super(11);
		System.out.println("Chess.constract");
	}
}