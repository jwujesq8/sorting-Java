public class selectionSort {
    static void printArray(float[] array, int size){
        for (int k=0;k<size; k++){
            System.out.println("\tA["+k+"]="+array[k]);
        }
    }
    static void sort(float[] array, int size){
        for(int i=0;i<size-1;i++){
            int minIndex = i;
            for(int j=i+1;j<size;j++){
                if(array[minIndex]>array[j]){
                    minIndex = j;
                }
            }
            if(i!=minIndex){
                float min = array[minIndex];
                array[minIndex] = array[i];
                array[i] = min;
            }
        }

    }

    public static void main(String[] args){
        float[] A= {5,10,7,2,6};
        int size = A.length;
        System.out.println("SIZE: "+ size + "\nstart:");
        printArray(A, size);
        sort(A, size);
        System.out.println("end:");
        printArray(A, size);

    }
}
