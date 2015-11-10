
public class MyList extends Linked_List {
	
	public Node previous = null;
	public Node next = null;
	public Node list;
			
	public void add(int num)
	{
		list = new Node();
		list.num=num;
		list.self=list;
		list.next =next;
		list.previous=previous;
		previous =list;
		next=list;
	}
	public void remove()
	{
		
	}
	public void sort()
	{
		
	}
	public void search()
	{
		
	}
	public void update()
	{
		
	}
	public void display()
	{	
		
		while ( list.next != null)
		{
			System.out.println(list.num);
			list=list.next;
		}
		
		System.out.println("Last element = "+list.num);
	}

}
