package LabMidSecA;

public class Main {
    public static void main(String[] args) {

        Fiction r = new Fiction("Malaika","Udas","001","Novel");
        NonFiction r1 = new NonFiction("Malaika", "Years", "002","Book");
        User r3 = new User();
        //LibraryManagement r2 = new LibraryManagement(100,100);
        LibraryManagement r4 = new LibraryManagement();
        r3.setUserName("Hamza");
        r3.setUserName("Hhaammzzaa");

        r4.addBook(r);
        r4.addBook(r1);
        System.out.println(r.getStatus());
        r4.borrowBook(r3,r);
        r4.generateReport();
//        r4.BorrowBook(u1,b);
        System.out.println(r.getStatus());
        r4.returnBook(r3,r);
//        r4.ReturnBook(u1,b);
        System.out.println(r.getStatus());
    }
}
