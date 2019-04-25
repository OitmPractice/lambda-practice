package top.oitm.lambda.lambda;

import org.junit.Test;

/**
 * @Description:
 * @Author: song_shu_ran
 * @Date: 2019-04-25 16:00
 */

public class LambdaTest {

    //Lambda 表达式是创建匿名内部类的语法糖（syntax sugar）。在编译器的帮助下，可以让开发人员用更少的代码来完成工作。

    // Lambda 表达式中引用的变量必须是声明为 final 或是实际上 final（effectively final）的。
    // 实际上 final 的意思是变量虽然没有声明为 final，但是在初始化之后没有被赋值。因此变量的值没有改变。

    @Test
    public void testStartThread(){
        new Thread(()-> {
            System.out.println("Oitm");
            //do something else
        }).start();
    }


    @Test
    public void testFunctionalInterface(){
        new FunctionalInterfaceImpl(()->{
            System.out.println("Oitm");
        }).start();
    }

}
