class NullPointerExceptionDemo {
    
    //method to generate exception
    public static void generateException() {
        String text = null;
        int size = text.length();
    }
    //method to handles that exceptions
    public static void handleException(){
        String text = null;
        try {
            int size = text.length();
        }
        catch (NullPointerException e) {
            System.out.println(e.getMessage());
       
            // you can also throw your exception message
            // also printstacktrace.
        }
    }

    public static void main (String [] args) {
        try {
        generateException();
        }
        catch (NullPointerException e){
            handleException();
        }
    }
}