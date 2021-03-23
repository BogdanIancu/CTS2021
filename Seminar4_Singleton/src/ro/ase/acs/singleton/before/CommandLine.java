package ro.ase.acs.singleton.before;

public class CommandLine {
    public CommandLine() {
        Logger logger = new Logger("log.txt");
        logger.log("Command Line created");
    }
}
