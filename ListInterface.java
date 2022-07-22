public interface ListInterface {
    boolean isEmpty();

    int size();

    void add(int var1, Object var2) throws ListIndexOutOfBoundsException, ListException;

    Object get(int var1) throws ListIndexOutOfBoundsException;

    void remove(int var1) throws ListIndexOutOfBoundsException;

    void removeAll();
}
