import java.util.Scanner;
class SmallestAndLargest{
    // create a method to find the smallest and the largest of the 3 numbers

    public static int[] compare(int number1, int number2, int number3){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        if (number1 > number2 && number1 > number3){
            largest = number1;
        }
        else if(number2 > number3){
               largest = number2;
        }
        else {
            largest = number3;
        }
        if (number1 < number2 && number1 < number3) {
            smallest = number1;
        }
        else if (number2 < number3) {
            smallest = number2;
        }
        else {
            smallest = number3;
        }
        return new int[]{largest, smallest};
    }
    public static void main (String []args){
        Scanner input = new Scanner (System.in);

       // Input section : taking input from user
       System.out.println("Enter a number : ");
       int number1 = input.nextInt();
       int number2 = input.nextInt();
       int number3 = input.nextInt();
       

      // method call
      int result[] = compare (number1, number2, number3);
           
      // Display sum of first n natural number.
      System.out.println("The smallest and largest numbers is "+result[1]+ " and " +result[0]);
      input.close();
    }
}
