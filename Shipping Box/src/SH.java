
public class SH {

	public static void main(String[] args) {
		classes obj1=new classes();
		
		obj1.sname1="Julie";
		obj1.rname1="Jill";
		obj1.sname2="Jim";
		obj1.rname2="John";
		int cpp1=2;
		obj1.weight1=5;
		int cpp2=5;
		obj1.weight2=10;
		
		
		
		System.out.println("Sender: "+obj1.sname1);
		System.out.println("Reciever: "+obj1.rname1);
		System.out.println("Weight " + obj1.weight1);
		System.out.println("Shipping Cost " + obj1.shippingcost1(cpp1));
		System.out.println("");
		System.out.println("Sender: "+obj1.sname2);
		System.out.println("Reciever: "+obj1.rname2);
		System.out.println("Weight " + obj1.weight2);
		System.out.println("Shipping Cost " + obj1.shippingcost2(cpp2));

		
	}

}
