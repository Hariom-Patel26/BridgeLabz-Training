class CheckSpringSeason{
    // method to check for spring season.
    public static Boolean spring(int month , int day) {
    if (month > 2 && month < 7) { 
           if (month==3 && day < 20) { 
            return false;
           }
           else if (month==6 && day > 20){
           return false; 
           } 
           else {
            return true;
           }
       } else {
   	 return false;
       }
    }
    
    public static void main (String [] args){
        // taking input from command line argument.
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
    
        // method call
        boolean answer = CheckSpringSeason.spring(month, day);

        //display result
        if (answer) {
        System.out.println("Its a Spring Season");
        }
        else { 
        System.out.println("Not a Spring Season");
        }
    }
}