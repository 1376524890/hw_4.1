public class hw6_8 {
    public static double celsiusToFahrenheit(double celsius){
        return (9.0/5)*celsius+32;

    }
    public static double fahrenheitToCelsius(double fahrenheit){
        return (5.0/9)*(fahrenheit-32);
    }

    public static void main(String[] args) {
        System.out.println("摄氏度\t华氏度\t\t华氏度\t摄氏度\t");
        System.out.println("----------------------------------");
        for(double celsius = 40.0, fahrenheit = 120.0;celsius>30;celsius-=1,fahrenheit-=10){
            System.out.println(celsius+"\t"+(double)((int)(celsiusToFahrenheit(celsius)*10))/10+"\t\t"+fahrenheit+"\t"+(double)((int)(fahrenheitToCelsius(fahrenheit)*100))/100);
        }
    }
}
