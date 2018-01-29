public class Books {
    protected int id;
    protected String title;
    protected String author;
    protected float price;
 
    public Books() {
    }
 
    public Books(int id) {
        this.id = id;
    }
 
    public Books(int id, String title, String author, float price) {
        this(title, author, price);
        this.id = id;
    }
     
    public Books(String title, String author, float price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public String getTitle() {
        return title;
    }
 
    public void setTitle(String title) {
        this.title = title;
    }
 
    public String getAuthor() {
        return author;
    }
 
    public void setAuthor(String author) {
        this.author = author;
    }
 
    public float getPrice() {
        return price;
    }
 
    public void setPrice(float price) {
        this.price = price;
    }
}