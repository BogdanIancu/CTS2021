package ro.ase.acs.main;

import ro.ase.acs.singleton.before.CommandLine;
import ro.ase.acs.singleton.before.Gui;

public class Main {
    public static void main(String[] args){
        Runnable r = ()->{
            Gui gui = new Gui();
        };
        new Thread(r).start();
        CommandLine commandLine = new CommandLine();
    }
}
