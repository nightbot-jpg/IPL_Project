package com.wecp.progressive.config;
<<<<<<< HEAD
 
=======
>>>>>>> 0016f57f3a81d23e2fd0915e1ebecdaa088f69ea
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
<<<<<<< HEAD
 
=======

>>>>>>> 0016f57f3a81d23e2fd0915e1ebecdaa088f69ea
public class DatabaseConnectionManager {
private static final Properties properties = new Properties();
static{
    loadProperties();
}
private static void loadProperties(){
    try (InputStream input = DatabaseConnectionManager.class.getClassLoader().getResourceAsStream("application.properties")) {
        if(input == null){
            throw new IllegalStateException("resource.properties not found in classpath");
        }
        properties.load(input);
    } catch (IOException e) {
        throw new RuntimeException("Error loading properties file",e);
    }
}
public static Connection getConnection() throws SQLException{
    return DriverManager.getConnection(properties.getProperty("spring.datasource.url"), properties.getProperty("spring.datasource.username"), properties.getProperty("spring.datasource.password"));
}
<<<<<<< HEAD
}
=======
 }
>>>>>>> 0016f57f3a81d23e2fd0915e1ebecdaa088f69ea
