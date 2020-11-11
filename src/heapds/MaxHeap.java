package heapds;

import java.util.Arrays;

public class MaxHeap extends Heap {
    private int capacity = 10;
    private int size = 0;
    
    int[] items = new int[capacity];
    
    private void ensureCapacity(){
        if(size == capacity){
            items = Arrays.copyOf(items, capacity * 2);
            capacity *= 2;
        }
    }
    
    public int peek(){
        if(size == 0)
            throw new IllegalStateException();
        return items[0];
    }
    
    public int poll(){
        if(size == 0)
            throw new IllegalStateException();
        int item = items[0];
        items[0] = items[--size];
        heapifyDown();
        return item;
    }
    
    public void add(int item){
        ensureCapacity();
        items[size++] = item;
        heapifyUp();
    }
    
    public void heapifyUp(){
        int index = size - 1;
        while(hasParent(index) && parent(index, items) < items[index]){
            swap(getParentIndex(index), index, items);
            index = getParentIndex(index);
        }
    }
    
    public void heapifyDown(){
        int index = 0;
        while(hasLeftChild(index, size)){
            int highChildIndex = getLeftIndex(index);
            if(hasRightChild(index, size) && rightChild(index, items) > leftChild(index, items))
                highChildIndex = getRightIndex(index);
            if(items[index] > items[highChildIndex])
                break;
            else
                swap(index, highChildIndex, items);
            index = highChildIndex;
        }
    }
}
