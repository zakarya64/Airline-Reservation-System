public class Seat
{
    private String seatType;
    private int seatNumber;
    private boolean isAssigned;
    
    public Seat(String seatType, int seatNumber){
    
    this.seatType = seatType;
    this.seatNumber = seatNumber;
    isAssigned = false;
    
    
    }
    
    public void setType(String seatType){
    
    this.seatType = seatType;
    
    }
    
    public void setNum(int seatNumber){
    
    this.seatNumber = seatNumber;
    
    }
    
    public String getSeatType(){
    
    return seatType;
    }
    
    public int getSeatNumber(){
    
    return seatNumber;
    }
    
    public boolean getIsAssigned(){
    
    return isAssigned;
    }
}
