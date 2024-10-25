import java.util.Scanner;
public class Controls
{
    private Airline airli;
    private Plane plane;
    
    public Controls(){
    
    airli = new Airline();
    plane = new Plane();
    }
    
    public static int getSeatType(){
    Scanner reader = new Scanner(System.in);
    System.out.println("Would you like a first class seat or Economy? (First = 1/ Econ = 2)");
    int ans = reader.nextInt();
    System.out.println("Would you like another seat? (Yes = 1/ No = 2)");
    int ansR = reader.nextInt();
    return ans;
   
}

    public int getFlight(int flight){
    
        Layout.banner();
        airli.showFlights();
        Scanner reader = new Scanner(System.in);
        System.out.println("Please select a flight by flight number: ");
        flight = reader.nextInt();
        airli.getPlane(flight);
        return flight;
    
    }
    
    public void successful(int seatNum, String classType){
    
    System.out.println("BOARDING PASS: " + seatNum + ", " + classType);
    
    }
    
    public Plane switchCabin(String classType, Plane plane){
    
    plane.assignSeat(classType);
    Scanner reader = new Scanner(System.in);
    System.out.println("The cabin is full. Would you like to switch cabins? (1 for yes, 2 for no): ");
    int ans = reader.nextInt();
    
    if(ans == 1){
    
    plane.assignSeat(classType);
    successful(ans, classType);
    
    }
    
    else if(ans == 2){
    
    System.out.println("Next flight leaves in 3 hours...");
    
    }
    
    
    }
    
    public Plane enterApplication(){
    
    getFlight(int flight);
    while(plane != null){
    
    fillPlane(plane);
    Layout.banner();
    Scanner reader=  new Scanner(System.in);
    System.out.println("Do you want to select a destination?: ");
    int ans = reader.nextInt();
    if(ans == 1){
    
    Controls.getFlight(Plane);
    }
    
    }
    
    }
    
}

