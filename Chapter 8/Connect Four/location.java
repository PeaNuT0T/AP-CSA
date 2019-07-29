// Builder Class for ConnectFour_Runner.java
// By Talon Huang & Nick Gong

public class location
{
  private String token = " ";
  public location(){
  }
  public String toString(){
    return token;
  }
  public String getToken(){
    return token;
  }
  public void setX(){
    token = "X";
  }
  public void setO(){
    token = "O";
  }
}