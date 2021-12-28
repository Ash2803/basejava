import java.util.Arrays;

/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    Resume[] storage = new Resume[10000];
    int size = 0;

    void clear() {
        Arrays.fill(storage,0, size(), null);
    }

    void save(Resume r){
        storage[size] = r;
        size++;
    }

    Resume get(String uuid) {
        for(int i = 0; i < storage.length; i++) {
            if(storage[i].uuid.equals(uuid)) {
                return storage[i];
            }
        }
        return null;
    }

    void delete(String uuid) {
        size--;
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {
        return Arrays.copyOf(storage, size());
    }

    int size() {
        return size;
    }
}
