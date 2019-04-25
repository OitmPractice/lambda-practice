package top.oitm.lambda.vavr;

import io.vavr.Tuple;
import io.vavr.Tuple2;
import org.junit.Test;

/**
 * @Description:
 * @Author: song_shu_ran
 * @Date: 2019-04-25 16:46
 */

public class VavrTest {

    @Test
    public void testTuple(){
        Tuple2<String, String> tuple2 = Tuple.of("123", "456");
        System.out.println(tuple2._1);
        System.out.println(tuple2._2);


        Tuple2<String, Integer> stringIntegerTuple2 = Tuple.of("Oitm", 10);
        Tuple2<String, Integer> map = stringIntegerTuple2.map(str -> str.toUpperCase(), number -> number * number);
        String apply = map.apply((str, number) -> String.join(", ",
                str, number.toString()));
        System.out.println(apply);

    }


}
