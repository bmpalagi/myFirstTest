import java.util.*;

public class parking
{
    
    public static void main(String[] args)
    {
        System.out.println("Welcome to Julies Parking, enter your license plate number to add your car");
        System.out.println("put a negetive infront of the licenseplate to remove it, put a 0 to end");
        
        Scanner scan = new Scanner(System.in);
        
        Stack<Integer> driveWay = new Stack<>();
        Stack<Integer> street = new Stack<>();
        
        int plate = 1;
        
        while (plate != 0)
        {
            System.out.print("License Plate: ");
            plate = scan.nextInt();
            
            if (plate > 0)
            {
                driveWay.push(plate);
                
                System.out.println(driveWay);
            }
            
            if (plate < 0)
            {
                
                while (!driveWay.empty())
                {
                    int x = driveWay.pop();
                    
                    if (x == Math.abs(plate))
                    {
                        System.out.println("Driveway: " + driveWay);
                        System.out.println("Street" + street);
                        
                        while (!street.empty())
                        {
                            driveWay.push(street.pop());
                            System.out.println("Driveway: " + driveWay);
                            System.out.println("Street" + street);
                            
                        }
                        
                        System.out.println("Car has been removed, Have a nice day!");
                        break;
                    }
                    
                    else if (!driveWay.empty())
                    {
                        street.push(x);
                        System.out.println("Driveway: " + driveWay);
                        System.out.println("Street" + street);
                            
                        
                        
                    }
                    else 
                    {
                        System.out.println("No car on the driveway has that license plate");
                    }
                }
               
                
            }
            
        }
        
    }
}
