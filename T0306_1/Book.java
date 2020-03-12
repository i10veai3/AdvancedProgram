public class Book {

    private String title,author,ISBN,publisher,price;

    public Book() {
        System.out.println("Book has created!");
    }

    public void setTitle(String newTitle){
        this.title = newTitle;
    }

    public String getTitle(){
        return this.title;
    }
    public void setAuthor(String newAuthor){
        this.author = newAuthor;
    }

    public String getAuthor(){
        return this.author;
    }

    public String showInfo(){
        String all = this.title +" "+ this.author +" "+ this.ISBN +" "+ this.publisher +" "+ this.price;
        return all;
    }
}