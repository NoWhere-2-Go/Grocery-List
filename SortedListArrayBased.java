public class SortedListArrayBased extends ListArrayBased {
    public SortedListArrayBased() {
    }

    public void add(Object item) throws ListException {
        try {
            int index = this.locateIndexToAdd(item);
            this.add(index, item);
        } catch (Exception var3) {
            throw new ListException("Add to List failed:  " + var3.toString());
        }
    }

    public void remove(Object item) throws ListException {
        try {
            int index = this.locateIndexToRemove(item);
            if (index != -1) {
                this.remove(index);
            }

        } catch (Exception var3) {
            String var10002 = item.toString();
            throw new ListException("Remove " + var10002 + " from List failed:  " + var3.toString());
        }
    }

    public int locateIndexToAdd(Object item) {
        int i = 0;
        if (i < this.size()) {
            if (item.toString().compareTo(this.get(i).toString()) <= 0) {
            }

            return i;
        } else {
            return this.size();
        }
    }

    public int locateIndexToRemove(Object item) {
        int i = 0;
        if (i < this.size()) {
            if (item.toString().compareTo(this.get(i).toString()) <= 0) {
            }

            return i;
        } else {
            return -1;
        }
    }
}
