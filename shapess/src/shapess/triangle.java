package shapess;

public class triangle extends shape {
	int height,base;
	public triangle(int h,int b){
		super("Triangle");
		height=h;base=b;
	}
	public double area(){
		return 0.5*base*height;
	}
	public double perimeter(){
		return height+base;
	}
}
