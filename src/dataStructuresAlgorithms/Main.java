package dataStructuresAlgorithms;

import java.time.Instant;
import java.util.*;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static boolean  filterFunction(String x){
    return x.startsWith("a") && x.length()>3;
    }
    public Integer countOfCharsWithoutLoop(String s ,String sa){
        return s.trim().length()-s.trim().replace(sa,"").length();
    }

    public  String reverseStringWithoutInbuiltMethod(String s){
        String[] sa = s.trim().split("");
        Collections.reverse(Arrays.asList(sa));
        StringBuilder sb = new StringBuilder();
        sb.append(Arrays.toString(sa));
        return sb.toString();
    }

    public static Integer kaprekarsAlgo(Integer con){ // returns the number of iterations it took to get the aparkars constant given a 4 digit Integer
        String[] s = con.toString().split("");
        List<String> ascending = Arrays.stream(s).sorted().toList();
        List<String> descending = Arrays.stream(s).sorted(Comparator.reverseOrder()).toList();
        StringBuilder ascend = new StringBuilder();
        StringBuilder descend = new StringBuilder();

        ascending.forEach(ascend::append);
        descending.forEach(descend::append);
        return Integer.parseInt(descend.toString())-Integer.parseInt(ascend.toString());
    }

    public static void kaprekarsConstant(Integer ins){
        if(ins<1000 || ins>9999 || kaprekarsAlgo(ins)==0 ) System.out.println("Please provide a valid 4 digit number with at least 2 different digits");
        else {
            int iterations = 0;
            while (kaprekarsAlgo(ins) != 6174) {
                Integer val = kaprekarsAlgo(ins);
                if (val == 6174) {
                    System.out.println(val);
                    break;
                } else {
                    if (val == 0) {
                        System.out.println("Please provide a valid 4 digit number with at least 2 different digits, in case of only 2 different digits they should repeat twice");
                        return;
                    } else {
                        iterations++;
                        System.out.println(val);
                        ins = val;
                    }
                }
            }
            System.out.println("Iterations to achieve Kaprekar's constant 6174 = " + iterations);
        }
    }

    public static HashMap<String, Integer> numberOfOccurences(String ss){
        String[] ass = ss.trim().split(" ");
        HashMap<String,Integer> hass = new HashMap<>();
        for (String s : ass){
            if(hass.containsKey(s)){
                hass.put(s,hass.get(s)+1);
            }
            else hass.put(s,1);
        }
        return hass;
    }

    public static Boolean isAnagram(String ss){
        boolean isAnagram = false;
        if (ss==null || ss.isEmpty() || ss.isBlank()) return isAnagram;
        else{
            int i = 0;
            int j = ss.length()-1;
            while(i<=ss.length()/2){
                if (ss.charAt(i) == ss.charAt(j)){
                    i++;
                    j--;
                    isAnagram=true;
                }
                else {
                    isAnagram=false;
                    break;
                }
            }
        }
        return isAnagram;
    }

    public static void main(String[] args) {
//        List<List<Integer> > number = new ArrayList<>();
//
//        // adding the elements to number arraylist
//        number.add(Arrays.asList(1, 2));
//        number.add(Arrays.asList(3, 4));
//        number.add(Arrays.asList(5, 6));
//        number.add(Arrays.asList(7, 8));
//
//        System.out.println("List of list-" + number);
//
//        // using flatmap() to flatten this list
//        List<Integer> flatList
//                = number.stream()
//                .flatMap(list -> list.stream()).map(z->z+5)
//                .collect(Collectors.toList());
//
//        // printing the list
//        System.out.println("List generate by flatMap-"
//                + flatList);
//        String a ="abcc";
//        String b="ashish is the best ashish out there in the world full of best ashish's";
//        String isla = "ROTATOR";
//        Set<String> an = null;
//
//        Boolean island = isAnagram(a);
//        Boolean hello = isAnagram(isla);
//        int i = 0;
//        System.out.println("start time:"+ Instant.now());
//        while(i<1000000000){
//            System.out.println(i);
//            i++;
//        }
//        System.out.println("end time:"+ Instant.now());
        kaprekarsConstant(9998);
    }






}
