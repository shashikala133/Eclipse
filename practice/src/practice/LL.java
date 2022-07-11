package practice;

public class LL {
   private class Node{
	   int data;
	   Node next;
	   
	   Node(int d){
		   data=d;
		   next=null;
	   }
	  
	   
   }
   private Node head;
   public void addAtFirst(int data) {
	   
	   Node nn=new Node(data);
	   nn.next=head;;
	   head=nn;
   }
   public void printList() {
	   Node temp=head;
	   while(temp!=null) {
		   System.out.println(temp.data);
		   temp=temp.next;
	   }
   }
   public void addAtLast(int data) {
	   Node nn=new Node(data);
	   if(head==null) {
		   head=nn;
		   return;
	   }
	  
	   Node temp=head;
	   while(temp.next!=null) {
		   temp=temp.next;
	   }
	   temp.next=nn;
   }
   public void addAtMiddle(int idx,int data) {
	   Node nn=new Node(data);
	   Node temp=head;
	   if(idx<0) {
		   return;
	   }
	   if(idx==0) {
		   addAtFirst(data);
		   return;
	   }
	   for(int i=0;i<idx-1;i++) {
		   temp=temp.next;
	   }
	   temp.next=nn;
	   nn.next=temp.next;
   }
   public void deletefront() {
	   head=head.next;
   }
   public void deleteAtlast() {
	   
	   Node temp=head;
	   while(temp.next.next!=null) {
		   temp=temp.next;
	   }
	   temp.next=null;
   }
   public void deleteAtMiddle(int idx) {
	   Node temp=head;
	   for(int i=0;i<idx-1;i++) {
		   temp=temp.next;
	   }
	   Node temp2=temp.next.next;
	   temp.next=temp2;
   }
   public static void main(String[] args) {
	   
	  LL l=new LL();
	  l.addAtFirst(20);
	  l.addAtFirst(30);
	  l.addAtFirst(40);
	  l.addAtFirst(50);
	  l.printList();
	  l.deletefront();
	  l.printList();
   }
  
}
