package top.oitm.lambda.lambda;

import org.junit.Test;

/**
 * @Description:
 * @Author: song_shu_ran
 * @Date: 2019-04-25 16:24
 */

public class LambdaTargetType {

    @FunctionalInterface
    interface A {
        void a();
    }

    @FunctionalInterface
    interface B{
        void b();
    }

    class InnerClass {
        void use(A a){
            a.a();
            System.out.println("A");
        }

        void  use(B b){
            b.b();
            System.out.println("B");
        }
    }

    @Test
    public void testUserAB(){
        InnerClass innerClass = new InnerClass();
        A a = ()-> System.out.print("Use ");
        innerClass.use(a);

    }


}
