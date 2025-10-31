import java.util.Arrays;

class MinHeap {
    private int[] heap;
    private int size;
    private int capacity;

    public MinHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }

    public void insert(int value) {
        if (size == capacity) {
            System.out.println("Heap is Full");
            return;
        }
        heap[size] = value;
        heapifyUp(size);
        size++;
    }

    public void heapifyUp(int index) {
        if (index == 0) return;

        int child = index;
        int parent = (child - 1) / 2;

        if (heap[child] < heap[parent]) {
            int temp = heap[child];
            heap[child] = heap[parent];
            heap[parent] = temp;

            heapifyUp(parent);
        }
    }

    public int removeMin() {
        if (size == 0) {
            System.out.println("Heap is Empty!");
            return -1;
        }
        int root = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapifyDown(0);
        return root;
    }
    public int removeIndex(int index) {
        if (size == 0) {
            System.out.println("Heap is Empty!");
            return -1;
        }

        if (index < 0 || index >= size) {
            System.out.println("Entered index doesn't exist");
            return -1;
        }

        int deletedValue = heap[index];
        heap[index] = heap[size - 1]; // Replace with last element
        size--; // Reduce size

        // Restore heap property
        if (index > 0 && heap[index] < heap[(index - 1) / 2]) {
            heapifyUp(index);
        } else {
            heapifyDown(index);
        }

        return deletedValue;
    }


    public void heapifyDown(int index) {
        int smallest = index;
        int left = 2 * smallest + 1;
        int right = 2 * smallest + 2;

        if (left < size && heap[smallest] > heap[left]) {
            smallest = left;
        }
        if (right < size && heap[smallest] > heap[right]) {
            smallest = right;
        }
        if (smallest != index) {
            int temp = heap[smallest];
            heap[smallest] = heap[index];
            heap[index] = temp;

            heapifyDown(smallest);
        }
    }
    public int[] sort(){
        MinHeap temp=new MinHeap(capacity);
        for (int i=0;i<size;i++){
            temp.insert(heap[i]);
        }
        int sorted[]=new int[size];
        for (int i=0;i<size;i++){
            sorted[i]=temp.removeMin();
        }
        return sorted;
    }

    public void printHeap() {
        System.out.print("Heap: ");
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }
}

public class main {
    public static void main(String [] args) {
        MinHeap mh = new MinHeap(10);
        mh.insert(10);
        mh.insert(55);
        mh.insert(20);
        mh.insert(2);

        mh.printHeap();

        System.out.println("Removed Min: " + mh.removeMin());
        System.out.print("After remove: ");
        mh.printHeap();
        mh.removeIndex(0);
        mh.printHeap();

        int[] sorted = mh.sort();
        System.out.println("Sorted: " + Arrays.toString(sorted));
    }
}
