package src;
public class clock {
 
	private counter hours,mins,secs;
	public clock()
	{
		hours = new counter(24);
		mins= new counter(60);
		secs = new counter(60);
		
	}
	public void tick(){
		System.out.println(hours.viewcount()+":"+mins.viewcount()+":"+secs.viewcount());
		secs.increment();
		if(secs.viewcount()==0){
			mins.increment();
			if((secs.viewcount()==0)&&(mins.viewcount()==0))
					hours.increment();
			
		}
	}
		public int viewhrs(){
			return hours.viewcount();
		}
		public int viewmins(){
			return mins.viewcount();
		}
		public int viewsecs(){
			return secs.viewcount();
		}
	}

