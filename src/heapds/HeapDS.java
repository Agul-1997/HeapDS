package heapds;

public class HeapDS {
    public static void main(String[] args) {
        MinHeap minH = new MinHeap();
        minH.add(10);
        minH.add(55);
        minH.add(8);
        minH.add(9);
        minH.add(3);
        minH.add(5);
        System.out.println(minH.peek());
        minH.poll();
        System.out.println(minH.peek());
        MaxHeap maxH = new MaxHeap();
        maxH.add(10);
        maxH.add(55);
        maxH.add(8);
        maxH.add(9);
        maxH.add(3);
        maxH.add(5);
        System.out.println(maxH.peek());
        maxH.poll();
        System.out.println(maxH.peek());
    }
    
}
