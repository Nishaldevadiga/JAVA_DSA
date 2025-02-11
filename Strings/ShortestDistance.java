package Strings;

public class ShortestDistance {

    public static float CalcDis(String str){
        int x=0,y=0;
        for(int i=0;i<str.length();i++){

            char dis=str.charAt(i);
           //north
            if(dis=='N'){
              y++;
            }else if(dis=='S'){
                y--;
            }else if(dis=='E'){
                x++;
            }else{
                x--;
            }
        }

        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);
    }

    public static void main(String[] args) {
        String dis="WNEENESENNN";
        float result=CalcDis(dis);
        System.out.println(result);
    }
    
}
