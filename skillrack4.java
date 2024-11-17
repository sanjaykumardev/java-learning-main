import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class skillrack4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s1 = sc.nextLine();
    String s2 = sc.nextLine();

    

    HashMap<Character , Integer> fr1 = new HashMap<>();
    HashMap<Character, Integer> fr2 = new HashMap<>();
    
    for(char ch : s1.toCharArray()){
      fr1.put(ch , fr1.getOrDefault(ch, 0)+1);
    }
    for(char ch : s2.toCharArray()){
      fr2.put(ch , fr2.getOrDefault(ch, 0)+1);
    }
    Map<Integer, Integer> frequencyCountMap1 = new HashMap<>();
    Map<Integer, Integer> frequencyCountMap2 = new HashMap<>();

    
    for (int freq : fr1.values()) {
        frequencyCountMap1.put(freq, frequencyCountMap1.getOrDefault(freq, 0) + 1);
    }

    
    for (int freq : fr2.values()) {
        frequencyCountMap2.put(freq, frequencyCountMap2.getOrDefault(freq, 0) + 1);
    }

    
    if (frequencyCountMap1.equals(frequencyCountMap2)) {
        System.out.println("Yes");
    } else {
        System.out.println("No");
    }
  }  
}
