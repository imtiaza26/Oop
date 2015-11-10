package src;
public class counter {

	
	private int count,base;
	public counter(int basevalue)
	{
		base=basevalue;
	}
	public void increment(){

		count++;
		if(count==base){
			reset();
		}
	}
	public void reset(){
		count=0;
	}
	public int viewcount(){
		return count;
	}
}
