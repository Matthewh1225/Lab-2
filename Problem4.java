public class Problem4 {
    public static void main(String[] args) {
        Book b =new Book("Bible");
        b.setTitle("New Bible");
        b.setPublisher("God");
        b.setAuthors(new String[]{"jesus"});
        b.setPrice("$1,0000,00");
        b.setStock(10);
        b.setStock(b.getStock()-1);
        b.printDetails();

        
    }

}
