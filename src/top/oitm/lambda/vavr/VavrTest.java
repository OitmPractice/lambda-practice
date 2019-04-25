package top.oitm.lambda.vavr;

import io.vavr.*;
import io.vavr.control.Option;
import io.vavr.control.Try;
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


    // 组合
    @Test
    public void testAndThen(){
        Function3< Integer, Integer, Integer, Integer> function3 = (v1, v2, v3)
                -> (v1 + v2) * v3;
        System.out.println(function3.apply(1,2,3));

        Function3< Integer, Integer, Integer, Integer> composed = function3.andThen(v->v*3);
        System.out.println(composed.apply(1,1,1));


        Function1<String, String> function1 = String::toUpperCase;
        String apply = function1.apply("oitm");
        System.out.println(apply);
    }

    // 部分应用
    @Test
    public void testUseSome(){
        Function4<String, String,String,String,String> function4 = (s1,s2,s3,s4)->(s1+s2+s3+s4).toUpperCase();
        Function2<String, String, String> apply = function4.apply("o", "i");
        String apply1 = apply.apply("t", "m");
        System.out.println(apply1);
    }

    @Test
    public void testOption(){
        Option<String> oitm = Option.some("OITM");
        System.out.println(oitm.get());

        Option<Object> none = Option.none();
        System.out.println(none);
    }


    @Test
    public void testTry(){
        Try<Object> error_occur = Try.failure(new RuntimeException("error occur"));
        Try<String> oitm_success = Try.success("Oitm Success");

        Try<Integer> recover = Try.of(() -> 1 / 0).recover(e-> {
            System.out.println(e.getMessage());
            return 1;
        });
        System.out.println(recover.get());

    }
}
