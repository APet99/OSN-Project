
public class PRB {
    //the information/data a PRB holds, will be noted Here: (I am unsure of what fields A PRB contains that a PCB does not)
    private int processState; // multiple possible states
    private int programCounter;
    private int registers;
    private int memoryLimits;

    public void setProcessState(int processState) {
        this.processState = processState;
    }

    public void setProgramCounter(int programCounter) {
        this.programCounter = programCounter;
    }

    public void setRegisters(int registers) {
        this.registers = registers;
    }

    public void setMemoryLimits(int memoryLimits) {
        this.memoryLimits = memoryLimits;
    }

    public int getProcessState() {
        return processState;
    }

    public int getProgramCounter() {
        return programCounter;
    }

    public int getRegisters() {
        return registers;
    }

    public int getMemoryLimits() {
        return memoryLimits;
    }

}
