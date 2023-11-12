package by.itacademy;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyConnection {

    private static final String WEATHER_URI = "service.weather.uri";

    public String getProperty() {
        try (InputStream inputStream = PropertyConnection.class.getClassLoader().getResourceAsStream("config.properties")) {

            final Properties properties = new Properties();
            properties.load(inputStream);

            return properties.getProperty(WEATHER_URI);
        } catch (IOException e) {
            throw new RuntimeException("Problem with file reading", e);
        }
    }
}
