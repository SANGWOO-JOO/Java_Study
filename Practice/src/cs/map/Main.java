package cs.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map map =new HashMap();

        map.put("bbb","222");
        map.put("aaa","111");
        map.put("ccc","333");

        System.out.println(map);

        Map map2 = new TreeMap(map);

        System.out.println(map2);
    }
}
