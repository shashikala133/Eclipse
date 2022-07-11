package Riya_bansal;

public class LinkedList {
       private class Node{
    	   int data;
    	   Node next;
       Node(int d){
           data=d;
           next=null;
       }
       
       }
       private Node head;
       //o(1)
       public void addAtFirst(int data) {
    	   Node nn=new Node(data);
    	   nn.next=head;
    	   head=nn;
       }
       
       //print a list-->o(n)
       public void PrintList() {
       Node temp=head;
       while(temp!=null) {
    	   System.out.println(temp.data);
    	   temp=temp.next;
       }
}
       //O(n)
	public void AddAtEnd(int data) {
		Node mn=new Node(data);
		if(head==null) {
			head=mn;
			return;
		}
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=mn;
	}
//O(K)
    public void AddAtMiddle(int index,int data) {
    	if(index<0) {
    		return;
    	}
    	if(index==0) {
    		addAtFirst(data);
    		return;
    	}
	Node nn=new Node(data);
	Node temp=head;
	for(int i=0;i<index-1;i++) {
		temp=temp.next;
	}
	temp.next=nn;
	nn.next=temp.next;
	
}
    //what is the most efficient way of deleting entire linked list -->make head==null;
    //delete from front-->head.next=head
    //delete at the end --> while(temp.next.next!=null){temp=temp.next()}temp.next=null
    //delete at a perticular index-->20 30 40 50 if we want to delete 40 we can traverse (for)
    //till the index less than required then temp=temp.next.next()-->O(n-2)
    
}




