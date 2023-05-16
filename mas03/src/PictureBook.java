public class PictureBook extends Book implements IComicBook{
    private int numberOfIllustrations;
    private Person authorOfIllustrations;

    public PictureBook(Person author,int numberOfIllustrations) {
        super(author);
        this.numberOfIllustrations = numberOfIllustrations;
    }

    @Override
    public void setAuthorOfIllustrations(Person authorOfIllustrations) {
        this.authorOfIllustrations = authorOfIllustrations;
    }

    @Override
    public Person getAuthorOfIllustrations() {
        return authorOfIllustrations;
    }

    public Person[] getAutor(){
        return new Person[]{getAuthorOfIllustrations(), super.getAuthor()};
    }
}
