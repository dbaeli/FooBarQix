/**
 */
public class FooBarQix {
    public static String get(int i) {
        String result = "";

        //divisible par 3
        if (i % 3 == 0) {
            result += "Foo";
        }
        //contient 3
        String s = String.valueOf(i);
        if ( s.contains("3")){
            result += "Foo";
        }

        if (result.length()==0)
            result = s;

        return result;
    }
}
