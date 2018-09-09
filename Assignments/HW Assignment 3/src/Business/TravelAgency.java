/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Yash
 */
public class TravelAgency {
    
    public int BAflight1()
    {
      Fleet fleet = new Fleet();  
      Airplane plane;
      Person person;
      FlightSchedule flightSch;
      CustomerDirectory custDir = new CustomerDirectory();
      MasterSchedule mast = new MasterSchedule();
      Airliner ar = new Airliner();
        ar.setAirlinerName("British Airways");
        plane = fleet.addAirplane();
        plane.setAirport("Logan Airport, Boston");
        plane.setManufacturedBy("Airbus");
        plane.setManufactureYear(2015);
        plane.setFlightNo("BA101");
        plane.setTotalNumberOfSeats(150);
        flightSch = mast.addFlightSchedule();
        flightSch.setDate("09/29/2017");
        flightSch.setTime("17:00");
    String filename = "src\\Business\\Flight1.csv";
         File file = new File(filename);
        try {
            Scanner inputStream = new Scanner(file);
            while(inputStream.hasNext())
            {
                String data = inputStream.next();
                String[] values = data.split(",");
                person = custDir.addPerson();
                person.setSerialNo(Integer.parseInt(values[0]));
                person.setfName(values[1]);
                person.setlName(values[2]);
                person.setSeatNo(values[3]);
                person.setSeatType(values[4]);
                person.setTicketCost(Integer.parseInt(values[5]));
                //System.out.println(data);     
            }
            inputStream.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TravelAgency.class.getName()).log(Level.SEVERE, null, ex);
    }
        
