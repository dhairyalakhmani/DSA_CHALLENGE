class myList{
    int[] arr;
    int size;

    public myList(){
        arr=new int[5];
        size=0;
    }

    public int size(){
        return this.size;
    }

    public void EnsureCapacity(){
        if(size==arr.length){
            int[] newArr = new int[arr.length*2];
            for(int i=0; i<arr.length; i++){
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
    }

    public void add(int value){
        EnsureCapacity();
        arr[size]=value;
        size++;
    }

    public int get(int index){
        if(index<0 || index>=size){
            throw new IndexOutOfBoundsException("Index "+index+ " is invalid");
        }
        return arr[index];
    }
        
    public void set(int index, int value){
        if(index<0 || index>=size){
            throw new IndexOutOfBoundsException("Index "+index+ " is invalid");
        }
        arr[index]= value;
    }

    public void sort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }   
}

public class AL_Implementation {
    
}
