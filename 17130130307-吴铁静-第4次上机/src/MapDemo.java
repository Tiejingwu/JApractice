package thirdshangji;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();        // 创建Map集合
        map.put("1", "dog");
        map.put("2", "cat");
        map.put("3", "fish");
        for(int i=1; i<=3; i++) {
            System.out.println( i + map.get("" + i + ""));
        }
    }

}