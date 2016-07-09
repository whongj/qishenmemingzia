package di8zhang;


import java.util.Random;

public class RandomShapeGenerator {
	private Random rand = new Random(47);
	public Shape next(){
		switch(rand.nextInt(3)){
		case 0:System.out.println(rand.nextInt(3));return new Circle();
		case 1:System.out.println(rand.nextInt(3));return new Square();
		case 2:System.out.println(rand.nextInt(3));return new Triangle();
		default:return null;
		}
	}
}
