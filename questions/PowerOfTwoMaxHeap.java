public class PowerOfTwoMaxHeap<T extends Comparable<? super T>> {

    private Object[] heap;
    private int size;
    private final int childPower;
    private final int branching;

    private static final int DEFAULT_CAPACITY = 16;

    public PowerOfTwoMaxHeap(int childPower) {
        if (childPower < 0) throw new IllegalArgumentException("childPower must be >= 0");
        this.childPower = childPower;
        this.branching = 1 << childPower;
        this.heap = new Object[DEFAULT_CAPACITY];
    }

    public void insert(T value) {
        if (value == null) throw new NullPointerException("Null values not allowed");
        ensureCapacity(size + 1);
        heap[size] = value;
        siftUp(size);
        size++;
    }

    @SuppressWarnings("unchecked")
    public T popMax() {
        if (size == 0) return null;

        T top = (T) heap[0];
        size--;

        if (size > 0) {
            heap[0] = heap[size];
            heap[size] = null;
            siftDown(0);
        } else {
            heap[0] = null;
        }

        return top;
    }

    @SuppressWarnings("unchecked")
    public T peekMax() {
        return size == 0 ? null : (T) heap[0];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void ensureCapacity(int needed) {
        if (needed <= heap.length) return;
        int newCap = heap.length;
        while (newCap < needed) newCap <<= 1;

        Object[] arr = new Object[newCap];
        System.arraycopy(heap, 0, arr, 0, size);
        heap = arr;
    }

    @SuppressWarnings("unchecked")
    private void siftUp(int idx) {
        int cur = idx;
        T val = (T) heap[cur];

        while (cur > 0) {
            int parent = (cur - 1) / branching;
            T parentVal = (T) heap[parent];

            if (parentVal.compareTo(val) >= 0) break;

            heap[cur] = parentVal;
            cur = parent;
        }

        heap[cur] = val;
    }

    @SuppressWarnings("unchecked")
    private void siftDown(int idx) {
        int cur = idx;
        T val = (T) heap[cur];

        while (true) {
            long first = (long) branching * cur + 1;
            if (first >= size) break;

            int best = (int) first;
            T bestVal = (T) heap[best];

            int last = (int) Math.min(size - 1, first + branching - 1);

            for (int c = best + 1; c <= last; c++) {
                T childVal = (T) heap[c];
                if (childVal.compareTo(bestVal) > 0) {
                    bestVal = childVal;
                    best = c;
                }
            }

            if (bestVal.compareTo(val) <= 0) break;

            heap[cur] = bestVal;
            cur = best;
        }

        heap[cur] = val;
    }

    public static void main(String[] args) {
        PowerOfTwoMaxHeap<Integer> h = new PowerOfTwoMaxHeap<>(2);

        h.insert(40);
        h.insert(12);
        h.insert(99);
        h.insert(3);
        h.insert(70);

        while (!h.isEmpty()) {
            System.out.println(h.popMax());
        }
    }
}
