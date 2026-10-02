import java.util.*;
public class Library {
    static class Book { int id; String title; boolean issued;
        Book(int id,String title){this.id=id;this.title=title;}
    }
    static ArrayList<Book> books=new ArrayList<>();
    public static void main(String[] args){
        books.add(new Book(1,"Clean Code")); books.add(new Book(2,"Effective Java"));
        Scanner sc=new Scanner(System.in); int c;
        do {
            System.out.print("\n1 List 2 Issue 3 Return 4 Add 5 Exit: "); c=sc.nextInt();
            if(c==1) for(Book b:books) System.out.println(b.id+" | "+b.title+" | "+(b.issued?"Issued":"Available"));
            else if(c==2||c==3){System.out.print("Book ID: ");int id=sc.nextInt(); for(Book b:books)if(b.id==id)b.issued=(c==2);}
            else if(c==4){System.out.print("ID: ");int id=sc.nextInt();sc.nextLine();System.out.print("Title: ");books.add(new Book(id,sc.nextLine()));}
        }while(c!=5); sc.close();
    }
}
