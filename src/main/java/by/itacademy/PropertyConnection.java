package by.itacademy;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyConnection {

    private static final String WEATHER_URI = "service.weather.uri";
    private static final String PROPERTIES_FILE = "service.weather.uri";
    
    public String getProperty() {
        try (InputStream inputStream = PropertyConnection.class.getClassLoader().getResourceAsStream(PROPERTIES_FILE)) {

            final Properties properties = new Properties();
            properties.load(inputStream);

            System.out.println("not main");
            return properties.getProperty(WEATHER_URI);
        } catch (IOException e) {
            throw new RuntimeException("Problem with file reading", e);
        }
    }
}
