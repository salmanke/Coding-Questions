Consider an array with n elements and value of all the elements is zero. We can perform following operations on the array. 
  
Incremental operations:Choose 1 element from the array and increment its value by 1.
Doubling operation: Double the values of all the elements of array.

public static int NstepsArray(int[] a,int n){
    int res=0;
    while(true){
      int i,count=0;
      for(i=0;i<n;i++){
        if(a[i]%2==1)
          break;
        else if(a[i]==0)
          count++;
      }
      if(count==n){
        for(int j=0;j<n;j++)
          a[i]/=2;
        res++;
      }
      while(i<n){
          if(a[i]%2==1){
            a[i]--;
            res++;
            }  
        }
    }
  return res;
}
