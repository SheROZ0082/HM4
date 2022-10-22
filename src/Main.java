import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        createTwoListsCombineThemAndSortElementsByLength();
    }
    public static void createTwoListsCombineThemAndSortElementsByLength() {
        final ArrayList<String> a = new ArrayList<>();
        final ArrayList<String> b = new ArrayList<>();
        final ArrayList<String> c = new ArrayList<>();
        a.add("clown");
        a.add("boy");
        a.add("consequence");
        a.add("therefore");
        a.add("think");
        System.out.println(a);
        b.add("nwolc");
        b.add("yob");
        b.add("ecneuqesnoc");
        b.add("erofereht");
        b.add("kniht");

        for (String value : a) {
            c.add(value);
        }
        for (String s : b) {
            c.add(s);
        }
        System.out.println(c);
        c.sort(Comparator.comparingInt(String::length));
        System.out.println(c);
    }
}