import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathOperationTest {

    @org.junit.Test
    public void testAdd() throws Exception {
        int A=4;
        int B=2;
        MathOperation math = new MathOperation();
        int result = math.add(A,B);

        assertEquals(result,6);
    }
    @Test
    public void testMult() throws Exception{
      int a=10;
        int b=3;
        MathOperation math = new MathOperation();
        int result = math.multiply(a,b);

        assertEquals(a*b,result);

    }
}