import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

      System.out.println("Please select operation.");
//Нужно удалить переменные от "сих"
      float radius = 12.0f;
      float rectangleSide1 = 5.0f;
      float rectangleSide2 = 10.0f;
      float triangleSide1 = 12.0f;
      float triangleSide2 = 8.0f;
//до "сих"
      float temperatureCelsius = 21.5f;
      float temperatureFarengeit = 221.0f;
      int point1X = 1;
      int point1Y = 2;
      int point2X = 6;
      int point2Y = 8;

      System.out.println("Please select operation.");
      final Scanner scanner = new Scanner(System.in);
      final String command = scanner.nextLine();

//Для примера примем, что по заданию в 4 уроке было необходимо вычислить только температуру и дистанцию, тогда задание №1
//в данном случае лишнее. Используя метод Copy-Paste, я скопировал работу, но забыл удалить лишнии переменные и сообщения,
//следовательно получили "якорь", для устранения проблемы достаточно просто удалить лишние классы и переменные.
      switch (command) {
        case "Temperature":
          System.out.println("You select a calculate temperature.");
          Temperature Calculate = new Temperature(temperatureCelsius, temperatureFarengeit);
          System.out.println("температура по Цельсию равна " + temperatureCelsius + " Эта температура по Фаренгейту равна " + Calculate.celsiusToFarengeit);
          System.out.println("температура по Фаренгейту равна " + temperatureFarengeit + " Эта температура по Цельсию равна " + Calculate.farengeitToCelsius);
          break;
        case "Distance":
          System.out.println("You select a calculate Distance.");
          Distance CalculateCoordinate = new Distance(point1X, point1Y, point2X, point2Y);
          System.out.println("Координаты точки 1 равны " + point1X + " и " + point1Y + " Координаты точки 2 равны " + point2X + " и " + point2Y);
          System.out.println("Расстояние между точками равно " + CalculateCoordinate.getRoundDistance());
          break;
        default:
          System.out.println("Unknown command ' " + command + " '");
      }

    }



}
