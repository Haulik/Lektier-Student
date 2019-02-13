import java.util.ArrayList;
import java.util.List;

public class Kurser {

    public Kurser(String name, String klasse, int lokale, List<Student> students, String underviser) {
        this.name = name;
        Klasse = klasse;
        Lokale = lokale;
        this.students = students;
        Underviser = underviser;
    }

    private String name;
    private String Klasse;
    private int Lokale;
    private List<Student> students;
    private String Underviser;

    // klasse, lære, lokale


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKlasse() {
        return Klasse;
    }

    public void setKlasse(String klasse) {
        Klasse = klasse;
    }

    public int getLokale() {
        return Lokale;
    }

    public void setLokale(int lokale) {
        Lokale = lokale;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getUnderviser() {
        return Underviser;
    }

    public void setUnderviser(String underviser) {
        Underviser = underviser;
    }

    @Override
    public String toString() {
        return "Kurser{" +
                "name='" + name + '\'' +
                ", Klasse='" + Klasse + '\'' +
                ", Lokale=" + Lokale +
                ", Student='" + students + '\'' +
                ", Underviser='" + Underviser + '\'' +
                '}';
    }
}
