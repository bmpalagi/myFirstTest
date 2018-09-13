import java.util.*;


public class Grid
{
   private static final int SIZE = 10;
   int[][] pixels = new int[SIZE][SIZE];

   /**
      Flood fill, starting with the given row and column.
   */
   public void floodfill(int row, int collumn)
   {
        //Fill the dda with zeros
        for (int q = 0; q<10; q++)
        {
            for (int w = 0; q<10; q++ )
            {
                pixels[q][w] = 0;
            }
        }
        
        //Makes stack
        Stack<Pair> stack = new Stack<>();
        
        //Creates initial Pair
        Pair start = new Pair(row,collumn,1);
        
        
        //Sets current value at 1
        int currentValue = 2;
        
        stack.push(start);
        
        int o = 0;
        
        while (o<100){
            
            //Pops the top value off the stack
            Pair x = stack.pop();
                                
            if (x.getRow()>0 && pixels[x.getRow() -1][x.getCollumn()] == 0)
            {
                stack.push(new Pair(x.getRow() -1,x.getCollumn(),currentValue));
                currentValue++;
            }
            
            if (x.getCollumn()<9 && pixels[x.getRow()][x.getCollumn()+1] == 0)
            {
                stack.push(new Pair(x.getRow(),x.getCollumn()+1,currentValue));
                currentValue++;
            }
            
            if (x.getRow()<9 && pixels[x.getRow() +1][x.getCollumn()] == 0)
            {
                stack.push(new Pair(x.getRow() +1,x.getCollumn(),currentValue));
                currentValue++;
            }
            
            if (x.getCollumn()>0 && pixels[x.getRow()][x.getCollumn()-1] == 0)
            {
                stack.push(new Pair(x.getRow(),x.getCollumn()-1,currentValue));
                currentValue++;
            }
            
            o++;
        }
      
   }

   @Override
   public String toString()
   {
      String r = "";
      for (int i = 0; i < SIZE; i++)
      {
         for (int j = 0; j < SIZE; j++)
            r = r + String.format("%4d", pixels[i][j]);
         r = r + "\n";
      }
      return r;
   }
}
