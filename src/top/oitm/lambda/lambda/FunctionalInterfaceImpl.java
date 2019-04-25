package top.oitm.lambda.lambda;

/**
 * @Description:
 * @Author: song_shu_ran
 * @Date: 2019-04-25 16:14
 */

public class FunctionalInterfaceImpl {

    private FunctionalInterfaceTest interfaceTest;
    public FunctionalInterfaceImpl(FunctionalInterfaceTest interfaceTest) {
        this.interfaceTest = interfaceTest;
    }
    public void start(){
        interfaceTest.get();
    }
}
