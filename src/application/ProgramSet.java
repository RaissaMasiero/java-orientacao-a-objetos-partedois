package application;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import model.entities.Product;

public class ProgramSet {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("Tv");
        set.add("Tablet");
        set.add("Notebook");

        set.removeIf(x -> x.charAt(0) == 'T');

        for (String p : set) {
            System.out.println(p);
        }

        System.out.println("--------------------------------------------------------");

        Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));

        //união
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

        //intersecção: elementos em comum
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

        //diferença
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);

        System.out.println("--------------------------------------------------------");

        Set<Product> set1 = new HashSet<>();

        set1.add(new Product("TV", 900.0));
        set1.add(new Product("Notebook", 1200.0));
        set1.add(new Product("Tablet", 400.0));

        Product prod = new Product("Notebook", 1200.0);

        System.out.println(set1.contains(prod));
    }
}
