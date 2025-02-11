package Strings;

public class Largest {
//lexicographically largest
    public static String LargestCheck(String arr[]){
        String largest=arr[0];
         for(int i=0;i<arr.length;i++){
            if(largest.compareToIgnoreCase(arr[i])<0){
                largest=arr[i];
            }
         }
         return largest;
    }
    public static void main(String[] args) {
        String arr[]={"apple","grapes","orange"};
        String result=LargestCheck(arr);
        System.out.println(result);
        
    }
}
