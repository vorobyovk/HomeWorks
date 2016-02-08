public class Distance {
    public int point1X;
    public int point1Y;
    public int point2X;
    public int point2Y;
    private double roundDistance;

    Distance(int point1X, int point1Y, int point2X, int point2Y){
        this.point1X = point1X;
        this.point1Y = point1Y;
        this.point2X = point2X;
        this.point2Y = point2Y;
        roundDistance = Math.sqrt(Math.pow(point2X-point1X,2)+Math.pow(point2Y-point1Y,2));
    }

    public double getRoundDistance() {
        return roundDistance;
    }
}
