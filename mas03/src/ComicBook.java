public class ComicBook implements IComicBook{
    private Person authorOfIllustrations;

    @Override
    public void setAuthorOfIllustrations(Person authorOfIllustrations) {
        this.authorOfIllustrations = authorOfIllustrations;
    }

    @Override
    public Person getAuthorOfIllustrations() {
        return authorOfIllustrations;
    }
}
