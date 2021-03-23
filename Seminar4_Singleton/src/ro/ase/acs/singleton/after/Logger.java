package ro.ase.acs.singleton.after;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Date;

public class Logger {
    private String fileName;
    private static Logger instance = null;
    private static final String WARNING_MESSAGE = "Instance already created! \n Present instance will be used instead";

    private Logger(){
        this.fileName = "log.txt";
    }

    private Logger(String fileName){
        this();
        if(fileName != null) {
            this.fileName = fileName;
        }
    }

    public static synchronized Logger getInstance(){
        if(instance == null){
            instance = new Logger();
        } else {
            System.out.println(WARNING_MESSAGE);
        }
        return instance;
    }

    public static synchronized Logger getInstance(String fileName){
        if(instance == null){
            instance = new Logger(fileName);
        } else {
            System.out.println(WARNING_MESSAGE);
        }
        return instance;
    }

    public synchronized void log(String message){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(this.fileName,true);
            Thread.sleep(4000);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            bufferedWriter.write(String.valueOf(new Date()));
            bufferedWriter.write(" ");
            bufferedWriter.write(message);
            bufferedWriter.write(System.lineSeparator());
            bufferedWriter.close();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}