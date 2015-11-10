
public class Main {

	public static void main(String[] args) {
		/*Node mynode = new Node();
		Node ss = new Node();*/
		Node list = new Node();
		MyList a = new MyList();
		
		a.add(7);
		a.add(10);
		a.remove();
		a.add(20);
		a.add(30);
		a.display();
		
		
		/*list.num=5;
		list.self=list;
		list.next=mynode;
		list.previous=null;
		mynode.num=7;
		mynode.self=mynode;
		mynode.next=ss;
		mynode.previous=list;
		ss.num=10;
		ss.self=ss;
		ss.next=null;
		ss.previous=mynode;*/

		while ( list.next != null)
		{
			System.out.println(list.num);
			list=list.next;
		}
		
		System.out.println("Last element = "+list.num);
	}

}
