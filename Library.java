import java.util.ArrayList;

public class Library {

    private String name;
    private String adress;
    private ArrayList<Book> booksInLibrary;
    private ArrayList<Author> authorsInLibrary;

    // Constructors
    public Library(String name, String adress) {
        this.name = name;
        this.adress = adress;
        this.booksInLibrary = new ArrayList<>();
        this.authorsInLibrary = new ArrayList<>();
    }

    public Library() {
        this.name = null;
        this.adress = null;
        this.booksInLibrary = new ArrayList<>();
        this.authorsInLibrary = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public ArrayList<Book> getBooksInLibrary() {
        return booksInLibrary;
    }

    public void setBooksInLibrary(ArrayList<Book> booksInLibrary) {
        this.booksInLibrary = booksInLibrary;
    }

    @Override
    public String toString() {
        return "Library [name=" + name + ", adress=" + adress + ", booksInLibrary=" + booksInLibrary + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((adress == null) ? 0 : adress.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Library other = (Library) obj;
        if (adress == null) {
            if (other.adress != null)
                return false;
        } else if (!adress.equals(other.adress))
            return false;
        return true;
    }

    /*
     * Input: Author author
     * Output: True if there is at least one book from this author, false otherwise
     */
    public boolean AuthorExists(Author author) {
        if (author == null)
            return false;
        // Iterate through all books at the Library
        for (Book book : booksInLibrary) {
            // Iterate through all books published by author
            for (Book authorBook : author.getBooks()) {
                if (book.equals(authorBook))// If there is one that is equal, return true (equals compares books codes)
                    return true;
            }
        }
        // If no book was found, return false
        return false;
    }

    /*
     * Input: Author author
     * Effect: Adds Author to Library if he has at least 1 book at the library
     * Output: True if added succesfully, false otherwise
     */
    public boolean addAuthor(Author author) {
        // If there is nothing in author
        if (author == null) {
            System.out.println("Please insert valid values to author");
            return false;
        }
        // If author has no books at library
        if (!AuthorExists(author)) {
            System.out.println("Author has no books in our library");
            return false;
        }
        // If author already exists in our library
        for (Author x : authorsInLibrary) {
            if (author.equals(x)) {
                System.out.println("Author already exists");
                return false;
            }
        }
        // If we reached this far, add author
        authorsInLibrary.add(author);
        System.out.println("Author added succesfully");
        return true;

    }

}
