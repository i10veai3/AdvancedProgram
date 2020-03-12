public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setTitle("SnowWhite");
        book1.setAuthor("BrothersGreen");
        Book book2 = new Book();
        book2.setTitle("SnowQueen");
        Book book3 = new Book();
        book3.setTitle("Pinocchio");
        System.out.println(book1.showInfo());
        
    }
}