package marketing;

import java.util.Properties;

public class Sagger {

	private static final Properties properties;

	static {
		properties = new Properties();
		try {
			properties.load(Sagger.class.getClassLoader().getResourceAsStream("Sagger.properties"));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}