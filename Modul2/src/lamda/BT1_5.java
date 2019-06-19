package lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BT1_5 {
	static int res;
public static void main(String[] args) {
List<String> lst =	Arrays.asList("NguyenThanhHuy","DaoThiMinhHao","CaoVanMeo","NguyenVa");
				Collections.sort(lst,(e1,e2)->{
					if(e1.length()<e2.length()) {
						return -1;
					}else if(e1.length()==e2.length()) {
						return 0;
					}else return 1;
					
				});
	lst.forEach(s->System.out.println(s));
}
}
