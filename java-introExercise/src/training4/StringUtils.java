package training4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringUtils {
	public static void main(String[] args) {
		
	}
	
	public static String maxCount(List<String> list) {
		String max = list.get(0);
		for(String n : list) {
			if(n.length() > max.length()) {
				max = n;
			}
		}
		return max;
		
	}
	
	public static String minCount(List<String> list) {
		String min = list.get(0);
		for(String m :list) {
			if(m.length() < min.length()) {
				min = m;
				
			}
		}
		return min;
	}
	
	public static void linkedList(List<String> list,char delimiter) {
		for(String l : list) {
			System.out.print( l + delimiter);
		}
	}
	
	public static List<String> getSpecificStr(List<String> list,String str){
		List<String> contains = new ArrayList<String>();
		for( String k : list) {
			if(k.matches(str)) {
				contains.add(k);
			}
		}
		return contains;
	
	}
	
	public static String getPrice(String fruit) {
		Map<String,String> fruits = new HashMap<String,String>();
		fruits.put("apple", "100円");
		fruits.put("orange","110円");
		fruits.put("pineapple","200円");
		fruits.put("cherry","500円");
		fruits.put("grape","300円");
		
		return fruits.get(fruit);
	}
	
	public static String getFruitPrice(String fruit){
		Map<String,String> fruits = new HashMap<String,String>();
		fruits.put("apple", "100円");
		fruits.put("orange","110円");
		fruits.put("pineapple","200円");
		fruits.put("cherry","500円");
		fruits.put("grape","300円");
		
		if(fruits.get(fruit) == null) {
			throw new RuntimeException("例外が発生しました");
		}
		
		return fruits.get(fruit);
	}
	
	


}
