import java.util.Arrays;
import java.util.HashSet;

public class test {
    public static void main(){
        HashSet a = new HashSet(Arrays.asList(1,2,3,4,5));
        HashSet b = new HashSet(Arrays.asList(2,4,6,8,10));

        /*
        교집합: a.retainAll(b);
        합집합: a.addAll(b);
        차집합: a.removeAll(b);
        */

    }

}
