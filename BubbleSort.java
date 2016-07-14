
public class BubbleSort {
    
    public  void buble(int array[]){
        int temp;
        for (int i = 0; i < array.length-1; i++) 
            for (int j = i+1; j < array.length; j++) 
                if(array[j]<array[i]){
                 temp=array[j];
                 array[j]=array[i];
                 array[i]=temp;
                }
            
        
    }
    
    public static void main(String[] args) {
        BubbleSort bu=new BubbleSort();
        int A[]={6,8,1,4,9,0,3,2};
        bu.buble(A);
        System.out.println(Arrays.toString(A));
    }
    
}
