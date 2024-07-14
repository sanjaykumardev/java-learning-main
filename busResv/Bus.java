package busResv;

public class Bus {
  private int busnum;
  private boolean ac;
  private  int capacity;
  
  Bus(int no , boolean ac , int cap){
    this.busnum = no;
    this.ac = ac;
    this.capacity = cap;
  }
  public int getBusnum(){
   return busnum;
  }
  public void setBusnum(int no){
   busnum = no;
  }
  public boolean getac(){
    return ac;
  }
  public void setac(boolean val){
    ac = val;
  }
  public int getCapacity(){
     return capacity;
  }
  public void setCapacity(int cap){
    capacity = cap;
  }

   public void displayinfo(){
    System.out.println("Bus No:" + busnum +  " AC: " +  ac  +   " TotalCapacity: "  +  capacity);
   }
} 
