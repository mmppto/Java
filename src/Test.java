import java.util.*;

public class Test {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        map.put(1, 10);
        map.put(2, 3);
        map.put(3, 123);
        Map.Entry<Integer, Integer> up = map.ceilingEntry(2);
        System.out.println(up.getKey());
    }
}