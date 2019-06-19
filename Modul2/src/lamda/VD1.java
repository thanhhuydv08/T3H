package lamda;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class VD1 {
	
/**
 * @param args
 */
public static void main(String[] args) {
	
	ArrayList<String> arrayList = new ArrayList<>();
	arrayList.add("Nguyeenx Huy");
	arrayList.add("Cao Nhan");
	arrayList.add("Mac mei");
	arrayList.forEach(s->System.out.println(s+" "));
	Map<String, String> map = new TreeMap<>();
	map.put("1", "Di hoc");
	map.put("2", "Choi game");
	map.put("3", "O nha");
	map.forEach((key,value)->System.out.println(key+" "+value));
}
}
