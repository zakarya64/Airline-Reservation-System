public class Plane
{
    private String route;
    private int routeNum;
    private Seat seats[];
    public Plane(){
    seats = new Seat[15];
    seats[0] = new Seat("First Class", 1);
    seats[1] = new Seat("First Class", 2);
    seats[2] = new Seat("First Class", 3);
    seats[3] = new Seat("First Class", 4);
    seats[4] = new Seat("First Class", 5);
    seats[5] = new Seat("Economy", 6);
    seats[6] = new Seat("Economy", 7);
    seats[7] = new Seat("Economy", 8);
    seats[8] = new Seat("Economy", 9);
    seats[9] = new Seat("Economy", 10);
    seats[10] = new Seat("Economy", 11);
    seats[11] = new Seat("Economy", 12);
    seats[12] = new Seat("Economy", 13);
    seats[13] = new Seat("Economy", 14);
    seats[14] = new Seat("Economy", 15);
    
    }
    
    public Seat getSeat(int Num){
    
    return seats[Num - 1];
    
    }
    
    public String assignSeat(String firstOrEcon){
    
    for(int i = 0; i < seats.length; i++){
    
        if(seats[i].getIsAssigned() == false){
        
        if(i < 5){
        
        return "First Class";
        
        }
        
        else{
        
        return "Economy";
        
        }
        
        }
        
        else{
        
            return null;
        
        }
    
    
    }
    return firstOrEcon;
    }
    
    public String getRoute(){
    
    return route;
    }
    
    public int getRouteNum(){
    
    return routeNum;
    }
}

