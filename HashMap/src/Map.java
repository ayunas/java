import java.util.*;

public class Map {

    public static void main(String[] args) {
//        java.util.Map<String,String> object = new HashMap<>();
        HashMap<String, String> object = new HashMap<>();
        object.put("key1","val1");
        object.put("key2","val2");
        object.put("key3","val3");

        System.out.println(object.get("key1"));

        Set<String> keys = object.keySet();
        Collection<String> values = object.values();
        System.out.println(keys);
        System.out.println(values);

        ArrayList<String> keysArr = new ArrayList<>(keys);
        ArrayList<String> valsArr = new ArrayList<>(values);

        System.out.println("{");
        for (int i=0; i<keysArr.size(); i++) {
            System.out.println(keysArr.get(i) + " : " + valsArr.get(i) + ",");
        }
        System.out.println("}");

        for (String key : object.keySet()) {
            System.out.println(key + " : " + object.get(key));
        }


    }
}
