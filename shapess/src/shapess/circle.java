package shapess;

public class circle extends shape {
public int radius;

	public circle(int rad){
		super("Circle");
		radius=rad;
		}
	public double area(){
		return 3.142*radius*radius;
	}
	public double perimeter(){
		return 2*3.142*radius;
	}
}
