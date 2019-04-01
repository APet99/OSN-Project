/**
 * Queue Movement of PCB via the use of a short term scheduler
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
import java.util.LinkedList;

public class ShortTerm {
    public static void main(String[] args) throws InterruptedException {
        //variables:
        Queue<PRB> requestBlocks = new LinkedList<>();
        Queue<PCB> readyQueue = new LinkedList<>();//Queue of ready/waiting PCB
        Queue<PCB> IOblockedQueue = new LinkedList<>();//Queue of blocked PCB (potentially waiting for resources
        PCB runningPCB = new PCB(); // The current process execution


        /*
        * Updated for Assignment 6 converting PRB into a PCB instance
        * **/
        // turns PRB into PCB and adds to the Ready Queue
        // each PCB has a unique process Number that distinguishes one from another
        System.out.println("PCBs to Consider: ");
       while(!requestBlocks.isEmpty()){
             PCB newPCB = new PCB(requestBlocks.remove());
             readyQueue.add(newPCB);
       }
        System.out.println();
        System.out.println();

        //SHORT TERM SCHEDULER
        //As long as there is a PCB waiting to be executed, the process will continue to be considered
        //An odd processNumber is used to pseudo-test whether a process is ready to execute or if it should be sent to the blocked queue to await resources
        //Otherwise, the process executes successfully, and no longer required to be placed in a queue awaiting execution
        //pre:
        //  - readyQueue.size() != 0
        //  - IOblockedQueue.size() != 0
        //Note: only even PCB print, because add evens processNumbers Execute, and all odd increment by one, making them even (thus resulting in even outputs)
        while(!readyQueue.isEmpty() || !(IOblockedQueue.isEmpty())) {
            runningPCB = readyQueue.remove();

            if(runningPCB.getProcessNumber() % 2 == 1) { // if the process number is odd, simulates missing resources
                runningPCB.setProcessNumber(runningPCB.getProcessNumber() + 1);
                IOblockedQueue.add(runningPCB);
                readyQueue.add(IOblockedQueue.remove());
            } else {
                runningPCB = readyQueue.remove();
            }
        }
    }

    /*
     * Updated for Assignment 6 converting PRB into a PCB instance
     * **/
    //finds and returns a PCB based on a Process Number
    //pre:  @param queueToCheck is the queue to search for the PCB in
    //      @param processNumber is the processNumber of the PCB to locate
    //post: @retuns the PCB with the given processNumber
    public PCB find(Queue<PCB> queueToCheck, int processNumber){
        for(PCB currentPCB : queueToCheck){
            if(currentPCB.getProcessNumber() == processNumber)
                return currentPCB;
        }
        return null;
    }
}