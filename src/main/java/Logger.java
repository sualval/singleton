
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

    private static Logger instance;

    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    private static int num = 0;

    public void log(String msg) {
        System.out.println("[" + time()+ num++ + "] " + msg);
    }

    private String time() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy 'at' HH:mm:ss №:");
        Date date = new Date(System.currentTimeMillis());
        return formatter.format(date);
    }

}
