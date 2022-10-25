package max.chapter_15;

import java.util.Iterator;
import java.util.Random;

public class Exercise_8 {
	
	public Exercise_8() {
		StoryCharactersGenerator generator = new StoryCharactersGenerator();
        for (int i = 0; i < 5; i++) {
            System.out.println(generator.next());
        }

        for (StoryCharacters storyCharacter : new StoryCharactersGenerator(5)) {
            System.out.println(storyCharacter);
        }
	}
}

 interface Generator <T> { T next(); }
	
	 class StoryCharacters {
		private static long counter = 0;
		private final long id = counter++;
		public String toString() {
			return getClass().getSimpleName() + "  " + id;
		}
	}
	 class GoodGuys extends StoryCharacters {}
	 class BadGuys extends StoryCharacters {}
	
	 class Actor1 extends GoodGuys {}
	 class Actor2 extends GoodGuys {}
	 class Actor3 extends BadGuys {}
	 class Actor4 extends BadGuys {}
	
	 class StoryCharactersGenerator implements Generator<StoryCharacters>, Iterable<StoryCharacters> {

	    private static Random random = new Random(47);

	    private int size = 0;

	    private Class[] types = {
	            Actor1.class, Actor2.class, Actor3.class,
	            Actor4.class
	    };

	    public StoryCharactersGenerator() {

	    }

	    public StoryCharactersGenerator(int size) {
	        this.size = size;
	    }
	    @Override
	    public StoryCharacters next() {
	        try {
	            return ((StoryCharacters) types[random.nextInt(types.length)].newInstance());
	        } catch (Exception e) {
	            throw new RuntimeException(e);
	        }
	    }

	    @Override
	    public Iterator<StoryCharacters> iterator() {
	        return new Iterator<StoryCharacters>() {
	            int count = size;

	            @Override
	            public boolean hasNext() {
	                return count > 0;
	            }

	            @Override
	            public StoryCharacters next() {
	                count--;
	                return StoryCharactersGenerator.this.next();
	            }
	        };
	    }
	}

