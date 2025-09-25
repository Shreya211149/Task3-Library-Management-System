import java.util.ArrayList;
public class Library {
    private ArrayList<Book> books=new ArrayList<>();
    private ArrayList<User> users=new ArrayList<>();

    public void addBook(Book b){
       books.add(b);
    }
    public void addUser(User u){
        users.add(u);
    }

    public void showBooks(){
        if(books.isEmpty()){
            System.out.println("No books avaliable");
            return;
        }
        for(Book b:books){
            System.out.println(b);
        }
    }

    public void showUsers(){
        if(users.isEmpty()){
            System.out.println("No users registerd");
            return;
        }
        for(User u: users){
            System.out.println(u);
        }
    }

    public void issueBook(int bookId){
        for(Book b:books){
            if(b.getId()==bookId){
                if(!b.isIssued()){
                   b.issue();
                   System.out.println("Book issued succesfully"); 
                   return;
                }
            }
        }
        System.out.println("No book found");
    }
    public void returnBook(int bookId){
        for(Book b:books){
            if(b.getId()==bookId){
                if(b.isIssued()){
                   b.returnBook();
                   System.out.println("Book returned succesfully"); 
                   
                }
                 else {
                    System.out.println("This book was not issued.");
                }
                return;
            }
        }
        System.out.println("Book not found");
    }
}
