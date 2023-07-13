public class quickSort {
    static void printArray(float[] array, int size){
        for (int k=0;k<size;k++){
            System.out.println("\tA["+k+"]="+array[k]);
        }
    }
    static int findMedianIndex(float[] array, int low, int high){
        float elementToCompare = array[high];
        int medianIndex = low-1;
        for(int i=low; i<high;i++){
            if(array[i]<elementToCompare){
                medianIndex++;
                float tmp = array[medianIndex];
                array[medianIndex] = array[i];
                array[i] = tmp;
            }
        }
        float tmp = array[medianIndex+1];
        array[medianIndex+1] = array[high];
        array[high] = tmp;
        return medianIndex+1;
    }
    static void sort(float[] array, int low, int high){
        if(low<high){
            int index = findMedianIndex(array,low, high);
            sort(array,low, index-1);
            sort(array,index+1, high);
        }

    }

    public static void main(String[] args){
        float[] A = {4,1,8,9,2,3,0};
        int size = A.length;
        System.out.println("SIZE: "+size+"\nstart:");
        printArray(A, size);
        sort(A, 0, size-1);
        System.out.println("end:");
        printArray(A, size);
    }
}
