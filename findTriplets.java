Count triplets with given target sum

public static ArrayList<List<Integer>> triplets(int[] a,int n,int target){
  List<List<Integer>> li=new ArrayList<>();
  for(int i=0;i<n-2;i++){
    int j=i+1,k=n-1;
    while(j<k){
      if(a[i]+a[j]+a[k]==target)
        li.add(new ArrayList(a[i],a[j],a[k]);
      else if(a[i]+a[j]+a[k]<target)
        j++;
      else
        k--;
    }
  }
  return li;
}
