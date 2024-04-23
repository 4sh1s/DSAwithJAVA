package dataStructures.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LinkedList newLL = new LinkedList(5);

        newLL.append(7);
        newLL.prepend(89);
        newLL.getHead();
        newLL.prepend(976);
        newLL.getHead();

        System.out.println(newLL.get(0).value+ "\n");
        System.out.println(newLL.set(2,9989));
        System.out.println(newLL.set(-2,9989));
        System.out.println(newLL.set(1,9989));
        newLL.printList();
        System.out.println("middle Node: "+newLL.findMiddleNode().value);
        newLL.reverse();
        newLL.printList();
        System.out.println("middle Node: "+newLL.findMiddleNode().value);


        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);

        int k = 4;
        int result = myLinkedList.findKthFromEnd2(k).value;

        System.out.println(result); //




//        int i=9;
//        while(i>1){
//            newLL.append(i*i);
//            i--;
//        }
//        System.out.println(newLL.removeLast().value);
//        System.out.println(newLL.removeLast().value);
//        System.out.println(newLL.removeFirst().value);
//        System.out.println(newLL.removeFirst().value);
//        System.out.println(newLL.removeLast());


    }
}