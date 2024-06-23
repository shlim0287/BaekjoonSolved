import java.util.*;
import java.io.*;
public class Main{
      public static int [] arrN;
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st=new StringTokenizer(br.readLine());
        arrN=new int [n];

        for(int i=0;i<n;i++){
            arrN[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arrN);

        int m=Integer.parseInt(br.readLine());
        st=new StringTokenizer(br.readLine());


        for(int i=0;i<m;i++){
            int num = Integer.parseInt(st.nextToken());
            bw.write(binarySearch(num) + " ");
            
        }
        br.close();
        bw.flush();
        bw.close();
    }

    public static int binarySearch(int num){
        int left=0;
        int right = arrN.length - 1;
        
        while(left<=right){
            int middle=(left+right)/2;
            int middleValue=arrN[middle];
            
            if(num>middleValue){
                left=middle+1;
            }else if(num<middleValue){
                right=middle-1;
            }else return 1;
            
        }
        return  0;
    }

}