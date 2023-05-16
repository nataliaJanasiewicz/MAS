import java.time.LocalDate;
import java.util.EnumSet;
import java.util.List;

enum PersonType{Person, Librarian, Reader, Author}
enum Gender{Female,Male}
public class Person {
    private String fisrtName;
    private String lastName;
    private LocalDate birthDate;

    //dla bibliotekarza
    private float salary;

    //dla czytelnika
    private int libraryCardNumber;

    //dla autora
    private String nick;
    //female
    private String maidenName;
    //male
    private int armyIdentificationNumber;

    private Gender gender;
    private EnumSet<PersonType> personKinds = EnumSet.of(PersonType.Person);

    public Person(String fisrtName, String lastName, LocalDate birthDate, PersonType[] types, Gender gender) {
        this.fisrtName = fisrtName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        personKinds.addAll(List.of(types));
        this.gender = gender;
    }

    public float getSalary() throws Exception{
        if(personKinds.contains(PersonType.Librarian)){
            return salary;
        }
        throw new Exception("The person is not an librarian!");
    }

    public void setSalary(float salary) throws Exception {
        if(personKinds.contains(PersonType.Librarian)) {
            this.salary = salary;
        }
        else {
            throw new Exception("The person is not an librarian!");
        }
    }

    public int getLibraryCardNumber() throws Exception{
        if(personKinds.contains(PersonType.Reader)){
            return libraryCardNumber;
        }
        throw new Exception("The person is not an reader!");
    }

    public void setLibraryCardNumber(int libraryCardNumber) throws Exception {
        if(personKinds.contains(PersonType.Reader)) {
            this.libraryCardNumber = libraryCardNumber;
        }
        else {
            throw new Exception("The person is not an reader!");
        }
    }

    public String getNick() throws Exception{
        if(personKinds.contains(PersonType.Author)){
            return nick;
        }
        throw new Exception("The person is not an author!");
    }

    public void setNick(String nick) throws Exception {
        if(personKinds.contains(PersonType.Author)) {
            this.nick = nick;
        }
        else {
            throw new Exception("The person is not an author!");
        }
    }

    //==========gender=========
    public String getMaidenName() throws Exception{
        if(gender.equals(Gender.Female)){
            return maidenName;
        }
        throw new Exception("The person is not an female!");
    }

    public void setMaidenName(String maidenName) throws Exception {
        if(gender.equals(Gender.Female)) {
            this.maidenName = maidenName;
        }
        else {
            throw new Exception("The person is not an female!");
        }
    }

    public int getArmyIdentificationNumber() throws Exception{
        if(gender.equals(Gender.Male)){
            return armyIdentificationNumber;
        }
        throw new Exception("The person is not an male!");
    }

    public void setArmyIdentificationNumber(int armyIdentificationNumber) throws Exception {
        if(gender.equals(Gender.Male)) {
            this.armyIdentificationNumber = armyIdentificationNumber;
        }
        else {
            throw new Exception("The person is not an male!");
        }
    }

}
