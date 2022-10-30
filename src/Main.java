import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        createTwoListsCombineThemAndSortElementsByLength();
    }

    public static void createTwoListsCombineThemAndSortElementsByLength() {
        final ArrayList<String> a = new ArrayList<>();
        a.add("clown");
        a.add("boy");
        a.add("consequence");
        a.add("therefore");
        a.add("think");
        System.out.println(a);
        ArrayList<String> b = new ArrayList<>();
        b.add("nwolc");
        b.add("yob");
        b.add("ecneuqesnoc");
        b.add("erofereht");
        b.add("kniht");
        final ArrayList<String> c = new ArrayList<>();
        Collections.reverse(b);

        for (int i = 0; i < a.size(); i++) {
            c.add(a.get(i));
            c.add(b.get(i));
        }

        System.out.println(c);
        c.sort(Comparator.comparingInt(String::length));
        System.out.println(c);
    }
}