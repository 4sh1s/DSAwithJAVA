package running;

import dataStructures.LinkedList.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LinkedList newLL = new LinkedList(5);
//        LinkedList newLL2 = new LinkedList(2);
//        LinkedList newLL3 = new LinkedList(5);
//        newLL.getHead();
//        newLL.getTail();
//        newLL.getLength();
//
//        newLL.printList();
        newLL.append(7);
//        int i=9;
//        while(i>1){
//            newLL.append(i*i);
//            i--;
//        }
        System.out.println(newLL.removeLast().value);
        System.out.println(newLL.removeLast().value);
        System.out.println(newLL.removeLast());


    }
}