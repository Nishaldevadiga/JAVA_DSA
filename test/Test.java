package test;

public class Test {

    public static void Indices(int[] num,int target) {
 
  int start=0;
  int end=num.length-1;

  while(start<end){

    if(num[start]+num[end]==target){
       System.out.println(start+" "+end);  
    }

    if(num[start]+num[end]<target){
        start++;
    }else{
        end--;
    }
  }
    }

    public static void main(String[] args) {
        int [] nums={2,7,11,15};
        Indices(nums,9);
       
    }
}
