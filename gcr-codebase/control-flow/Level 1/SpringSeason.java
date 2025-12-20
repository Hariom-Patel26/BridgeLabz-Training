// Create a class SpringSeason to check Its a Spring Season or Not a Spring Season.
class SpringSeason {
    public static void main (String []args) {

       //Input section : user inputs month and day
       if (args.length==0){
        System.out.println("")
       }
       int month = Integer.parseInt(args[0]);
       int day = Integer.parseInt(args[1]);
    
       //Logic section : check whether Its a Spring Season or Not a Spring Season.

       if (month > 2 && month < 7) { 
           if (month==3 && day < 20) { 
            System.out.println("Not a Spring Season");
           }
           else if (month==6 && day > 20){
            System.out.println("Not a Spring Season");
           } 
           else {
            System.out.println("Its a Spring Season");
           }
       } else {
   	 System.out.println("Not a Spring Season");
       }
    }
}