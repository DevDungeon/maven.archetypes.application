package com.devdungeon.apps.${artifactId};

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

/**
 *
 * @author Name <email>
 */
public class SampleMain {
    
    private final static Logger LOGGER = LogManager.getRootLogger();
    private static Options options = new Options();
    private static CommandLine cmd;
    
    private static void addCLIOptions() {
        options.addOption("h", "help", false, "print this help message");
    }
    
    private static void parseCLIOptions(String[] args) throws ParseException {
        CommandLineParser parser = new DefaultParser();
        cmd = parser.parse(options, args);

        // Handle help
        if (cmd.hasOption("h")) {
            HelpFormatter formatter = new HelpFormatter();
            formatter.printHelp( "PortScanner", options);
            System.exit(0);
        }
    }
    
    public static void main(String[] args) {
        LOGGER.info("[*] Initializing...");
        
        addCLIOptions();
        try {
            parseCLIOptions(args);
        } catch (ParseException e) {
            LOGGER.error("[-] Error parsing command line arguments: " + e.getMessage());
            LOGGER.error("[-] Use -h or --help to print usage.");
            System.exit(1);
        }
        
    }
}
   