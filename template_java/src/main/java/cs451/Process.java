package cs451;
import java.util.ArrayList;


/**
 * Class that represents the current running Process
 */
public class Process{

    private final int id ;
    private final int numMsg;
    private final ArrayList<String> outputLog = new ArrayList<>();
    private String outputPath;
    private final PerfectLink perfectLink ;
    private boolean isRunning = true ;

    public Process(int id, int numMsg, String outputPath){
        this.id = id;
        this.numMsg = numMsg;
        this.outputPath = outputPath;
    }

    /**
     * start Running the process
     */
    public void run(){

    }

    /**
     * halt the process
     */
    public void stop() {
        isRunning = false ;

    }

    /**
     * deals with recieved messages from other process it is communicating with
     */
    public void deliver(int senderId, int seqNr){

    }

    /**
     * writes the logs the activity of the process to the specified output file
     */
    public void writeOutputLog(){

    }




}