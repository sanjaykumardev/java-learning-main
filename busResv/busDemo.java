package busResv;
import java.util.*;
import java.util.ArrayList;

public class busDemo {
  public static void main(String[] args) {
   

   ArrayList<Booking> bookings = new ArrayList<Booking>();







   ArrayList<Bus> buses = new ArrayList<Bus>();
   buses.add(new Bus(1,true,45));
   buses.add(new Bus(2,true,65));
   buses.add(new Bus(3,true,75));
   buses.add(new Bus(4,true,85));
   buses.add(new Bus(5,true,95));
   
   for(Bus b  : buses){
    b.displayinfo();
   }

  int useroption = 1;
  Scanner sc = new Scanner(System.in);
  while(useroption == 1){
    System.out.println("Enter 1 to book and 2 to exit");
    useroption = sc.nextInt();
    if(useroption == 1){
      System.out.println("Booking.....");
    }else{
      System.out.println("Exit");
    }
  }  
   
  }
}
