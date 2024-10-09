package amazonproducts;

public class AmazonProductException extends Exception {

    private static final long serialVersionUID = 1L;  // adding serial version default , need it for exceptions to work proper 

    public AmazonProductException (String errorMessage)  // simple method assigning a default error message
    {
    String result = "AmazonProductException: ";
        System.err.println(result + errorMessage);
    }
} 
