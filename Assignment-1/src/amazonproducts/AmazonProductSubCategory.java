package amazonproducts;

public class AmazonProductSubCategory {
    private String subCategoryName;
    private AmazonProductCategory category;

    // Constructor
    public AmazonProductSubCategory(String subCategoryName, AmazonProductCategory category) {
        this.subCategoryName = subCategoryName;
        this.category = category;
    }

    // Getter for category
    public AmazonProductCategory getCategory() {
        return category;
    }

    // Setter for category
    public void setCategory(AmazonProductCategory category) {
        this.category = category;
    }

    // Getter for subCategoryName
    public String getSubCategory() {
        return subCategoryName;
    }

    // Setter for subCategoryName
    public void setSubCategory(String subCategoryName) {
        this.subCategoryName = subCategoryName;
    }
}
