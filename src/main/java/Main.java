import Services.Library;

public class Main {
    public static void main(String[] args){


        Library lib = new Library();
        System.out.println(lib.getBooksFromLibrary().get(2).getTitle());
    }
}
