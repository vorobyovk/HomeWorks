public class MainClass {

    public static void main(String[] args){
        float radius = 1.0f;
        float rectangleSide1 = 5.0f;
        float rectangleSide2 = 10.0f;
        float triangleSide1 = 12.0f;
        float triangleSide2 = 8.0f;
        float temperatureCelsius = 21.5f;
        float temperatureFarengeit = 221.0f;
        int point1X = 1;
        int point1Y = 2;
        int point2X = 6;
        int point2Y = 8;


        //Задание №1
        Calculator Area = new Calculator(radius, rectangleSide1, rectangleSide2, triangleSide1, triangleSide2);
        System.out.println("Радиус равен "+Area.radius);
        System.out.println("Площадь круга равна "+Area.areaCircle);
        System.out.println("Сторона прямоугольника 1 равна "+Area.rectangleSide1+", а сторона 2 равна "+Area.rectangleSide2);
        System.out.println("Площадь прямоугольника равна "+Area.getAreaRectangle());
        System.out.println("Взят частный случай вычисления площади треугольника, а именно прямоугольного треугольника. Сторона треугольника 1 равна "+Area.triangleSide1+", а сторона 2 равна "+Area.triangleSide2);
        System.out.println("Площадь прямоугольного треугольника равна "+Area.areaTriangle);

        //Задание №2
        Temperature Calculate = new Temperature(temperatureCelsius, temperatureFarengeit);
        System.out.println("температура по Цельсию равна "+temperatureCelsius+" Эта температура по Фаренгейту равна "+Calculate.celsiusToFarengeit);
        System.out.println("температура по Фаренгейту равна "+temperatureFarengeit+" Эта температура по Цельсию равна "+Calculate.farengeitToCelsius);

        //Задание №3
        Distance CalculateCoordinate = new Distance(point1X, point1Y, point2X, point2Y);
        System.out.println("Координаты точки 1 равны "+point1X+" и "+point1Y+" Координаты точки 2 равны "+point2X+" и "+point2Y);
        System.out.println("Расстояние между точками равно "+CalculateCoordinate.getRoundDistance());
    }


}