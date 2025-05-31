package Stackss;

import java.util.Stack;

public class MaxAreaHistogram {

    static Stack<Integer> s = new Stack<>();

    public static int[] nextsmalleft(int[] arr) {
        int[] nsl = new int[arr.length];

        for(int i=0;i<arr.length;i++){

            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }

            if(s.isEmpty()){
                nsl[i]=-1;
            }else{
                nsl[i]=s.peek();
            }
           s.push(i);
        }
return nsl;

    }

    public static int[] nextsmallright(int[] arr){
        int[] nsr=new int[arr.length];
        s.clear();
        for(int i=arr.length-1;i>=0;i--){

            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }

            if(s.isEmpty()){
                nsr[i]=arr.length;
            }else{
                nsr[i]=s.peek();
            }
           s.push(i);
        }
        return nsr;
    }

    public static int CalcMaxArea(int[] arr,int[] nsl,int[] nsr) {
        int maxArea=0;
       for(int i=0;i<arr.length;i++){
        int width=nsr[i]-nsl[i]-1;
        int calcarea=width*arr[i];
        maxArea=Math.max(maxArea,calcarea);
       }
       return maxArea;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 5, 6, 2, 3 };
        int nsr[]=nextsmallright(arr);
        int nsl[]=nextsmalleft(arr);
        for(int i=0;i<nsr.length;i++){
            System.out.print(" "+nsr[i]);
        }
        int result=CalcMaxArea(arr, nsl, nsr);
        System.out.println(result);
;
    }

}
