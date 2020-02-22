import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.*;

public class NumbersUtilTest {

    @Test
    public void countEvenNumbers() {
        assertEquals(0, NumbersUtil.countEvenNumbers(new ArrayList<>()));
        assertEquals(1, NumbersUtil.countEvenNumbers(List.of(1,2)));
        assertEquals(0, NumbersUtil.countEvenNumbers(List.of(1,1,1,1,1)));
        assertEquals(5, NumbersUtil.countEvenNumbers(IntStream.rangeClosed(1,10).boxed().collect(Collectors.toList())));
        assertEquals(11, NumbersUtil.countEvenNumbers(IntStream.rangeClosed(1,22).boxed().collect(Collectors.toList())));
        assertEquals(0, NumbersUtil.countEvenNumbers(null));
    }

    @Test
    public void countOddNumbers() {
        assertEquals(0, NumbersUtil.countOddNumbers(new ArrayList<>()));
        assertEquals(1, NumbersUtil.countOddNumbers(List.of(1,2)));
        assertEquals(0, NumbersUtil.countOddNumbers(List.of(2,2,2,2,2)));
        assertEquals(5, NumbersUtil.countOddNumbers(IntStream.rangeClosed(1,10).boxed().collect(Collectors.toList())));
        assertEquals(11, NumbersUtil.countOddNumbers(IntStream.rangeClosed(1,22).boxed().collect(Collectors.toList())));

        assertEquals(0, NumbersUtil.countOddNumbers(null));
    }
}