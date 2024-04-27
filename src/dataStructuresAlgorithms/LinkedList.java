package dataStructures.LinkedList;

import java.util.HashSet;
import java.util.Set;

import static java.lang.System.in;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node {

        int value;
        Node next;

        Node (int value){
            this.value = value;
        }
    }
    public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList(){
        Node temp = head;
        while (temp!=null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void append(int value){
        Node newNode = new Node(value);
        if (length == 0){
            head = newNode;
            tail = newNode;
        }else {
            tail.next= newNode;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast(){
        if (length == 0) return null;
        Node temp =head;
        Node pre = head;
        while(temp.next!=null){
            pre =temp;
            temp=temp.next;
        }
        tail = pre;
        tail.next=null;
        length--;
        if (length ==0 ){
            head = null;
            tail = null;
        }
        return temp;
    }

    public void prepend(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail  = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        ++length;

    }

    public Node removeFirst(){
        if (length == 0)return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if(length == 0){
            head =null;
            tail =null;
        }
        return temp;
    }

    public Node get(int index){
        if (index < 0 || index>=length){
            return null;
        }
        Node temp =head;
        for (int i =0;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }

    public boolean insert(int index, int value){
        if(index>length || index<0) return false;
        if (index==0){
            prepend(value);
            return true;
        }
        if (index==length){
            append(value);
            return true;
        }
        Node temp = get(index-1);
        Node newNode  = new Node(value);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    public boolean set(int index, int value){
        Node temp =get(index);
        if(temp!=null){
            temp.value = value;
            return true;
        }
        return false;
    }

    public Node remove(int index){
        if (index<0 || index>length-1) return null;
        if(index==0)return removeFirst();
        if(index==length-1)return removeLast();
        Node prev = get(index-1);
        Node temp = prev.next;
        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    public void reverse(){
        Node temp = head;
        head =tail;
        tail= temp;
        Node after;
        Node before = null;
        for(int i =0;i<length;i++){
            after = temp.next;
            temp.next = before;
            before=temp;
            temp=after;
        }
    }

    public Node findMiddleNode(){
        if(head==null)return null;
        int l = 1;
        Node middle = head;
        if (head==tail || head.next==tail) return head;
        do{ l++;
        middle =middle.next;}
        while (middle.next!=null);
        middle = head;
        for(int i=1;i<(l/2)+1;i++) {
                middle = middle.next;
            }
        return middle;
    }

    public boolean hasLoop(){
        if (head==null) return false;
        Node slow= head;
        Node fast= head;
        do{
            slow=slow.next;
            for (int i =0 ; i <2; i++) {
                if (fast.next != null) fast = fast.next;
            }
            if(slow==fast) break;
        }while(fast.next!=null);
        return slow == fast;
    }

    public Node findKthFromEnd(int k){
        if(head==null || head==tail) return null;
        int l = 1;
        Node temp = head;
        do {
            l++;
            temp = temp.next;
        }
        while (temp.next!=null);
            if(k>l)return null;
        temp = head;
        for(int i=0; i<l-k;i++){
            temp=temp.next;
        }
        return temp;
    }

    public Node findKthFromEnd2(int k){
        Node slow =head;
        Node fast = head;
        for (int i = 0;i<k;i++){

            if (fast==null) return null;
            fast = fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }

    public void removeDuplicates(){
        if (head==tail || head==null) ;
        Set<Integer>  values = new HashSet<>();
        Node temp = head.next;
        Node prev = head;
        values.add(head.value);
        while (temp!=null){
            if (values.contains(temp.value)){
                prev.next = temp.next;
                temp.next =null;
                temp=prev.next;
            }
            else{
                values.add(temp.value);
                temp=temp.next;
                prev=prev.next;
            }
        }
    }

    public int binaryToDecimal() {
        int num = 0;
        Node current = head;
        while (current != null) {
            num = num * 2 + current.value;
            current = current.next;
        }
        return num;
    }
}
