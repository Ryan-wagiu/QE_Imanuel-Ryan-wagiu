import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Soal1 {
    public static void main(String[] args) {
        Set<String> names = new LinkedHashSet<>();
        names.add("kazuya");
        names.add("jin");
        names.add("lee");
        Set<String> names3 = new LinkedHashSet<>();
        names3.add("kazuya");
        names3.add("feng");
        names.addAll(names3);
        System.out.println(names);

        ArrayList<String> names2 = new ArrayList<>();
        names2.add("lee");
        names2.add("jin");
        ArrayList<String> names1 = new ArrayList<>();
        names1.add("kazuya");
        names1.add("panda");
        names2.addAll(names1);
        System.out.println(names2);
    }
}