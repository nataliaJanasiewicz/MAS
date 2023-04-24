import java.util.*;

public class Bookstand {
    private static Set<Bookstand> bookstandExtent = new HashSet<>();
    private List<Shelf> shelves = new ArrayList<>();
    private static Set<Shelf> allShelves = new HashSet<>();
    private String position;
    private String genre;

    public Bookstand(String position, String genre){
        this.position = position;
        this.genre = genre;
    }

    public void addShelf(Shelf shelf) throws Exception {
        if (!shelves.contains(shelf)) {
            if(allShelves.contains(shelf)){
                throw new Exception("this shelf is already connected with bookstand!");
            }
            shelves.add(shelf);
            allShelves.add(shelf);
        }
    }

    public void deleteBookstand(){
        shelves.forEach(allShelves::remove);
        shelves.clear();
        bookstandExtent.remove(this);
    }

    @Override
    public String toString(){
        String info = "Bookstand: position" + position + " genre: "+ genre + "\n";
        for(Shelf shelf : shelves) {
            info += "   " + shelf.position + "\n";
        }
        return info;
    }
}
