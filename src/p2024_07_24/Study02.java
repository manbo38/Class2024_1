package p2024_07_24;

interface Soundable {
	String sound();
	
	public class Dog implements Soundable {

		@Override
		public String sound() {
			return "멍멍";
		}
	}
	
	public class Cat implements Soundable {

		@Override
		public String sound() {
			return "야옹";
		}
		
	}

}

public class Study02 {
	private static void printSound(Soundable soundable)	{
		System.out.println(soundable.sound());
	}

	public static void main(String[] args) {
//		printSound(new Cat());
//		printSound(new Dog());
		
	}

}
