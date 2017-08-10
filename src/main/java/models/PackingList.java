package models;
import java.util.List;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Guest on 8/10/17.
 */
public class PackingList {
    private String name;
    private List<String> packedInBag;
    private static ArrayList<PackingList> instances = new ArrayList<>();

    public PackingList(String name, List<String> packedInBag) {
        this.name = name;
        this.packedInBag = packedInBag;
        instances.add(this);
    }

    public String getName() {
        return name;
    }

    public static ArrayList<PackingList> getAll() {
        return instances;
    }

    public List<String> getPackedInBag() {
        return packedInBag;
    }
}


