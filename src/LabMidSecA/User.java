package LabMidSecA;

public class User {
    String password;
    String userName;
    Book[] borrowedBooks;

    User(){

    }

    public User(String password, String userName) {
        this.password = password;
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Book[] getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(Book[] borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public User(Book[] borrowedBooks) {
        this.borrowedBooks = new Book[30];
    }


    void borrowedBook(Book b){
        for(int i = 0; i < borrowedBooks.length; i++){
            if(borrowedBooks[i] == null){
                borrowedBooks[i] = b;
                borrowedBooks[i].setStatus(Status.BORROWED);
                System.out.println("Book is borrwed");
            }
        }
    }
    void returnBook(Book b){
        for(int i = 0; i< borrowedBooks.length;i++){
            if(borrowedBooks[i] != null && borrowedBooks[i].equals(b)){
                borrowedBooks[i].setStatus(Status.AVAILABLE);
                for(int j = i; j<borrowedBooks.length-1;j++){
                    borrowedBooks[j] = borrowedBooks[j+1];
                }
                borrowedBooks[borrowedBooks.length-1] = null;
                System.out.println("Book returned..");
            }
        }
    }
}
