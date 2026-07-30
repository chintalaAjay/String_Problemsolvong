package java_Problems;
import java.util.*;

public class CountOccurencesOfCharacter {
	public static void main(String[] args) {
		String str="avbdaabjb";
		HashMap<Character,Integer> map=new HashMap<>();
		for(char x:str.toCharArray()) {
			map.put(x, map.getOrDefault(x,0)+1);
		}
		System.out.println(map);
		
		
	}

}
