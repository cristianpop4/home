package homeworks.session16;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Cache {
    private String name;
    private int id;

    public Cache(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }
    public String getName() { return name; }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Cache cache)) return false;
        return id == cache.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Cache{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

class CacheDemo{
    static void main(String[] args) {
        Map<Integer, Cache> cache = new HashMap<>();

        Cache e1 = new Cache(1, "Alice");
        Cache e2 = new Cache(2, "Bob");
        Cache e3 = new Cache(1, "Charlie");

        cache.put(e1.hashCode(), e1);
        cache.put(e2.hashCode(), e2);
        cache.put(e3.hashCode(), e3);

        cache.values().forEach(System.out::println);
    }

}