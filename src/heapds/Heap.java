package heapds;

public class Heap {
    // returns index of the left child in the tree
    public int getLeftIndex(int index){
        return 2 * index + 1;
    }
    
    // returns index of the right child in the tree
    public int getRightIndex(int index){
        return 2 * index + 2;
    }
    
    // returns index of the parent node in the tree
    public int getParentIndex(int index){
        return (index - 1) / 2;
    }
    
    // returns true if the node has left child else false
    public boolean hasLeftChild(int index, int size){
        return getLeftIndex(index) < size;
    }
    
    // returns true if the node has right child else false
    public boolean hasRightChild(int index, int size){
        return getRightIndex(index) < size;
    }
    
    // returns false if in the root node else false
    public boolean hasParent(int index){
        return getParentIndex(index) >= 0;
    }
    
    // returns the value of the left child
    public int leftChild(int index, int[] items){
        return items[getLeftIndex(index)];
    }
    
    // returns the value of the right child
    public int rightChild(int index, int[] items){
        return items[getRightIndex(index)];
    }
    
    // returns the value of parent node
    public int parent(int index, int[] items){
        return items[getParentIndex(index)];
    }
    
    // swaps the i'th and j'th node
    public void swap(int i, int j, int[] items){
        int temp = items[i];
        items[i] = items[j];
        items[j] = temp;
    }
}
