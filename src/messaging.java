/**
 * Message System to send and receive buffer data for processes
 *
 * Created By: Alex Peterson
 * Created On: February 24, 2019
 * Created For: EGR226-A OS/Networking Project 1
 *
 * Discussed with Chase
 *
 * Contact:
 *      AlexJoseph.Peterson@CalBaptist.edu
 *      (909)705-6842
 */

//process communication system
public class messaging {
    private int messageID;
    private String[] messageContents;

  //constructor:
  public messaging(String message){
      messageContents = new String[10];
      messageContents[0] = message;
      messageID = 0;
  }

  //methods:
  //setter:
  //sets the message
  public void setMessage(int messageIndex, String message){
      this.messageContents[messageIndex] = message;
  }

  //getters:
  //gets the message
  public String getMsg(int messageIndex){
      return messageContents[messageIndex];
  }

  //gets the length of the message
  public int getMsgLength(){
        return messageContents.length;
  }

  //gets the messageID
  public int getID(){
      return messageID;
  }
}