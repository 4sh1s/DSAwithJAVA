package dataStructuresAlgorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class StringsPractice {

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
        String sss = ss.toLowerCase();
        if (sss.isEmpty() || sss.isBlank()) return isAnagram;
        else{
            int i = 0;
            int j = sss.length()-1;
            while(i<=sss.length()/2){
                if (sss.charAt(i) == sss.charAt(j)){
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
}
