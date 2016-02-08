public class Calculator {
    public float radius;
    public float rectangleSide1;
    public float rectangleSide2;
    public float triangleSide1;
    public float triangleSide2;
    public double areaCircle;
    private float areaRectangle;
    public float areaTriangle;

    Calculator(float radius, float rectangleSide1, float rectangleSide2, float triangleSide1, float triangleSide2){
        this.radius = radius;
        this.rectangleSide1 = rectangleSide1;
        this.rectangleSide2 = rectangleSide2;
        this.triangleSide1 = triangleSide1;
        this.triangleSide2 = triangleSide2;
        areaCircle = Math.PI*(this.radius*this.radius);
        areaRectangle = rectangleSide1*rectangleSide2;
        areaTriangle =  triangleSide1*triangleSide2/2;
    }

    public float getAreaRectangle() {
        return areaRectangle;
    }
}

