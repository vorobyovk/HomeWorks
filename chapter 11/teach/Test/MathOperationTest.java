import org.junit.Assert;

public class MathOperationTest {

    @org.junit.Test
    public void testAdd() throws Exception {
        int A=4;
        int B=2;
        MathOperation math = new MathOperation();
        int result = math.add(A,B);

        Assert.assertEquals(result,6);

    }
}