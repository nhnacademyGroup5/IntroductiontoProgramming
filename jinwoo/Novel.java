package jinwoo;

// Ex 3.7.
public class Novel extends Book{
    private String type;

    public String getType() {
        return type;
    }

    public Novel(String title, String authors, String type) {
        super(title, authors);
        this.type = type;
    }

    @Override
    public String toString() {
        return "Novel [title = " + super.getTitle() + ", authors = " + super.getAuthors() + " , type = " + type + "]";
    }
    
}
