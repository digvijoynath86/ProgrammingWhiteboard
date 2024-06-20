package LinkedList;

public class LinkedList {
	
	Node head;
	
	public void append(int data) {
		if(head==null) {
			head=new Node(data);
			return;
		}
		
		Node current=head;
		while(current.next != null) {
				current=current.next;
		}
		current.next=new Node(data);
	}
	
	public void prepend(int data) {
		if(head==null) {
			head=new Node(data);
			return;
		}
		Node newhead=new Node(data);
		newhead.next=head;
		head=newhead;
		
	}
	
	public void deleteWithValue(int data) {
		if(head==null) {
			return;
		}
		
		if(head.data==data) {
			head=head.next;
			return;
		}
		Node current=head;
		while(current.next !=null) {
			if(current.next.data==data) {
				current.next=current.next.next;
				return;
			}
			current=current.next;
		}
	}

}
