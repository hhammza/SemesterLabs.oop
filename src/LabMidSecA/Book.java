package LabMidSecA;

public abstract class Book {
    String author;
    String title;
    String ISBN;
    Status status;

    Book(String author,String title, String ISBN, Status status){
        this.author = author;
        this.title = title;
        this.ISBN = ISBN;
        this.status = status;
    }
    Book(){

    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getISBN() {
        return ISBN;
    }

    public Status getStatus() {
        return status;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public boolean equals(Object o){
        Book b = (Book) o;
       return b.getISBN().equals(this.ISBN);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", status=" + status +
                '}';
    }
}
