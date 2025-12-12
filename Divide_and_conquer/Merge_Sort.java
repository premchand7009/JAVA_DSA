public class Merge_Sort{
    public static void printArray(int ar[]){
        for (int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }
    public static void mergeSort(int ar[],int si,int ei){
        if (si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        mergeSort(ar, si, mid);
        mergeSort(ar, mid+1, ei);

        merge(ar,si,mid,ei);
    }
    public static void merge(int arr[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;

        while (i<=mid && j<=ei) {
            if(arr[i]<=arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            } 
            k++;         
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        for (k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,4,5,2,7};
        mergeSort(arr, 0, arr.length-1);
        printArray(arr);
    }
}