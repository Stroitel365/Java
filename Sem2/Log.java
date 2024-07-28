import java.io.FileInputStream;
import java.util.logging.LogManager;

public class Log {
    static{
        try(FileInputStream in = new FileInputStream("log.config")) {

            LogManager.getLogManager().readConfiguration(in);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static java.util.logging.Logger getLogger(String className) {
        return Log.getLogger(className);
    }
}
