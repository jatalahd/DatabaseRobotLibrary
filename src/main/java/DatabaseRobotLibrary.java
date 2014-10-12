import org.robotframework.javalib.library.AnnotationLibrary;

public class DatabaseRobotLibrary extends AnnotationLibrary {
    public static final String ROBOT_LIBRARY_SCOPE = "TEST SUITE";
    public static final String ROBOT_LIBRARY_VERSION = "1.0";
    
    public DatabaseRobotLibrary() {
        super("org/robotframework/databaserobotlibrary/DatabaseKeywords.class");
    }
}
