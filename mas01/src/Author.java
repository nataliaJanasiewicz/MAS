import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Author implements Serializable {

     static List<Author> authorExtent = new ArrayList<>();

    private String firstName;
    private String lastName;

    public Author(){
        authorExtent.add(this);
    }

    public Author(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        authorExtent.add(this);
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getFirstName(){
        return firstName;
    }


    public String getLastName(){
        return lastName;
    }

    private void write(DataOutputStream stream) throws IOException {
        stream.writeUTF(firstName);
        stream.writeUTF(lastName);
    }

    private void read(DataInputStream stream) throws IOException {
        firstName = stream.readUTF();
        lastName = stream.readUTF();
    }

    public static void writeExtent(DataOutputStream stream) throws IOException {
        stream.writeInt(authorExtent.size());
        for(Author author : authorExtent){
            author.write(stream);
        }
    }

    public static void readExtent(DataInputStream stream) throws IOException {
        Author author = null;
        int authorCount = stream.readInt();
        authorExtent.clear();
        for(int i =0; i < authorCount; i++){
            author = new Author();
            author.read(stream);
        }
    }

    public static void show(){
        for(Author author : authorExtent){
            System.out.println(author);
        }
    }

    @Override
    public String toString(){
        return getFirstName() + " " + getLastName();
    }
}
