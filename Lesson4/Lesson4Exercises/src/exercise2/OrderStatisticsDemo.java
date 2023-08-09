package exercise2;

import java.util.Arrays;

class KthSmallst { 
	int kthSmallest(int arr[], int l, int r, int k)   	{ 
		System.out.println("Intermedio: "+Arrays.toString(arr));
		if (k > 0 && k <= r - l + 1) { 
			int pos = randomPartition(arr, l, r); 
            if (pos-l == k-1) 
            	return arr[pos]; //esto finaliza cuando la posicin 4 est en su lugar
            if (pos-l > k-1)
            	return kthSmallest(arr, l, pos-1, k); 
            	return kthSmallest(arr, pos+1, r, k-pos+l-1); 
        } 
        return Integer.MAX_VALUE; 
    } 

	void swap(int arr[], int i, int j) { 
        int temp = arr[i];
        System.out.print("hago swap: pos: "+i+" valor: "+arr[i]+" por pos: "+j+" valor: "+arr[j]+"\n");
        arr[i] = arr[j]; 
        arr[j] = temp; 
    } 
	
    int partition(int arr[], int l, int r) { 
    	//Cojo el valor del pivote y veo los que son ms pequeos o iguales y me los llevo a las primeras 
    	//posiciones, cuando acabo cammbio la posicin del pivote por la siguiente posicin que no he rllenado
    	//y devuelvo esta posicin, todos a su izq son ms pequeos que el pivote y a la derecha ms grandes
        int x = arr[r], i = l; 
        for (int j = l; j <= r - 1; j++)        { 
            if (arr[j] <= x)    { 
                swap(arr, i, j); 
                i++; 
                System.out.println("Partition Process: "+Arrays.toString(arr));
            } 
        } 
        swap(arr, i, r); 
        System.out.println("Partition Final: "+Arrays.toString(arr));
        return i; 
    } 
    
    int randomPartition(int arr[], int l, int r) { 
//    	Cojo y calculo un pivote al azar
//    	cambio el valor de la posición del pivote por el último valor
        int n = r-l+1; 
        int pivot = (int)(Math.random()) * (n-1); 
        System.out.println("Pivote: "+pivot);
        swap(arr, l + pivot, r); 
        return partition(arr, l, r); 
    } 
}

public class OrderStatisticsDemo {
	

	public static void main(String[] args) {
		KthSmallst ob = new KthSmallst(); 
        int arr[] = {12, 5, 3, 7, 4, 19, 26}; 
        int n = arr.length,k = 4;
        System.out.println("Inicial: "+Arrays.toString(arr));
        System.out.println("4th smallest element is "+ ob.kthSmallest(arr, 0, n-1, k)); 
        System.out.println("Ordenado: "+Arrays.toString(arr));

	}

}
