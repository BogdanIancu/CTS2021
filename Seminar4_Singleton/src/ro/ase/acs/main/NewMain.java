package ro.ase.acs.main;

import ro.ase.acs.singleton.after.CommandLine;
import ro.ase.acs.singleton.after.Gui;
import ro.ase.acs.singleton.after.LoggerV2;
import ro.ase.acs.singleton.after.LoggerV3;

public class NewMain {
    public static void main(String[] args){
        Runnable r = ()->{
            Gui gui = new Gui();
        };
        new Thread(r).start();
        CommandLine commandLine = new CommandLine();

        LoggerV2.INSTANCE.log("Message from NewMain");

        LoggerV3.instance.log("Another message from NewMain");
    }
}
