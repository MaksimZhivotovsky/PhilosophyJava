package max.chapter_9;

public class Exercise_19 {

	public Exercise_19() {
		Factori factori = new Factori();
		CoinImpl coinImpl = new CoinImpl();
		CubeImpl cubeImpl = new CubeImpl();
		factori.service(coinImpl);
		factori.service(cubeImpl);
	}
	
	private interface Game {
		void cast();
	}
	
	private interface FactoriGame {
		Game getGame();
	}
	
	private class Factori {
		public void service(FactoriGame factoriGame) {
			Game game = factoriGame.getGame();
			game.cast();
		}
	}
	
	private class CoinImpl implements FactoriGame {

		@Override
		public Game getGame() {
			return new Coin();
		}
	}
	
	private class CubeImpl implements FactoriGame {

		@Override
		public Game getGame() {
			return new Cube();
		}
		
	}
	
	private class Coin implements Game {

		@Override
		public void cast() {
			System.out.println("Coin.cast");
		}
		
	}
	private class Cube implements Game {

		@Override
		public void cast() {
			System.out.println("Cube.cast");
		}
		
	}
}
