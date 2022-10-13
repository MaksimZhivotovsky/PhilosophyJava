package max.chapter_10;

public class Exercise_15 {

	public Exercise_15() {
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
			return new Coin().getGame();
		}
	}
	
	private class CubeImpl implements FactoriGame {

		@Override
		public Game getGame() {
			return new Cube().getGame();
		}
		
	}
	
	private class Coin { // implements Game {
		
		Game getGame() {
			return new Game() {
				@Override
				public void cast() {
					System.out.println("Coin.cast");
				}
			};
		}

//		@Override
//		public void cast() {
//			System.out.println("Coin.cast");
//		}
//		
	}
	private class Cube { // implements Game {

		Game getGame() {
			return new Game() {
				@Override
				public void cast() {
					System.out.println("Cube.cast");
				}
			};
		}
		
//		@Override
//		public void cast() {
//			System.out.println("Cube.cast");
//		}
		
	}
}
