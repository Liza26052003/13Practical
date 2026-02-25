// Code is stored as 13template.java
import java.lang.Math.*;   import java.io.*;   import java.text.*;
import java.util.Scanner;

public class timeMethods{
 
public static int N = target;
public static void main(String args[]){

DecimalFormat twoD = new DecimalFormat("0.00");
DecimalFormat fourD = new DecimalFormat("0.0000");
DecimalFormat fiveD = new DecimalFormat("0.00000");

long start, finish;
double runTime = 0, runTime2 = 0, time;
double totalTime = 0.0;
int n = N;
int repetition, repetitions = 30;

   runTime = 0;
   for(repetition = 0; repetition < repetitions; repetition++) {
      start = System.currentTimeMillis();
		
      // call the procedures to time here:
      linearsearch (numbers, N);
      binarysearch (numbers,0,numbers.length-1, N);
      // Figure out how to alter this guideline here,
		
      finish = System.currentTimeMillis();
			
      time = (double)(finish - start);
      runTime += time;
      runTime2 += (time*time); }

   double aveRuntime = runTime/repetitions;
   double stdDeviation = 
      Math.sqrt(runTime2 - repetitions*aveRuntime*aveRuntime)/(repetitions-1);

   System.out.printf("\n\n\fStatistics\n");
   System.out.println("________________________________________________");
   System.out.println("Total time   =           " + runTime/1000 + "s.");
   System.out.println("Total time\u00b2  =           " + runTime2);
   System.out.println("Average time =           " + fiveD.format(aveRuntime/1000)
                     + "s. " + '\u00B1' + " " + fourD.format(stdDeviation) + "ms.");
   System.out.println("Standard deviation =     " + fourD.format(stdDeviation));
   System.out.println("n            =           " + n);
   System.out.println("Average time / run =     " + fiveD.format(aveRuntime/n*1000) 
                     + '\u00B5' + "s. "); 

   System.out.println("Repetitions  =             " + repetitions);
   System.out.println("________________________________________________");
   System.out.println();
   System.out.println(); 

      int[] numbers = new int[50]; 
        int index = 0;

        try (Scanner scanner = new Scanner(new File("ulysses.numbered"))) {
            while (scanner.hasNextInt() && index < numbers.length) {
                numbers[index++] = scanner.nextInt();
            }
        } catch (Exception e) {
            System.out.println("File error: " + e.getMessage());
        }
    }                   
// The declarations and body of your method / s  

public static int linearsearch(int[] numbers,int target){

   for(int i=0;i<numbers.length;i++){
      if (N ==numbers[i]){return numbers[i];

      }
      else
         {return -1;}
   }


   public static int binarysearch(int[] numbers;int low;int high;int target) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
         if (numbers[mid] == target){ return numbers[mid];}
            if (numbers[mid] < target){ low = mid + 1;
            binarysearch(numbers,low,mid-1,target);}
            else{
            high = mid - 1;
            binarysearch(numbers,mid+1,high,target);}
             
        }
        return -1;
    }
}}

// The final statement of this code.} }
