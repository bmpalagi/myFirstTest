import java.util.*;

/**
   Class for simulating a runway.
*/
public class RunwaySimulator
{

   Queue<String> takeOff = new LinkedList<>();
   Queue<String> landing = new LinkedList<>();
    
   /**
      Constructor.
   */
   public RunwaySimulator()
   {
       
       
   }

   /**
      Add a flight symbol to the taking off queue.
      @param flightSymbol the flight symbol.
   */
   public void addTakeOff(String flightSymbol)
   {
       takeOff.add(flightSymbol);      

   }

   /**
      Add a flight symbol to the landing queue.
      @param flightSymbol the flight symbol.
   */
   public void addLanding(String flightSymbol)
   {
       landing.add(flightSymbol);      

   }

   /**
      Handle the next action.
   */
   public void handleNextAction()
   {
       if (landing.size()>0)
       {
           String x = landing.remove();
           System.out.println(x + " has landed.");
        }
       
       else if (takeOff.size()>0)
       {
           String x = takeOff.remove();
           System.out.println(x + " has taken off.");
        }
        
       else
       {
           System.out.println("There are currently no actions queued.");
        }


   }
}
