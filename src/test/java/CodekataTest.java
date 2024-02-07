import org.junit.Assert;
import org.junit.Test;

public class CodekataTest {
    /**
     * Here write tests of functions
     * */
    @Test
    public void test1(){
        Assert.assertEquals(CodekataProblem.myProblem1(10, 20), 30);
    }

    @Test
    public void test2(){
        Assert.assertEquals(CodekataProblem.myProblem2(1, 2), 2);
    }

    @Test
    public void test3(){
        Assert.assertEquals(CodekataProblem.myProblem3(100, 0), 0);
    }

    @Test
    public void test4(){
        Assert.assertEquals(CodekataProblem.myProblem4(100, 99), 1);
    }
}
