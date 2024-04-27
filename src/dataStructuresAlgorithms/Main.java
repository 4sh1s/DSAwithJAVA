package dataStructures.LinkedList;

import java.security.KeyStore;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        LinkedList newLL = new LinkedList(5);
//
//        newLL.append(7);
//        newLL.prepend(89);
//        newLL.getHead();
//        newLL.prepend(976);
//        newLL.getHead();
//
//        System.out.println(newLL.get(0).value+ "\n");
//        System.out.println(newLL.set(2,9989));
//        System.out.println(newLL.set(-2,9989));
//        System.out.println(newLL.set(1,9989));
//        newLL.printList();
//        System.out.println("middle Node: "+newLL.findMiddleNode().value);
//        newLL.reverse();
//        newLL.printList();
//        System.out.println("middle Node: "+newLL.findMiddleNode().value);
//
//
//        LinkedList list1 = new LinkedList(1);
//        list1.append(0);
//        list1.append(1);
//        list1.append(1);
//        System.out.println("Convert 1011 to 11:");
//        System.out.println("Input: 1 -> 0 -> 1 -> 1");
//        System.out.println("Output: " + list1.binaryToDecimal());
//        System.out.println("---------------");
//
//        // ---------------
//        // Convert 1100 to 12
//        // ---------------
//        LinkedList list2 = new LinkedList(1);
//        list2.append(1);
//        list2.append(0);
//        list2.append(0);
//        System.out.println("Convert 1100 to 12:");
//        System.out.println("Input: 1 -> 1 -> 0 -> 0");
//        System.out.println("Output: " + list2.binaryToDecimal());
//        System.out.println("---------------");

        int[] nums = new int[]{1,2,3,4,5,6,7};




        class Solution {
            public int[] twoSum(int[] nums, int target) {
                HashMap<Integer,Integer>  complliment = new HashMap<>();
                int n = nums.length;
                for (int i=0;i<n;i++){
                    int complement = target-nums[i];
                    if (complliment.containsKey(complement)){
                        return new int[]{complliment.get(complement),i};
                    }
                    complliment.put(nums[i],i);
                }
                return new int[]{};
            }
        }

        Solution num = new Solution();
        System.out.println(Arrays.toString(num.twoSum(nums, 9)));


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