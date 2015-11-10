
package src;

public class alarmclock extends clock {
 public int hrset,minset;
 public boolean alarmon;
	public alarmclock(){
		super();
		alarmon=false;
	}
	
	public void setalarm(int hr,int min)
	{
		hrset=hr;minset=min;alarmon=true;
	}
	public void tick(){
		super.tick();
		if((viewhrs()==hrset)&&(viewmins()==minset)&&alarmon){
			{
				System.out.println("ring");
			}
		}
			
	}
		
		
	
}
