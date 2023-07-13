public class mergeSort {
    static void printArray(float[] array, int size){
        for(int k=0;k<size;k++){
            System.out.println("\tA["+k+"]="+array[k]);
        }
    }
    static void merge(float[] array, int s, int m, int e){
        int sSize = m-s+1;
        int eSize = e-m;
        float[] S = new float[sSize];
        float[] E = new float[eSize];
        System.arraycopy(array, s, S, 0, sSize);
        System.arraycopy(array, m+1, E,0, eSize);

        int i=0,j=0;
        int k = s;
        while(i<sSize && j<eSize){
            if(S[i]<=E[j]){
                array[k] = S[i];
                i++;
            } else {
                array[k] = E[j];
                j++;
            }
            k++;
        }
        while(i<sSize){
            array[k]=S[i];
            i++;
            k++;
        }
        while(j<eSize){
            array[k]=E[j];
            j++;
            k++;
        }

    }
    static void sort(float[] array, int s, int e){
        if(s<e){
            int m = (s+e-1)/2;

            sort(array, s, m);
            sort(array, m+1,e);
            merge(array, s,m,e);
        }
    }
    public static void main(String[] args){
        float[] A = {4,1,9,7,3,0,11,2};
        int size = A.length;
        printArray(A, size);
        sort(A, 0, size-1);
        System.out.println("end:");
        printArray(A, size);
    }
}
