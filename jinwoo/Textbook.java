package jinwoo;

// Ex 3.7.
public class Textbook extends Book{

    private String course = "None";
    private String faculty = "None";

    public String getCourse() {
        return course;
    }

    public String getFaculty() {
        return faculty;
    }

    public Textbook(String title, String authors, String course, String faculty) {
        super(title, authors);
        this.course = course;
        this.faculty = faculty;
    }

    public Textbook(String title, String authors) {
        super(title, authors);
    }

    @Override
    public String toString() {
        return "Textbook [title = " + super.getTitle() + ", authors = " + super.getAuthors() + ", course = " + course + ", faculty=" + faculty + "]";
    }
    
}
