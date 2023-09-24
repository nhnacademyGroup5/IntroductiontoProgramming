package jinwoo.assignment.search_word;

public class Word {
    private String num;
    private String name;
    private String means;

    public String getName() {
        return name;
    }

    public String getMeans() {
        return means;
    }

    public Word(String num, String name, String means) {
        this.num = num.substring(0, num.indexOf((".")));
        this.name = name;
        this.means = means.substring(1);
    }
    @Override
    public String toString() {
        return "No." + num + " " + name + "\n" + means;
    }
    
}
