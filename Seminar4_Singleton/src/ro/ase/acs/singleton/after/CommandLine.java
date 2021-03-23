package ro.ase.acs.singleton.after;

public class CommandLine {
    public CommandLine() {
        Logger logger = Logger.getInstance("log.txt");
        logger.log("Command Line created");
    }
}
