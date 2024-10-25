import java.util.Scanner;
public class Layout
{
    private Controls c;
    
    public Layout(){
    
    c = new Controls();
    }
    
    public static void banner(){
    
    System.out.println("_____");
     System.out.println("_|_");
System.out.println("____( * )____");
  System.out.println("//----\\");
  System.out.println("0      0");
           

      
}

public static int mainScreen(){

 Scanner reader = new Scanner(System.in);
 System.out.println("Would you like to exit or enter? (1/2)");
 int ans = reader.nextInt();
 
 return ans;
    
    
    

    }
    
public static void exitScreen(){

    Layout.banner();
    System.out.println("Goodbye!");

}

public static void main(String[] args){
    int ans = 0;
    Layout.mainScreen();
    if(ans == 1){
        
        c.enterApplication();
    
    
    
    }
    
    else if(ans == 2){
    
    Layout.exitScreen();
    
    }
    


}
 

}



