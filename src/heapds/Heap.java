package heapds;

public class Heap {
    public int getLeftIndex(int index){
        return 2 * index + 1;
    }
    
    public int getRightIndex(int index){
        return 2 * index + 2;
    }
    
    public int getParentIndex(int index){
        return (index - 1) / 2;
    }
    
    public boolean hasLeftChild(int index, int size){
        return getLeftIndex(index) < size;
    }
    
    public boolean hasRightChild(int index, int size){
        return getRightIndex(index) < size;
    }
    
    public boolean hasParent(int index){
        return getParentIndex(index) >= 0;
    }
    
    public int leftChild(int index, int[] items){
        return items[getLeftIndex(index)];
    }
    
    public int rightChild(int index, int[] items){
        return items[getRightIndex(index)];
    }
    
    public int parent(int index, int[] items){
        return items[getParentIndex(index)];
    }
    
    public void swap(int i, int j, int[] items){
        int temp = items[i];
        items[i] = items[j];
        items[j] = temp;
    }
}
