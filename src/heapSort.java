public class heapSort {

    static void printArray(float[] array, int size){
        for (int k=0;k<size;k++){
            System.out.println("\tA["+k+"]="+array[k]);
        }
    }
    static void heapify(float[] array,int size, int p){
        int left = p*2+1;
        int right = p*2+2;
        int largestElementIndex = p;
        
        if(left<size && array[left]>array[p]){
            largestElementIndex = left;
        }
        if(right<size && array[right]>array[largestElementIndex]){
            largestElementIndex = right;
        }
        if(largestElementIndex!=p){
            float tmp = array[p];
            array[p] = array[largestElementIndex];
            array[largestElementIndex] = tmp;
            heapify(array, size, largestElementIndex);
        }

    }
    static void sort(float[] array, int size){
        for(int i=size/2;i>=0;i--){
            heapify(array, size, i);
        }
        for(int j=size-1;j>=0;j--){
            float tmp = array[j];
            array[j] = array[0];
            array[0] = tmp;

            heapify(array, j, 0);
        }
    }
    public static void main(String[] args){
        float[] A = {5,8,1,0,6,3};
        int size = A.length;
        System.out.println("SIZE: "+size+"\nstart:");
        printArray(A, size);
        sort(A, size);
        System.out.println("end:");
        printArray(A, size);
    }
}
