package SubArray;

public class MaxWinSub {
    public static String MinWin(String str, String t) {

        int arr[] = new int[256];

        for (int i = 0; i < t.length(); i++) {
            arr[t.charAt(i)]++;
        }

        int l = 0, r = 0,count=0;
        int minlen = Integer.MAX_VALUE;
        int sidx = -1;

        while(r<str.length()){

           
            if(arr[str.charAt(r)]>0){
                count++;
            }
            arr[str.charAt(r)]--;

            while(count==t.length()){
                if(r-l+1<minlen){
                    minlen=r-l+1;
                    sidx=l;
                }

                //contract by moving l
                arr[str.charAt(l)]++;
                if(arr[str.charAt(l)]>0){
                    count--;
                }
                l++;
            }

            r++;
        }

        return sidx==-1?"": str.substring(sidx, sidx+minlen);
    }

    public static void main(String[] args) {
        String str = "ddaaabbca";
        String t = "abc";
        System.out.println(MinWin(str,t));

    }

}
