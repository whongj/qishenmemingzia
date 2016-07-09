package di8zhang;
class Glyph{
	void draw(){
		System.out.println("Glyph.drwa(");
	}
	Glyph(){
		System.out.println("Glyph()before draw"); 
		draw();
		System.out.println("Glyph()after draw"); 
	}
}
class RoundGlyph extends Glyph{
	private int radius =1;
	RoundGlyph(int r)
	{
		radius = r;
		System.out.println("RoundGlyph.RoundGlyph（）.radius="+radius);
	}
	void draw(){
		System.out.println("RoundGlyph.darw(),radius="+radius);
	}
}

public class PolyConstructors {
	public static void main(String[] args)
	{
		new RoundGlyph(5);
		
	}
}
