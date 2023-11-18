package LabMidSecA;

import java.util.Arrays;

public class LibraryManagement {
    Book[] libraryInventory = new Book[100];
    User[] users = new User[100];
    int count = 0;
    int index = 0;

    LibraryManagement(){

    }

    public LibraryManagement(Book[] libraryInventory, User[] users) {
        this.libraryInventory = new Book[100];
        this.users = new User[100];
    }


    public void borrowBook(User u, Book b){
        for(int i = 0; i<users.length; i++)
        {
            if(users[i] != null )
            {
                for(Book p: libraryInventory)
                {
                    if(libraryInventory[i] != null && libraryInventory[i].equals(b))
                    {
                        users[i].borrowedBook(b);
                        break;
                    }
                }
            }
        }
    }
    public void returnBook(User u,Book b){
        for(int i = 0; i < users.length; i++)
        {
            if(users[i] != null)
            {
                for(Book p: libraryInventory)
                {
                    if(libraryInventory[i] != null && libraryInventory[i].equals(b))
                    {
                        users[i].borrowedBook(b);
                        break;
                    }
                }
            }
        }
    }
    public void searchBook(String s){
        for(int i =0; i< libraryInventory.length;i++){
            if(libraryInventory[i]!=null && libraryInventory[i].getISBN().equals(s)){
                System.out.println("The object is present at index "+i);
            }
        }
    }

    public void addBook(Book b){
        if(count < libraryInventory.length)
            libraryInventory[count++] = b;
            System.out.println("Book Added..");
    }

    public void remove(String s){
        for(int i = 0; i< libraryInventory.length;i++){
            if (libraryInventory[i] != null && s.equals(libraryInventory[i].getISBN())){
                for(int j = i; j < libraryInventory.length -1; j++){
                    libraryInventory[j] = libraryInventory[j+1];
                }
                libraryInventory[libraryInventory.length-1] = null;
                System.out.println("Book is removed..");
            }
        }
    }

    public void generateReport(){
//        for(Book b: libraryInventory){
//            System.out.println(b);
//        }
        for(int i = 0; i < libraryInventory.length;i++){
            if(libraryInventory[i] != null){
                System.out.println(Arrays.toString(libraryInventory));
            }

        }
    }

    @Override
    public String toString() {
        return "LibraryManagement{" +
                "libraryInventory=" + Arrays.toString(libraryInventory) +
                ", users=" + Arrays.toString(users) +
                ", count=" + count +
                ", index=" + index +
                '}';
    }
}
