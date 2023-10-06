package LibrarySystem;

public class Magazine extends LibraryItem{
    private int issueNumber;

    public Magazine(String title, String author, int year, int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }
}
