package in.upes.projectmanagement;

import io.github.cdimascio.dotenv.Dotenv;

public class EnvConfig {
    private static final Dotenv dotenv = Dotenv.configure()
                                   .directory("/Users/bhavesh/Documents/GitHub/Insync") // Specify the correct path
                                   .load();

    public static String get(String key) {
        return dotenv.get(key);
    }
}