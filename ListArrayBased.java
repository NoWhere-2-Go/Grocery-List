
public class ListArrayBased implements ListInterface {
    private static final int MAX_LIST = 50;
    private Object[] items = new Object[50];
    private int numItems = 0;
    ListInterface li = new ListArrayBased();

    public ListArrayBased() {
    }

    public boolean isEmpty() {
        return this.numItems == 0;
    }

    public int size() {
        return this.numItems;
    }

    public void removeAll() {
        this.items = new Object[50];
        this.numItems = 0;
    }

    public void add(int index, Object item) throws ListIndexOutOfBoundsException {
        if (this.numItems >= 50) {
            throw new ListException("ListException on add");
        } else if (index >= 0 && index <= this.numItems) {
            for(int pos = this.numItems - 1; pos >= index; --pos) {
                this.items[pos + 1] = this.items[pos];
            }

            this.items[index] = item;
            ++this.numItems;
        } else {
            throw new ListIndexOutOfBoundsException("ListIndexOutOfBoundsException on add");
        }
    }

    public Object get(int index) throws ListIndexOutOfBoundsException {
        if (index >= 0 && index < this.numItems) {
            return this.items[index];
        } else {
            throw new ListIndexOutOfBoundsException("ListIndexOutOfBoundsException on get");
        }
    }

    public void remove(int index) throws ListIndexOutOfBoundsException {
        if (index >= 0 && index < this.numItems) {
            for(int pos = index + 1; pos < this.size(); ++pos) {
                this.items[pos - 1] = this.items[pos];
            }

            --this.numItems;
        } else {
            throw new ListIndexOutOfBoundsException("ListIndexOutOfBoundsException on remove");
        }
    }

    public String toString() {
        String tempString = new String();

        for(int i = 0; i < this.size(); ++i) {
            tempString = tempString + this.get(i) + " ";
        }

        return tempString;
    }

    public void reverse() {
        int last = this.size() / 2;

        for(int i = 0; i < last; ++i) {
            Object temp = this.items[i];
            this.items[i] = this.items[this.size() - 1 - i];
            this.items[this.size() - 1 - i] = temp;
        }

    }

    public Object findMToLast(int m) {
        return m >= 1 && m <= this.size() ? this.items[this.size() - m] : m;
    }
}