       String name =  ar.getAirlinerName();
        System.out.println("Airliner:" + name+"\n");
        String airlineNo = plane.getFlightNo();
        System.out.println("Airline No: " + airlineNo);
        String date = flightSch.getDate();
        String time = flightSch.getTime();
        String airport = plane.getAirport();
        String manuby  = plane.getManufacturedBy();
        System.out.println("Manufactured by: "+manuby);
        System.out.println("Airport : "+airport);
        System.out.println("Date:" +date+"\t Time"+time+"\n");
        System.out.println("Seat Capacity : 150");    
        int i=0;
        int revenue=0;
        int count = 0;
        for(Person cust :custDir.getCustDir())
            {
                Object[] col = new Object[6];
                
                col[0] = cust.getSerialNo();
                System.out.print(col[0]+"\t\t");
                col[1] = cust.getfName();
                System.out.print(col[1]+"\t\t");
                col[2] = cust.getlName();
                System.out.print(col[2]+"\t\t");
                col[3] = cust.getSeatNo();
                System.out.print(col[3]+"\t\t");
                col[4] = cust.getSeatType();
                System.out.print(col[4]+"\t\t");
                col[5] = cust.getTicketCost();
                System.out.print(col[5]+"\n");
                i = (Integer)col[5];
                revenue = revenue +i;
                count++;
            }
        System.out.println("Total number of seats filled are :"+ count);
      return revenue;
}
    
    public int BAFlight2()
    {
        Fleet fleet = new Fleet();  
      Airplane plane;
      Person person;
      FlightSchedule flightSch;
      CustomerDirectory custDir = new CustomerDirectory();
      MasterSchedule mast = new MasterSchedule();
      Airliner ar = new Airliner();
        ar.setAirlinerName("British Airways");
        plane = fleet.addAirplane();
        plane.setAirport("JFK, New York City");
        plane.setManufacturedBy("Airbus");
        plane.setManufactureYear(2015);
        plane.setFlightNo("BA202");
        plane.setTotalNumberOfSeats(150);
        flightSch = mast.addFlightSchedule();
        flightSch.setDate("10/09/2017");
        flightSch.setTime("23:00");
    String filename = "src\\Business\\Flight1.csv";
         File file = new File(filename);
        try {
            Scanner inputStream = new Scanner(file);
            while(inputStream.hasNext())
            {
                String data = inputStream.next();
                String[] values = data.split(",");
                person = custDir.addPerson();
                person.setSerialNo(Integer.parseInt(values[0]));
                person.setfName(values[1]);
                person.setlName(values[2]);
                person.setSeatNo(values[3]);
                person.setSeatType(values[4]);
                person.setTicketCost(Integer.parseInt(values[5]));
                //System.out.println(data);     
            }
            inputStream.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TravelAgency.class.getName()).log(Level.SEVERE, null, ex);
    }
    String name =  ar.getAirlinerName();
        System.out.println("Airliner:" + name+"\n");
        String airlineNo = plane.getFlightNo();
        System.out.println("Airline No: " + airlineNo);
        String airport = plane.getAirport();
        System.out.println("Airport: " + airport);
        String date = flightSch.getDate();
        String time = flightSch.getTime();
        String manuby  = plane.getManufacturedBy();
        System.out.println("Manufactured by: "+manuby);
        System.out.println("Date:" +date+"\t Time"+time+"\n");
        System.out.println("Seat Capacity : 150");    
        int i=0;
        int revenue=0;
        int count = 0;
        for(Person cust :custDir.getCustDir())
            {
                Object[] col = new Object[6];
                
                col[0] = cust.getSerialNo();
                System.out.print(col[0]+"\t\t");
                col[1] = cust.getfName();
                System.out.print(col[1]+"\t\t");
                col[2] = cust.getlName();
                System.out.print(col[2]+"\t\t");
                col[3] = cust.getSeatNo();
                System.out.print(col[3]+"\t\t");
                col[4] = cust.getSeatType();
                System.out.print(col[4]+"\t\t");
                col[5] = cust.getTicketCost();
                System.out.print(col[5]+"\n");
                i = (Integer)col[5];
                revenue = revenue +i;
                count++;
            }
        System.out.println("Total number of seats filled are :"+ count);
         return revenue;
    }
    public int JBFlight1()
    {
        Fleet fleet = new Fleet();  
      Airplane plane;
      Person person;
      FlightSchedule flightSch;
      CustomerDirectory custDir = new CustomerDirectory();
      MasterSchedule mast = new MasterSchedule();
        Airliner ar = new Airliner();
        ar.setAirlinerName("Jet Blue");
        plane = fleet.addAirplane();
        plane.setAirport("Los Angeles International, LA");
        plane.setManufacturedBy("Turpov");
        plane.setManufactureYear(2012);
        plane.setFlightNo("JB101");
        plane.setTotalNumberOfSeats(150);
        flightSch = mast.addFlightSchedule();
        flightSch.setDate("10/02/2017");
        flightSch.setTime("12:00");
        
    String filename = "src\\Business\\Flight2.csv";
         File file = new File(filename);
        try {
            Scanner inputStream = new Scanner(file);
            while(inputStream.hasNext())
            {
                String data = inputStream.next();
                String[] values = data.split(",");
                person = custDir.addPerson();
                person.setSerialNo(Integer.parseInt(values[0]));
                person.setfName(values[1]);
                person.setlName(values[2]);
                person.setSeatNo(values[3]);
                person.setSeatType(values[4]);
                person.setTicketCost(Integer.parseInt(values[5]));
                //System.out.println(data);
                
            }
            inputStream.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TravelAgency.class.getName()).log(Level.SEVERE, null, ex);
    }
        String name =  ar.getAirlinerName();
        System.out.println("Airliner:" + name+"\n");
        String airlineNo = plane.getFlightNo();
        System.out.println("Airline No: " + airlineNo);
        String airport = plane.getAirport();
        System.out.println("Airport: " + airport);
        String date = flightSch.getDate();
        String time = flightSch.getTime();
        String manuby  = plane.getManufacturedBy();
        System.out.println("Manufactured by: "+manuby);
        System.out.println("Date:" +date+"\t Time"+time+"\n");
        System.out.println("Seat Capacity : 150");    
        int i=0;
        int revenue=0;
        int count =0;
        for(Person cust :custDir.getCustDir())
            {
                Object[] col = new Object[6];
                
                col[0] = cust.getSerialNo();
                System.out.print(col[0]+"\t\t");
                col[1] = cust.getfName();
                System.out.print(col[1]+"\t\t");
                col[2] = cust.getlName();
                System.out.print(col[2]+"\t\t");
                col[3] = cust.getSeatNo();
                System.out.print(col[3]+"\t\t");
                col[4] = cust.getSeatType();
                System.out.print(col[4]+"\t\t");
                col[5] = cust.getTicketCost();
                System.out.print(col[5]+"\n");
                i = (Integer)col[5];
                revenue = revenue +i;
                count++;
            }
        System.out.println("Total number of seats filled are :"+ count);
         return revenue;
         
    }
    
    public int JBFlight2()
    {
    Fleet fleet = new Fleet();  
      Airplane plane;
      Person person;
      FlightSchedule flightSch;
      CustomerDirectory custDir = new CustomerDirectory();
      MasterSchedule mast = new MasterSchedule();
        Airliner ar = new Airliner();
        ar.setAirlinerName("Jet Blue");
        plane = fleet.addAirplane();
        plane.setAirport("Heathrow, London");
        plane.setManufacturedBy("Turpov");
        plane.setManufactureYear(2013);
        plane.setFlightNo("JB201");
        plane.setTotalNumberOfSeats(150);
        flightSch = mast.addFlightSchedule();
        flightSch.setDate("10/22/2017");
        flightSch.setTime("2:00");
    String filename = "src\\Business\\Flight2.csv";
         File file = new File(filename);
        try {
            Scanner inputStream = new Scanner(file);
            while(inputStream.hasNext())
            {
                String data = inputStream.next();
                String[] values = data.split(",");
                person = custDir.addPerson();
                person.setSerialNo(Integer.parseInt(values[0]));
                person.setfName(values[1]);
                person.setlName(values[2]);
                person.setSeatNo(values[3]);
                person.setSeatType(values[4]);
                person.setTicketCost(Integer.parseInt(values[5]));
                //System.out.println(data);
                
            }
            inputStream.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TravelAgency.class.getName()).log(Level.SEVERE, null, ex);
    }
        String name =  ar.getAirlinerName();
        System.out.println("Airliner:" + name+"\n");
        String airlineNo = plane.getFlightNo();
        System.out.println("Airline No: " + airlineNo);
        String airport = plane.getAirport();
        System.out.println("Airport: " + airport);
        String date = flightSch.getDate();
        String time = flightSch.getTime();
        String manuby  = plane.getManufacturedBy();
        System.out.println("Manufactured by: "+manuby);
        System.out.println("Date:" +date+"\t Time"+time+"\n");
        System.out.println("Seat Capacity : 150");    
        int i=0;
        int revenue=0;
        int count = 0;
        for(Person cust :custDir.getCustDir())
            {
                Object[] col = new Object[6];
                
                col[0] = cust.getSerialNo();
                System.out.print(col[0]+"\t\t");
                col[1] = cust.getfName();
                System.out.print(col[1]+"\t\t");
                col[2] = cust.getlName();
                System.out.print(col[2]+"\t\t");
                col[3] = cust.getSeatNo();
                System.out.print(col[3]+"\t\t");
                col[4] = cust.getSeatType();
                System.out.print(col[4]+"\t\t");
                col[5] = cust.getTicketCost();
                System.out.print(col[5]+"\n");
                i = (Integer)col[5];
                revenue = revenue +i;
                count++;
            }
        System.out.println("Total number of seats filled are :"+ count);
         return revenue;
    }
}
