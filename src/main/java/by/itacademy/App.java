package by.itacademy;

public class App {
    public static void main(String[] args) {
        PropertyConnection propertyConnection = new PropertyConnection();

        String weatherUriResult = propertyConnection.getProperty();
        System.out.println(weatherUriResult);
    }
}
