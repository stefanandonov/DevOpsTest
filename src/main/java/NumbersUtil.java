import java.util.List;

public class NumbersUtil {

    public static int countEvenNumbers (List<Integer> list) {
        if (list==null)
            return 0;
        int count = 0;
        for (Integer i : list) {
            if (i%2==0)
                count++;
        }
        return count;
    }

    public static int countOddNumbers (List<Integer> list) {
        if (list==null)
            return 0;
        int count = 0;
        for (Integer i : list) {
            if (i%2==1)
                count++;
        }
        return count;
    }
}
