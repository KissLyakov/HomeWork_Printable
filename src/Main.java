public class Main {
    public static void main(String[] args) {

        Printable[] array = {new Book(), new Magazine(), new Book()};
        Book.printBooks(array);
        Magazine.printMagazine(array);
    }
}