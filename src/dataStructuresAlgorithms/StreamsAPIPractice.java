package dataStructuresAlgorithms;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsAPIPractice {

    public Integer sumOfInts(List<Integer> ints) { // returns the integer sum of a list of integers

        return ints.stream().reduce(0,(a,b)->a+b);
    }

    public Double averageOfInts(List<Integer> ints){ // returns a double value for the average of all the elements in a list of integers

        return ints.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
    }

    public List<String> toUpper(List<String> strings){ // returns a list of strings that contains the strings present in the supplied list but in uppercase
        return strings.stream().map(String::toUpperCase).toList();
    }

    public Integer sumOfEven(List<Integer> ints){ //returns the integer sum of all the even integers in a list of integers
        return ints.stream().filter(a->a%2==0).mapToInt(Integer::intValue).sum();
    }
    public Integer sumOfOdd(List<Integer> ints){ // returns the integer sum of all the odd integers in a list of integers
        return ints.stream().filter(a->a%2!=0).mapToInt(Integer::intValue).sum();
    }
    public List<String> removeDuplicates(List<String> strings){ // returns a list with the duplicates removed from a list of strings
        return strings.stream().distinct().toList();
    }

    public Long countStrings(List<String> strings , String as){ //returns the count of strings that start with a given substring from a list of strings
        return strings.stream().filter(x->x.startsWith(as)).count();
    }

    public List<String> sortStringsAsc(List<String> strings){ // returns the list of strings in ascending sorted order
        return strings.stream().sorted().collect(Collectors.toList());
    }

    public List<String> sortStringsDesc(List<String> strings){//returns the list of strings in descending sorted order
        return strings.stream().sorted(Comparator.reverseOrder()).toList();
    }

    public Map<String,Integer> maxMinInts(List<Integer> ints){// returns a map of max an min integers from a list of integers
        Map<String,Integer> map = new HashMap<>();
//        map.put("Max",ints.stream().sorted().toList().get(0));
//        map.put("Min", ints.stream().sorted(Comparator.reverseOrder()).toList().get(0));
        map.put("max",ints.stream().max(Integer::compare).orElse(0));
        map.put("min",ints.stream().min(Integer::compare).orElse(0));
        return map;
    }

    public Map<String,Integer> secondLargestSmallest(List<Integer> ints){ //returns the second smallest and the second largest integers from a list of Integers
        Map<String,Integer> map = new HashMap<>();

//        map.put("Second Largest",ints.stream().sorted().toList().get(1));
//        map.put("Second Smallest", ints.stream().sorted(Comparator.reverseOrder()).toList().get(1));
        map.put("Second Smallest",ints.stream().distinct().sorted().skip(1).findFirst().orElse(null));
        map.put("Second Largest", ints.stream().distinct().sorted((a,b)->Integer.compare(b,a)).skip(1).findFirst().orElse(null));
        return map;
    }




}
