import java.util.HashMap;
import java.util.Map;

/**
 */
public class FooBarQixV2 {

    private static final String[] CODE = {"Foo", "Bar", "Qix"};
    private static final int[] VALUES = {3, 5, 7};

    public static String get(int i) {
        String result = "";

        //divisible par 3, 5, 7
        for (int d : VALUES) {
            if (i % d == 0) {
                result += code(d);
            }
        }

        String s = String.valueOf(i);
        for (int d : VALUES) {
            for (char c : s.toCharArray())
            {
                Integer value = Integer.valueOf(""+c);
                if (value == d)
                    result += code(value);
            }
        }

        //Never matched
        if (result.length() == 0)
            result = s;

        return result;
    }

    //Only for 3,5,7
    public static String code(int i) {
        return CODE[(i-3)/2];
    }

    static HashMap<Integer,String> map;
    public static void fillup() {
        if (map != null)
            return;
        map = new HashMap<Integer,String>();
        for(int i = 0; i <= 100; i=i+3) {
            String value = map.get(i);
            if (value==null) value = "";
            map.put(i, value+"Foo");
        }
        for(int i = 0; i <= 100; i=i+5) {
            String value = map.get(i);
            if (value==null) value = "";
            map.put(i, value+"Bar");
        }
        for(int i = 0; i <= 100; i=i+7) {
            String value = map.get(i);
            if (value==null) value = "";
            map.put(i, value+"Qix");
        }
        for(int i = 3; i <= 100; i=i+10) {
            String value = map.get(i);
            if (value==null) value = "";
            map.put(i, value+"Foo");
        }
        for(int i = 30; i < 40; i++) {
            String value = map.get(i);
            if (value==null) value = "";
            map.put(i, value+"Foo");
        }
        for(int i = 5; i <= 100; i=i+10) {
            String value = map.get(i);
            if (value==null) value = "";
            map.put(i, value+"Bar");
        }
        for(int i = 50; i < 60; i++) {
            String value = map.get(i);
            if (value==null) value = "";
            map.put(i, value+"Bar");
        }
        for(int i = 7; i <= 100; i=i+10) {
            String value = map.get(i);
            if (value==null) value = "";
            map.put(i, value+"Qix");
        }
        for(int i = 70; i < 80; i++) {
            String value = map.get(i);
            if (value==null) value = "";
            map.put(i, value+"Qix");
        }
    }

    public static String getFromFilled(int i){
        fillup();
        String s = map.get(i);
        return s!=null?s : ""+i;
    }
}
