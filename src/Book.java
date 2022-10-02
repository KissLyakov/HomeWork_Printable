public class Book implements Printable{

    @Override
    public void print() {
        System.out.println("Название книги");
    }

    public static void printBooks(Printable[] printable){
        for (int i = 0; i < printable.length; i++){
            if (printable[i] instanceof Book){
                printable[i].print();
            }
        }
    }
}
