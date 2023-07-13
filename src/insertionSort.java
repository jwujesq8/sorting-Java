public class insertionSort {
    static void printArray(float[] array, int size){
        for(int k=0;k<size;k++){
            System.out.println("A["+k+"]="+array[k]);
        }
    }

    static void sort(float[] array, int size){
        for (int i=1;i<size;i++){
            float currentElement = array[i];
            int j=i-1;
            while(j>=0 && array[j]>currentElement){
                array[j+1]=array[j];
                j--;
            }
            array[j+1] = currentElement;
        }
    }
    public static void main(String[] args){
        float[] A = {5,14,0,2,7};
        int size = A.length;
        System.out.println("SIZE: " + size + "\nstart: ");
        printArray(A, size);
        System.out.println("end: ");
        sort(A, size);
        printArray(A, size);
    }
}
