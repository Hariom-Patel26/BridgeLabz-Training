// Creating Class with name PerimeterofaRectangle indicating the purpose is to Calculate the Perimeter of a Rectangle and Display results.
class PerimeterofaRectangle {
    public static void main (String [] args){
    Scanner kb = new Scanner (System.in);
    int length = kb.nextInt();
    int width = kb.nextInt();

    // Calculating the perimeter of rectangle.
    int perimeter = 2 * (length + width);

    //display the perimeter of rectangle.
    System.out.println(perimeter);
    }

}