import java.util.*;
class VolumeofaCylinder{
    public static void main (String []args){
    Scanner kb = new Scanner (System.in);
    int Radius =kb.nextInt();
    int  Height = kb.nextInt();

    double Volume = 3.14 * Radius *Radius *Height;

    System.out.println(Volume);
   }
}