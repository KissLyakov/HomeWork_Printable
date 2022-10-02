public class Magazine implements Printable{

    @Override
    public void print() {
        System.out.println("Название журнала");
    }

    public static void printMagazine(Printable[] printable){
        for (int i = 0; i < printable.length; i++){
            if (printable[i] instanceof Magazine){
                printable[i].print();
            }
        }
    }
}
