public class bubbleSort {
    static void printArray(float[] array, int size){
        for (int k=0;k<size;k++){
            System.out.println("\tA["+k+"]="+array[k]);
        }
    }
    static void sort(float[] array, int size){
        for (int i=0;i<size-1;i++){
            for(int j=0;j<size-i-1;j++){
                if(array[j]>array[j+1]){
                    float tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1]=tmp;
                }
            }
        }
    }

    public static void main(String[] args){
        float[] A= {5,1,7,3,9,4};
        int size = A.length;
        System.out.println("SIZE: "+size+"\nstart:");
        printArray(A, size);
        sort(A, size);
        System.out.println("emd:");
        printArray(A, size);
    }
}
