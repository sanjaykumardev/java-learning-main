package busResv;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Booking {
  String passenger;
  int busNo;
  Date date;

  // constructor
  Booking() throws ParseException{
    Scanner sc = new Scanner(System.in);
    System.out.println(" Enter name the passenger: ");
    passenger = sc.next();
    System.err.println("Enter bus no :");
    busNo = sc.nextInt();
    System.out.println("Enter data dd-mm-yyyy :");
    String  dateinput = sc.next();
    SimpleDateFormat dateformat = new SimpleDateFormat("dd-mm-yyy");
    date =  dateformat.parse(dateinput);

    public boolean isAvailable(ArrayList<Booking> bookings , ArrayList<Bus> buses ){
      int capacity = 0;
      for(Bus bus: buses){
       if(bus.getBusnum() == busnum){
           capacity = bus.getCapacity();
       }
      }
    }
  }
}
