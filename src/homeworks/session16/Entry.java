package homeworks.session16;

import java.sql.Timestamp;
import java.util.Objects;

public class Entry {
    private int id;
    private String name;
    private Timestamp timestamp;

    public Entry(int id, String name, Timestamp timestamp) {
        this.id = id;
        this.name = name;
        this.timestamp = timestamp;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Entry entry)) return false;
        return id == entry.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
