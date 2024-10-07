package amazonproducts;

//import java.io.BufferedReader;
import java.util.*;
import java.io.*; // //Place holder replacement of BufferReader

public class AmazonProductList {
	AmazonProductUtil productUtil = new AmazonProductUtil();
    private static final int NUMCOLS = 10; // number of columns
    private ArrayList<AmazonProduct> bestsellers = new ArrayList<>();
    
    
    public void createList(String csvFile) {
    	
		
        File file = new File(csvFile); // creates a File object with the name provided by the fileName parameter. 
        								// This object is used to open and read the file.
        
        
        String str = ""; // empty String variable that will temporarily hold each line read from the file
        
		try {
			Scanner sc = new Scanner(file); // The scanner will be used to read the contents of the file line by line
            
			boolean firstLine = true; // Flag to keep track of the first line
	            
	        while (sc.hasNextLine()) {
	            str = sc.nextLine(); // reads the next line of the file and assigns it to the str variable
	        	
	            
	         // Skip the header line
	            if (firstLine) { 
	            	firstLine = false; // Set firstLine to false so this block only runs once
	                continue; // Skip and go to the next line in the CSV
	            }
	            
	            String[] productData = productUtil.lineReader(str, NUMCOLS); //returns an array of strings representing the fields of the CSV row. 
	            
	            // Parsing the product data
	            int id = Integer.parseInt(productData[0]);
	            String name = productData[1];
	            String category  = productData[2]; 
	            String subCategory  = productData[3];
	            String imageURL = productData[4];
	            String link = productData[5];
	            float rating = productUtil.convertStrToFloat(productData[6]); 
	            int nRatings = Integer.parseInt(productData[7].replace(",", ""));
	            float discountPrice = productUtil.convertStrToFloat(productData[8]);
	            float actualPrice = productUtil.convertStrToFloat(productData[9]);
	
	            // Create an AmazonProduct and add to the list
	            AmazonProduct product = new AmazonProduct(id, name, category, subCategory, imageURL, link, rating, nRatings, discountPrice, actualPrice);
	            bestsellers.add(product);
	        } 
           
		 } catch (FileNotFoundException e) {
		        System.err.println("Error: File not found.");
		        e.printStackTrace();
		    } catch (NumberFormatException e) {
		        System.err.println("Error parsing the product data: " + e.getMessage());
		 }
    }
    
    
    public void printList() {
    	
    	System.out.println("bestsellers size: " + bestsellers.size()); // testing purposes
    	
        if (bestsellers.isEmpty()) { // check if its empty 
            System.out.println("The product list is empty. Load the product list first.");
            return;
        }

        for (AmazonProduct product : bestsellers) { // // for-each loop to print each AmazonProduct in the list
        	
            System.out.println(product);  // print the string returned by product.toString().
        }
    }
    

    public void saveList(String fileName) {
        // need to use fileWriter class to write each AmazonProduct to a specified file
    	// loop through the bestsellers list and format each product as a CSV row, and write it to the file.
    	
    	// open a FileWriter which will be used to write the text to a file
    	
    	// write the header, the first line of a CSV file should contain headers such as ID, Name, Category, etc
    	
    	// loop through the bestsellers list, for each AmazonProduct convert the product’s attributes into a CSV format string (just comma-separated values)
    	
    	// write each product's CSV string to the file
    	
    	try {
			FileWriter writer = new FileWriter(fileName);
			
			
	        writer.write("ID,Name,Category,SubCategory,ImageURL,Link,Rating,Number of Ratings,Discount Price,Actual Price\n"); // write header of CSV file
	        
			
			for (AmazonProduct product : bestsellers) { // go through the bestsellers list and write each product into the file
				
	            StringBuilder csvLine = new StringBuilder();
	            
	            csvLine.append(product.getId()).append(",");
	            csvLine.append(product.getName()).append(",");
	            csvLine.append(product.getCategory()).append(",");
	            csvLine.append(product.getSubCategory()).append(",");
	            csvLine.append(product.getImageURL()).append(",");
	            csvLine.append(product.getLink()).append(",");
	            csvLine.append(product.getRating()).append(",");
	            csvLine.append(product.getnRatings()).append(",");
	            csvLine.append(product.getDiscountPrice()).append(",");
	            csvLine.append(product.getActualPrice()).append("\n");
	            
	            // Write the CSV line to the file
	            writer.write(csvLine.toString());
			}
			
			System.out.println("Product list saved successfully to " + fileName);
			
		} catch (IOException e) {
			System.err.println("Error writing to file: " + e.getMessage());
			e.printStackTrace();
		}	  	
    }

    public void add(AmazonProduct product) {
        // Adds a product to the list
    	
    	// takes in the following id, name, category, subCategory, rating, nRatings, discountPrice, actualPrice, imageURL, link
    	// and adds them into the file as an additional product
    	
    	
    	
    	
    }
    

    public void edit(int index, AmazonProduct product) {
        // Edits a product at the given index in the list
    }

    public AmazonProduct findProductByIndex(int index) {
        // Returns the product at the specified index
        return null;
    }

    public int getSize() {
        // Returns the size of the product list
        return 0;
    }

    public void delete(int index) {
        // Deletes a product at the given index
    }

    public void search(String name) {
        // Searches for a product by name
    }
}
