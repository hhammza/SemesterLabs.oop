package LabMidSecA;

public class NonFiction extends Book implements Categories{
    String subject;

    public NonFiction(String author, String title, String ISBN, String subject) {
        super(author, title, ISBN, Status.AVAILABLE);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
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
        System.out.println("Subject: "+subject);
    }

    @Override
    public String toString() {
        return "NonFiction{" +
                "subject='" + subject + '\'' +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", status=" + status +
                '}';
    }
}
