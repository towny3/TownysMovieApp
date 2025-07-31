package main;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {
	private static final Properties properties = new Properties();
	
	static {
		try (InputStream inputStream = Config.class.getResourceAsStream("/config.properties")) {
			properties.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String getTmdbApiKey() {
		return properties.getProperty("tmdb.api.key");
	}
}
