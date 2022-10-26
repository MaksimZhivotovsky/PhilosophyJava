package max.chapter_16;

public class Exercise_1 {
	
	private BerylliumSphere[] a;
	private BerylliumSphere[] massiv = {
			new BerylliumSphere(), new BerylliumSphere()
	};
	private BerylliumSphere[] b = new BerylliumSphere[4];
	
	public Exercise_1() {
		a = new BerylliumSphere[] {
				new BerylliumSphere(), new BerylliumSphere()
		};
		exempl(massiv);
		System.out.println();
		exempl(a);
		System.out.println();
		exempl(b);
	}
	
	private void exempl(BerylliumSphere[] spheres) {
		for(int i = 0; i < spheres.length; i++) {
			System.out.print(spheres[i] + "  ");
		}
	}
}
