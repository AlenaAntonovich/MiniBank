package logger;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class FileLogger implements Logger{
    private static final String LOG_FILE_PATH ="./resources/log.txt";
    private final Class clazz;
    FileLogger(final Class clazz){
        this.clazz = clazz;
    }


    @Override
    public void debug(String message) {
        log(LogLevel.DEBUG,message);
    }

    @Override
    public void info(String message) {
        log(LogLevel.INFO,message);

    }

    @Override
    public void warn(String message) {
        log(LogLevel.WARN,message);

    }

    @Override
    public void error(String message) {
        log(LogLevel.ERROR,message);

    }

    @Override
    public void fatal(String message) {
        log(LogLevel.FATAL,message);

    }

    @Override
    public void log(LogLevel level, String massage) {
        try(FileWriter filewriter = new FileWriter(LOG_FILE_PATH,true);
            PrintWriter printwriter = new PrintWriter(LOG_FILE_PATH)) {
            StringBuilder sb = new StringBuilder();
            sb.append("[").append(level).append("]")
                    .append("[").append(clazz).append("] ")
                    .append("[").append(LocalDateTime.now()).append("]")
                    .append(massage);
            printwriter.println(sb);
        }catch(IOException e){
            e.printStackTrace();

        }



    }
}
