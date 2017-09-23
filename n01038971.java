//Taylor Pierson
//Computer Science 2
//This program takes two arrays and performs many methods with said arrays.
//9/23/17
import java.util.Scanner;
import java.text.DecimalFormat;
public class n01038971
{
 public static void main(String[] args)
   {      
      int[][] matrix = new int[3][3];
      int[][] matrixB = new int[3][3];
      java.util.Scanner input = new Scanner(System.in);
      System.out.println("Enter " + matrix.length + "rows and " + matrix[0].length + "columns for the first array " + 
      "and enter " + matrixB.length + "rows and " + matrixB[0].length + "columns for the second array ");
      
      for(int i=0; i< matrix.length; i++)
      {
         for(int j=0; j< matrix[i].length; j++)
         {
            matrix[i][j] = input.nextInt();
         }
      }
      
      for(int i=0; i< matrixB.length; i++)
      {
         for(int j=0; j< matrixB[i].length; j++)
         {
            matrixB[i][j] = input.nextInt();
         }
      }
      
      boolean x = Strict.equals(matrix, matrixB);
      System.out.println("Equals: " + x);
      int count = Strict.howmany(matrix, matrixB);
      System.out.println("Howmany: " + count);
      int DiagonalCount = Strict.diagonal(matrix, matrixB);
      System.out.println("Diagonal: " + DiagonalCount);
      double avg = Strict.average(matrix, matrixB);
      System.out.println("Average: " + avg);
      System.out.println("Display: ");
      Strict.display(matrix,matrixB);
       boolean y = Strict.silly(matrix, matrixB);
       System.out.println("Silly: " + y);
//END OF MAIN
   
   }

}
class Strict
{      
   public static boolean equals(int[][] matrixC, int[][] matrixB)
   {
      for(int i=0; i< matrixC.length; i++)
      {
         for(int j=0; j<matrixC[i].length; j++)
          {
            if (matrixC[i][j] != matrixB[i][j])
             return false; 
         }
      }
      return true;
   }
   
   public static int howmany(int[][] matrixC, int[][] matrixB)
   {
      int count=0;
      for(int i=0; i< matrixC.length; i++)
      {
        for(int j=0; j<matrixC[i].length; j++)
         {     
            if (matrixC[i][j] == matrixB[i][j])
            {
              count++;
            }  
         
         }
      }
      
      return count;
   }

   public static int diagonal(int[][] matrix, int[][] matrixB)
   {
     int count = 0;
      for(int i=0; i< matrix.length; i++)
      {     
        if (matrix[i][i] == matrixB[i][i])
        {
          count++;
        }  
         
      }

      return count;
   }
   
 public static double  average(int[][] matrix,int[][] matrix2)
   {
      int total= 0; 
      double avg;
      for(int i=0; i< matrix.length; i++)
      {
         for(int j=0; j< matrix[i].length; j++)
          {
           total+= matrix[i][j] + matrix2[i][j];
          }
      }
      avg = total/18.0;
      return avg;
   }      
 public static void display(int[][] matrix, int[][] matrixB)
   {
    for(int i=0; i< matrix.length; i++)
      {
         for(int j=0; j< matrix[i].length; j++)
          {
           if(matrix[i][j] %2!=0)
           {
           System.out.print(matrix[i][j]+"\t\t");
           }
           else
           {
           System.out.print("\t\t");
           }
         }
        System.out.println();  
      }
      System.out.println();
      System.out.println();
       for(int i=0; i< matrixB.length; i++)
      {
         for(int j=0; j< matrixB[i].length; j++)
          {
           if(matrixB[i][j] %2!=0)
           {
           System.out.print(matrixB[i][j]+"\t\t");
           }
           else
           {
           System.out.print("\t\t");
           }
         }
        System.out.println();  
      }

   }
   public static boolean silly(int[][] matrix, int[][] matrixB)
   {
   for(int i=0; i< matrix.length; i++)
      {
         for(int j=0; j<matrix[i].length; j++)
          {
            if (matrix[i][j]<=1 || matrix[i][j] >10 || matrixB[i][j] <=1 || matrixB [i][j] >10)
            {
              return false; 
            }
         }
      }
      return true;
   }
} 
