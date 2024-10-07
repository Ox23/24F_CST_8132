package amazonproducts;

public class AmazonProduct {

    private int id;
    private String name;
    private String category;
    private String subCategory;
    private String imageURL;
    private String link;
    private float rating;
    private int nRatings;
    private float discountPrice;
    private float actualPrice;

    // Constructor to initialize all fields
    public AmazonProduct(int id, String name, String category, String subCategory, String imageURL, String link, float rating, int nRatings, float discountPrice, float actualPrice) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.subCategory = subCategory;
        this.imageURL = imageURL;
        this.link = link;
        this.rating = rating;
        this.nRatings = nRatings;
        this.discountPrice = discountPrice;
        this.actualPrice = actualPrice;
    }

    // Constructor with just the product name
    public AmazonProduct(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format(
            "ID: %d | Name: %s | Category: %s | SubCategory: %s | Rating: %.2f | No. of Ratings: %d | Discount Price: %.2f | Actual Price: %.2f\nImage: %s\nLink: %s\n",
            id, name, category, subCategory, rating, nRatings, discountPrice, actualPrice, imageURL, link);
    }
    
    
    public void setTitle(String title) { // idk if this is right
        this.name = title;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public int getnRatings() {
		return nRatings;
	}

	public void setnRatings(int nRatings) {
		this.nRatings = nRatings;
	}

	public float getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(float discountPrice) {
		this.discountPrice = discountPrice;
	}

	public float getActualPrice() {
		return actualPrice;
	}

	public void setActualPrice(float actualPrice) {
		this.actualPrice = actualPrice;
	}
}
