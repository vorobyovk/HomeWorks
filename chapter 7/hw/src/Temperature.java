public class Temperature {
    public float temperatureCelsius;
    public float temperatureFarengeit;
    public float celsiusToFarengeit;
    public float farengeitToCelsius;

    Temperature(float temperatureCelsius, float temperatureFarengeit){
        this.temperatureCelsius = temperatureCelsius;
        this.temperatureFarengeit = temperatureFarengeit;
        celsiusToFarengeit = (temperatureCelsius*9/5)+32;
        farengeitToCelsius = (temperatureFarengeit-32)*5/9;
    }


}
