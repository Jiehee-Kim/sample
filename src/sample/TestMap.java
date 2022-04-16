package sample;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("name", "홍길동");
		map.put("tel", "010-1111-1111");
		
		System.out.println(map.get("name"));
		System.out.println(map.get("tel"));
		
		Map<String, HashMap<String, String>> map2 = new HashMap<>();
		map2.put("map", map);
		
		System.out.println(map2);
		System.out.println(map2.get("map").get("name"));
	}
}
