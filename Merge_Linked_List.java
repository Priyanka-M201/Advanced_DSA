//import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Merge_Linked_List {
  public static void main(String[] args){
    Node a=new Node(1);
    a.next=new Node(3);
    a.next.next=new Node(5);
    a.next.next.next=new Node(7);
    Node b=new Node(2);
    b.next=new Node(4);
    b.next.next=new Node(6);
    b.next.next.next=new Node(8);
    Node p1=a;
    Node p2=b;
    Node dummy=new Node(0);
    Node cur=dummy;
    while(p1!=null && p2!=null){
        if(p1.data<p2.data){
            cur.next=p1;
            cur=cur.next;
            p1=p1.next;
        }
        else{
            cur.next=p2;
            cur=cur.next;
            p2=p2.next;
        }
    }
    Node result=dummy.next;
    while(result!=null){
        System.out.print(result.data+" ");
        result=result.next;
    }
  }  
}
