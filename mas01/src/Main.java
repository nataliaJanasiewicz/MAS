import java.io.*;
import java.util.Scanner;
// ekstensja = gotowe
// trwalosc = gotowe
// atrybut złozony = gotowe - book author
// atrybut opcjonalny - book borrowDate
// atrybut powtarzalny = gotowe - book genre
// atrybut klasowy = gotowe -book -  maxDuration
// atrybut pochodny = wiliczalny = gotowe - book - getDueDate
// metoda klasowa = gotowe - book - chargeInterest
// przesłonięcie - z nad klasy = gotowe - toString
// przeciązenie - wiele argumentow = gotowe - book - chargeInterest

/*TODO:ASOCJACJE:
TODO: zwykla -
TODO: z atrybutem - autor i ksiazka (ksiazka moze wiec wiele autorow a jeden autor wiele ksiazek)
TODO: kwalifikowana
TODO: kompozycja - nie ma czesci bez calosci (półka i regał)
 */


public class Main {
    private static boolean runTest = true;
    private static final String file = "/Users/nacia/Desktop/MAS/MAS projects/mas01/simple.txt";
    private static final String fileSer = "/Users/nacia/Desktop/MAS/MAS projects/mas01/set.txt";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner scanner= new Scanner(System.in);
        while(runTest){
            System.out.println("1 - create author");
            System.out.println("2 - create book");
            System.out.println("3 - print authors");
            System.out.println("4 - print books");
            System.out.println("5 - simple save");
            System.out.println("6 - save - serialization");
            System.out.println("7 - simple load");
            System.out.println("8 - load - deserialization");
            System.out.println("9 - borrow book");
            System.out.println("10 - get return date");
            System.out.println("11 - get return date null");
            System.out.println("0 - end");

            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    Test.createAuthors();
                    break;
                case 2:
                    Test.createBooks();
                    break;
                case 3:
                    Author.show();
                    break;
                case 4:
                    Book.show();
                    break;
                case 5:
                    saveSimple();
                    break;
                case 6:
                    serializeObject();
                    break;
                case 7:
                    loadSimple();
                    break;
                case 8:
                    deserializeObject();
                    break;
                case 9:
                    Test.borrowBook();
                    break;
                case 10:
                    Test.chechkReturnTime();
                    break;
                case 11:
                    Test.chechkReturnTimeNull();
                    break;
                case 0:
                    runTest = false;
                    break;

            }

        }
    }

    private static void saveSimple() throws IOException {
        DataOutputStream outStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
        Author.writeExtent(outStream);
        outStream.close();
        System.out.println("data saved.");
    }

    private static void loadSimple() throws IOException {
        System.out.println("loading data.");
        DataInputStream inputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
        Author.readExtent(inputStream);
        inputStream.close();
        System.out.println("load finished.");
    }

    private static void serializeObject() throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileSer));
        Book.writeExtent(out);
        //out.writeObject(getAllExtents());
        out.close();
        System.out.println("serialize finished");
    }

    private static void deserializeObject() throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileSer));
        Book.readExtent(in);
        in.close();
    }


}