package org.teststore.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigProperties {
    private static final String CONFIG_PATH = "src/main/resources/configsetting.properties";
    private static Properties properties;

    public static void initializePropertyFile() {
        properties = new Properties();
        try (InputStream instm = new FileInputStream(CONFIG_PATH)) {
            properties.load(instm);
        } catch (FileNotFoundException e) {
            throw new ConfigFileNotFoundException("Configuration file not found", e);
        } catch (IOException e) {
            throw new ConfigFileIOException("Error while reading configuration file", e);
        }
    }

    public static Properties getProperties() {
        if (properties == null) {
            throw new IllegalStateException("Properties have not been initialized. Call initializePropertyFile() first.");
        }
        return properties;
    }

    static class ConfigFileNotFoundException extends RuntimeException {
        public ConfigFileNotFoundException(String message, Throwable cause) {
            super(message, cause);
        }
    }

    static class ConfigFileIOException extends RuntimeException {
        public ConfigFileIOException(String message, Throwable cause) {
            super(message, cause);
        }
    }
}
