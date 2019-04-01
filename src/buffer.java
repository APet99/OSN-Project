/**
 * get and set (send/receive) of buffer data
 *
 * Created By: Alex Peterson
 * Created On: February 24, 2019
 * Created For: EGR226-A OS/Networking Project 1
 *
 * Discussed With Chase
 *
 * Contact:
 *      AlexJoseph.Peterson@CalBaptist.edu
 *      (909)705-6842
 **/

public class buffer {
    private messaging[] bufferBacking;
    //constructor(s):
    public buffer(int cap, String message){
        bufferBacking = new messaging[cap];
        bufferBacking[0] = new messaging(message);
    }
    public buffer(int max){
        bufferBacking = new messaging[max];
    }

    //methods:
    //set message
    public void setBuffers(int boxNum, String message) {
        for(int i = 0; i < bufferBacking.length; i++){
            if(bufferBacking[i].getID() == boxNum){
                for(int j = 0; j < bufferBacking[i].getMsgLength(); j ++){
                    if(bufferBacking[i].getMsg(j) == null) {
                        bufferBacking[i].setMessage(j, message);
                    }
                }
            }
        }
    }
    //get message for the respective boxNum
    //pre:  @param boxNum is the location to read the message from
    //      @param
    public String getMessage(int boxNum, int msgNum){
        for(int i = 0; i < bufferBacking.length; i++){
            if(bufferBacking[i].getID() == boxNum){ //if the box numbers match
                return bufferBacking[i].getMsg(boxNum);
            }
        }
        return null;
    }
}