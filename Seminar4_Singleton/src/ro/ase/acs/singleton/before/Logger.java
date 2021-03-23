package ro.ase.acs.singleton.before;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Date;

public class Logger {
    private String fileName;

    public Logger(){
        this.fileName = "log.txt";
    }

    public Logger(String fileName){
        this();
        if(fileName != null) {
            this.fileName = fileName;
        }
    }

    public void log(String message){
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
