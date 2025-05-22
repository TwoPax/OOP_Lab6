public class Book {

    private String name;
    private int code;
    private int published;
    // Constructors

    public Book(String name, int code, int published) {
        this.name = name;
        this.code = code;
        this.published = published;
    }

    public Book() {
        this.name = null;
        this.code = -1;
        this.published = -1;
    }
    // Getters and setters

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

    public int getPublished() {
        return published;
    }

    public void setPublished(int published) {
        this.published = published;
    }

    @Override
    public String toString() {
        return "Book [name=" + name + ", code=" + code + ", published=" + published + "]";
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
        Book other = (Book) obj;
        if (code != other.code)
            return false;
        return true;
    }

}
