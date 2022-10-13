package max.chapter_10;

public class Exercise_12 {

	public Exercise_12() {
		HorrorShow horrorShow = new HorrorShow();
		DragonZilla dragonZilla = new DragonZilla();
		Monster barney = dragonZilla.getMonster();
		horrorShow.u(barney);
//		horrorShow.v(barney);
		VeryBadVampire veryBadVampire = new VeryBadVampire();
		Vampire vlad = veryBadVampire.getVampire();
		horrorShow.u(vlad);
		horrorShow.v(vlad);
		horrorShow.w(vlad);

	}
	
	private interface Monster {
		void menace();
	}
	private interface DangerousMonster extends Monster {
		void destroy();
		}
	private interface Lethal {
		void kill();
		}
	private class DragonZilla { //implements DangerousMonster {
		
		Monster getMonster() {
			return new Monster() {
				@Override
				public void menace() {
					System.out.println("DragonZilla.menace");
				}
			};
		}
 		
//		public void menace() {
//			System.out.println("DragonZilla.menace");
//			getMonster();
//			}
//		public void destroy() {
//			System.out.println("DragonZilla.destroy");
//			}
		}
	private interface Vampire extends DangerousMonster, Lethal {
		void drinkBlood();
		}
	private class VeryBadVampire { //implements Vampire {
//		public void menace() {
//			System.out.println("VeryBadVampire.menace");
//		}
//		public void destroy() {
//			System.out.println("VeryBadVampire.menace");
//		}
//		public void kill() {
//			System.out.println("VeryBadVampire.destroy");
//		}
//		public void drinkBlood() {
//			System.out.println("VeryBadVampire.drinkBlood");
//		}
		Vampire getVampire() {
			return new Vampire() {
				@Override
				public void drinkBlood() {
					System.out.println("VeryBadVampire.drinkBlood");
				}

				@Override
				public void destroy() {
					System.out.println("VeryBadVampire.menace");					
				}

				@Override
				public void menace() {
					System.out.println("VeryBadVampire.menace");					
				}

				@Override
				public void kill() {
					System.out.println("VeryBadVampire.destroy");					
				}
			};
		}

	}
	private class HorrorShow {
		void u(Monster b) { 
			b.menace(); 
			}
		void v(DangerousMonster d) {
			d.menace();
			d.destroy();
			}
		void w(Lethal l) { 
			l.kill();
			}
	}
}
