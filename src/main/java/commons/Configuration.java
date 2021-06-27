package commons;

import java.io.FileInputStream;
import java.util.Properties;

public enum Configuration {

    url;

    private final String configPath = System.getProperty("configPath");
    private Properties properties;
    private String value;

    private void init() {
        if (configPath == null) {
            throw new RuntimeException("you must specify configPath");
        }
        properties = new Properties();

        try {
            properties.load(new FileInputStream(configPath));
        } catch (Exception e) {
            throw new RuntimeException("Unable to load test properties from:" + configPath + ".", e);
        }

        value = (String) properties.get(this.toString());
    }

    public Object getValue() {
        if (value == null) {
            init();
        }
        return value;
    }

    public String asString() {
        return (String) getValue();
    }
}


