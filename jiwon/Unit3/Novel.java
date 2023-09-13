package Unit3;

public class Novel extends Book {
    private String type;

    public Novel(String t, String a, String type) {
        super(t, a);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString() {
        return super.getTitle() + super.getAuthors() + this.type;
    }
}
