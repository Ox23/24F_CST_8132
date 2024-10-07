package amazonproducts;
import java.util.*;
//import java.io.BufferedReader;
import java.io.File; //Place holder replacement of BufferReader
import java.io.FileNotFoundException;


public class AmazonProductManager {

	AmazonProductList productList = new AmazonProductList();
	
	//public String csvNameHolder;
	
	Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		AmazonProductManager manager = new AmazonProductManager();
		
        manager.showMenu();
        
	}
	
	public void createProductList() {
		/*
	    Take the file name as input from the user and
		use that name to locate the csv file using the createList() 
		method in the AmazonProductList class
		*/
		
		System.out.print("Name of file to create Productlist: ");
		String csvName = input.nextLine();
		productList.createList(csvName);
				
		System.out.println("Product list created successfully!");
		
	}
	
	public void showProductList() { // Displays the product list
		
		System.out.println("- - - - - - Product List - - - - - - ");
		
		productList.printList();
	}
	
	public void saveProductList() { // Saves the current product list to a file or database
		
		System.out.print("Name of file to save product list to: ");
		String newFileName = input.nextLine();
		productList.saveList(newFileName);
		
		
	}
	
	public void editProduct() {
	    // Edits a product from the product list
	}
	
	public void addProduct() {
	    // Adds a new product to the product list
	}
	
	public void deleteProduct() {
	    // Removes a product from the product list
	}
	
	public void search() {
	    // Searches for a product in the product list
	}
	
	public void createProduct() {
	    // Creates a new Amazon product
	}
	
	public void showMenu() {
		int choice;
		
		while (true) {
			 System.out.println("================================");
		     System.out.println("|| Menu - Amazon Products: A1 ||");
		     System.out.println("================================");
		     System.out.println("0. Exit");
		     System.out.println("1. Load product list");
		     System.out.println("2. Show product list");
		     System.out.println("3. Add product");
		     System.out.println("4. Edit a product");
		     System.out.println("5. Delete a product");
	         System.out.println("6. Save product list");
		     System.out.println("7. Search in the list");
             System.out.print("Choose an option: ");

	        choice = input.nextInt();
	        input.nextLine();
	        switch (choice) {
            case 0:
                exit(); // Exit the program    DONE
                return;
            case 1:
                createProductList(); // Load the product list    DONE
                break;
            case 2:
                showProductList(); // Show the product list      DONE
                break;
            case 3:
                addProduct(); // Add a new product
                break;
            case 4:
                editProduct(); // Edit an existing product
                break;
            case 5:
                deleteProduct(); // Delete a product
                break;
            case 6:
                saveProductList(); // Save the product list      DONE
                break;
            case 7:
                search(); // Search for a product in the list
                break;
            default:
                System.out.println("Place Holder");
        }
	        
		}
	}
	
	public void exit() {
		
		System.out.println("Exiting program...");
		/*
		AmazonProduct ap = new AmazonProduct(null);
		System.out.print(ap.toString());
		*/
	    System.exit(0);
	    
	}
	
	public void manageProductList() {
	    // Manages the product list (main function of the program)
	}

}







