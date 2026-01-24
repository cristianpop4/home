package homeworks.session16;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Repository<K, V> {
    private Map<K, V> storage;

    public Repository(){
        storage = new HashMap<>();
    }

    private void save(K key, V value){
        storage.put(key, value);
    }

    public V get(K key){
        return storage.get(key);
    }

    public V remove(K key){
        return storage.remove(key);
    }

    public Map<K, V> getAll(){
        return new HashMap<>(storage);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Repository<?, ?> that)) return false;
        return Objects.equals(storage, that.storage);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(storage);
    }

    @Override
    public String toString() {
        return "Repository{" +
                "storage=" + storage +
                '}';
    }
}
