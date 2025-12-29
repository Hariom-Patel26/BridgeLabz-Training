//8. Shopkeeper’s Discount Dashboard 🛍️
//A shopkeeper gives discounts based on total bill:
//● Input item prices in a for-loop.
//● Use if-else for discount logic.
//● Use proper indentation, constants, and comments.

import java.util.Scanner;
public class ShopkeeperDiscount  {
    public static void main(String [] args) {
        Scanner kb = new Scanner (System.in);
        System.out.println("-----------------Items Catelog-----------------");
        String [] products = {"1 ------>Maggie" , "2 ------>cookies" , "3 ------>Chips" , "4 ------>sugar" , "5 ------>rice"};
        for (String items : products) {
            System.out.println(items);
        }
        int totalPrice =0;
        int i = 0;
        String [] order = new String [5];
        int [] quantity = new int [5];
        int [] price = new int [5];
        for ( ; ;) {

            System.out.println("enter item to buy : ");
            String item = kb.next().trim().toLowerCase();
            if (item.equals("stop")) {
                break;
            }
            switch (item){
            
                case "maggie" :
                     order [i]= item;
                     System.out.println("Enter quantity");
                     quantity[i] = kb.nextInt();
                     System.out.println("Enter price");
                     price[i] = kb.nextInt();
                     totalPrice += price[i]*quantity[i];
                     i++;
                     break;

                case "cookies" :
                     order [i]= item;
                     System.out.println("Enter quantity");
                     quantity[i] = kb.nextInt();
                     System.out.println("Enter price");
                     price[i] = kb.nextInt();
                     totalPrice += price[i]*quantity[i];
                     i++;
                     break;

                case "chips" :
                     order [i]= item;
                     System.out.println("Enter quantity");
                     quantity[i] = kb.nextInt();
                     System.out.println("Enter price");
                     price[i] = kb.nextInt();
                     totalPrice += price[i]*quantity[i];
                     i++;
                     break;

                case "sugar" :
                     order [i]= item;
                     System.out.println("Enter quantity");
                     quantity[i] = kb.nextInt();
                     System.out.println("Enter price");
                     price[i] = kb.nextInt();
                     totalPrice += price[i]*quantity[i];
                     i++;
                     break;

                case "rice" :
                     order [i]= item;
                     System.out.println("Enter quantity");
                     quantity[i] = kb.nextInt();
                     System.out.println("Enter price");
                     price[i] = kb.nextInt();
                     totalPrice += price[i]*quantity[i];
                     i++;
                     break;

                default :
                     System.out.println("item not available");

            }
            
        }
         System.out.println("----------total bill-----------");
         for (int j =0; j < i;j++) {
              System.out.println("item         quantity          price");
              System.out.println(order[j]+"           "+quantity[j]+"               "+price[j]);
         }
         System.out.println("totalPrice "+totalPrice+ " without discount");
         if (totalPrice>=500) {
             totalPrice -= totalPrice*(0.20); 
         }
         else if (totalPrice>=100){
             totalPrice -= totalPrice*(0.10); 
         }
         System.out.println("totalPrice "+totalPrice+ " with discount (if applicable)");

    }
}