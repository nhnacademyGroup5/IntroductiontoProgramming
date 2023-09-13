package Unit3;

public class TextBook extends Book {
    private String course;
    private String faculty;

    public TextBook(String t, String a, String course, String faculty) {
        super(t, a);
        this.course = course;
        this.faculty = faculty;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String toString() {
        return super.getTitle() + super.getAuthors() + this.course + this.faculty;
    }
}
