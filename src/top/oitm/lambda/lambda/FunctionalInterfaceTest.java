package top.oitm.lambda.lambda;

/**
 * @Description:
 * @Author: song_shu_ran
 * @Date: 2019-04-25 16:10
 */
@FunctionalInterface
public interface FunctionalInterfaceTest {
    /**
     * 第一个前提是要求接口类型
     * 第二个前提是要求接口中只有一个抽象方法。如果一个接口仅有一个抽象方法（除了来自 Object 的方法之外），它被称为函数式接口（functional interface）。
     *
     * 函数式接口的特别之处在于其实例可以通过 Lambda 表达式或方法引用来创建。
     *
     * 如果一个接口被设计为函数式接口，应该添加@FunctionalInterface 注解。
     */
    void get();

}


