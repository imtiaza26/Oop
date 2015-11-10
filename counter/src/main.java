package src;
public class main {
public static void main(String [] args){
	int x=0;
	  
	
/*	clock obj1= new clock();
	while(x<=3600)
	{
		x++;
		obj1.tick();
	}*/
	alarmclock obj2= new alarmclock();
	obj2.setalarm(7,15);
	while(x<=(3600*8))
	{
		x++;
		obj2.tick();
	}
}
}
