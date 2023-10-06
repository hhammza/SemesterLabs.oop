package LibrarySystem;

public class Library {
    private int x = 100;
    private LibraryItem[] libraryItems;

    public Library() {
        this.libraryItems = new LibraryItem[x];
    }

    public void setLibraryItems(LibraryItem[] libraryItems) {
        this.libraryItems = libraryItems;
    }

    public LibraryItem[] getLibraryItems() {
        return libraryItems;
    }

    int index =0;
    public void addItem(LibraryItem item){
        libraryItems[index] = item;
        index ++;
    }

    public void borrowItem(LibraryItem item){
        item.setBorrowed(true);
    }

    public void returnItem(LibraryItem item){
        item.setBorrowed(false);
    }

    public void displayAvailableItems(){
        for(LibraryItem i : libraryItems){
            if(i != null){
                if(i.isBorrowed() == false){
                    System.out.println(i);
                    System.out.println("\n");
                }
            }
        }
    }

    public void displayBorrowedItems(){
        for(LibraryItem i : libraryItems){
            if(i != null){
                if(i.isBorrowed() == true){
                    System.out.println(i);
                    System.out.println("\n");
                }
            }
        }
    }
}