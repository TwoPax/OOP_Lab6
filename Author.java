import java.util.ArrayList;

public class Author {

    private String name;
    private int code;
    private ArrayList<Book> books;

    // Constructors
    public Author(String name, int code) {
        this.name = name;
        this.code = code;
        this.books = new ArrayList<>();
    }

    public Author() {
        this.name = null;
        this.code = -1;
        this.books = new ArrayList<>();
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Author [name=" + name + ", code=" + code + ", books=" + books + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + code;
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
        Author other = (Author) obj;
        if (code != other.code)
            return false;
        return true;
    }

}
