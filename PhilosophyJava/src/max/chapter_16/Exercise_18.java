package max.chapter_16;

import java.util.Arrays;

public class Exercise_18 {

	public Exercise_18() {
		BerylliumSphere[] spheres = new BerylliumSphere[2];
		BerylliumSphere[] berylliumSpheres = new BerylliumSphere[3];
		for(int i= 0; i < spheres.length; i++) {
			spheres[i] = new BerylliumSphere();
		}
		if(spheres.length <= berylliumSpheres.length) {
			System.arraycopy(spheres, 0, berylliumSpheres, 0, spheres.length);
		} else {
			System.arraycopy(spheres, 0, berylliumSpheres, 0, berylliumSpheres.length);

		}
		System.out.println(Arrays.toString(berylliumSpheres));
	}
}
