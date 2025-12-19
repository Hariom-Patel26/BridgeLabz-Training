// Creating Class with name AverageMarkofSam for Calculating the average mark of sam in PCM.
class AverageMarkofSam {
    public static void main (String [] args){
    // Create variable mathMark, physicsMark and chemistryMark.
    int mathsMark = 94;
    int physicsMark = 95;
    int chemistryMark = 96;

    //Calculating the average mark of sam.
    int average = ((mathsMark+physicsMark+chemistryMark)/3);

    // Print sam's Average Mark.
    System.out.println("Sam’s average mark in PCM is"+average);
    }
}