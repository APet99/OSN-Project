/**
 * Class of PCB, with access to retrieve or change PCB components
 *
 * Created By: Alex Peterson
 * Created On: February 8, 2019
 * Created For: EGR226-A OS/Networking Project 1
 *
 * Contact:
 *      AlexJoseph.Peterson@CalBaptist.edu
 *      (909)705-6842
*/

import java.util.*;

//PCB an it's components
public class PCB {
    //components of a PCB
    private int processState = 1; // multiple possible states
    private int processNumber = 1;
    private int programCounter;
    private int registers;
    private int memoryLimits;
    private ArrayList<String> openFilesList;

    //default constructor
    public PCB(){
        processState =0;
        processNumber++;
        programCounter = 0;
        registers = 0;
        memoryLimits =0;
        openFilesList =  new ArrayList<>();
    }

    //longTermScheduler--Converts a PRB into a PCB
    public PCB(PRB processRequest){
        processState = processRequest.getProcessState();
        processNumber++; // each PCB will have a unique process number (incremental)
        programCounter = processRequest.getProgramCounter();
        registers = processRequest.getRegisters();
        memoryLimits =processRequest.getMemoryLimits();
        openFilesList =  new ArrayList<>();
    }
    /**
     * Getter/Setters for PCB data types
     */

    //Set value of the Process State
    public void setProcessState(int newVal){
        processState = newVal;
    }
    //Get value of the Process State
    public int getProcessState(){
        return processState;
    }


    //Set value of the Process Number
    public void setProcessNumber (int newVal){
        processNumber = newVal;
    }
    //Get value of the Process Number
    public int getProcessNumber(){
        return processNumber;
    }


    //Set value of the Program Counter
    public void setProgramCounter(int newVal){
        programCounter = newVal;
    }
    //Get value of the Program Counter
    public int getProgramCounter(){
        return  programCounter;
    }


    //Set value of the Registers
    public void setRegisters(int newVal){
        registers = newVal;
    }
    //Get value of the Registers
    public int getRegisters(){
        return registers;
    }


    //Set value of the Memory Limits
    public void setMemoryLimits(int newVal){
        memoryLimits = newVal;
    }
    //Get value of the Memory Limits
    public int getMemoryLimits(){
        return memoryLimits;
    }


    //Add value to the Open Files List
    public void addOpenFile(String fileToAdd){
        if(fileToAdd == null) throw new IllegalStateException("ERROR: Cannot add a null file!");
        else if(openFilesList.contains(fileToAdd)) throw new IllegalStateException("ERROR: The file is already in the list of Open Files!");
        else openFilesList.add(fileToAdd);
    }
    //Get contents of the Open File List
    public ArrayList<String> getOpenFile(){
        return openFilesList;
    }

}