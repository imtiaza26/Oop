package shapess;

public class rectangle extends shape{
	public int height,length;
	public rectangle (int h,int l){
		super("Rectangle");
		height=h;length=l;
	}
	public rectangle(String name){
		super(name);
	}
	public double area(){
		return length*height;
	}
	public double perimeter(){
		return 2*(length+height);
	}
}
