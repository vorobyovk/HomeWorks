import org.junit.Assert;

public class CalculatorTest {

    @org.junit.Test
    public void testGetAreaRectangle() throws Exception {
        float radius=1.0f;
        float rectangleSide1=1.0f;
        float rectangleSide2=1.0f;
        float triangleSide1=1.0f;
        float triangleSide2=1.0f;

        Calculator Area = new Calculator(radius, rectangleSide1, rectangleSide2, triangleSide1, triangleSide2);

      Assert.assertEquals(1,Area.getAreaRectangle(),0.003);
    }


}