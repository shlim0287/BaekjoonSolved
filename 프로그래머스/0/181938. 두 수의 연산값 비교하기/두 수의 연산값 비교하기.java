class Solution {
    public int solution(int a, int b) {
        StringBuilder sb=new StringBuilder();
        String a1=String.valueOf(a);
        String b1=String.valueOf(b);
        
        sb.append(a1);
        sb.append(b1);
        int a2=Integer.parseInt(sb.toString());
        
        int multipliy=2*a*b;
        
        if(a2>=multipliy){
            return a2;
        }else{
            return multipliy;
        }
    }
}