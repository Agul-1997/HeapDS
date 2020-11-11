package heapds;

import java.util.Arrays;

public class MaxHeap extends Heap {
    private int capacity = 10;
    private int size = 0;
    
    // heap tree stored in an array
    int[] items = new int[capacity];
    
    // increases the size of the array dynamically
    private void ensureCapacity(){
        if(size == capacity){
            items = Arrays.copyOf(items, capacity * 2);
            capacity *= 2;
        }
    }
    
    // returns the root of the heap tree
    public int peek(){
        if(size == 0)
            throw new IllegalStateException();
        return items[0];
    }
    
    // removes the root of the heap tree
    public int poll(){
        if(size == 0)
            throw new IllegalStateException();
        int item = items[0];
        items[0] = items[--size];
        heapifyDown();
        return item;
    }
    
    //add a new element to the heap tree
    public void add(int item){
        ensureCapacity();
        items[size++] = item;
        heapifyUp();
    }
    
    // to maintain the property of the maximum heap tree
    // when an element is added
    // it starts to heapify from where the element is added
    public void heapifyUp(){
        int index = size - 1;
        while(hasParent(index) && parent(index, items) < items[index]){
            swap(getParentIndex(index), index, items);
            index = getParentIndex(index);
        }
    }
    
    // to maintain the property of the maximum heap tree
    // when an element is added
    // it starts to heapify from the root of the tree
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
