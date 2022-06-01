Given a string str, find the length of the longest substring without repeating characters.


public static String helper(String s,int n){
  
  if(n==0)
    return "";
  if(n==1)
    return s;
  Char c[]=s.toCharArray();
  String res="";
  int count=0;
  for(int i=0;i<n;i++){
    String cur=String.valueOf(c[i]);
    
    if(res.contains(cur)){
      res=res.substring(res.indexOf(cur)+1);
    }
    res=res+cur;
    
    count = Math.max(res.length(), count);
  }
  return res;
}
