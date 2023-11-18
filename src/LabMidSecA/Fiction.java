package LabMidSecA;

public class Fiction extends Book implements Categories{
    String genre;

    public Fiction(String author, String title, String ISBN, String genre) {
        super(author, title, ISBN, Status.AVAILABLE);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void ShowDetails()
    {
        System.out.println("ISBN: "+getISBN());
        System.out.println("Author: "+getAuthor());
        System.out.println("Title: "+getTitle());
        System.out.println("Status: "+getStatus());
    }
    @Override
    public void displayCategoryDetails() {
        System.out.println("Genre: "+genre);
    }

    @Override
    public String toString() {
        return "Fiction{" +super.toString()+
                "genre='" + genre + '\'' +
                '}';
    }
}
