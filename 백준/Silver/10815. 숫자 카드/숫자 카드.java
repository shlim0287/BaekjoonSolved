import java.util.*;
import java.io.*;
public class Main{
    static int num1,num2;
    static int[] array1;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        num1 = Integer.parseInt(br.readLine());

        array1 = new int[num1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < num1; i++) {
            array1[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(array1);

        num2 = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < num2; i++) {
            int compare = Integer.parseInt(st.nextToken());

            bw.write(BinarySearch(compare) + " ");
        }

        br.close();
        bw.flush();
        bw.close();

    }

    public static int BinarySearch(int compare){
        int left=0;
        int right=num1-1;

        while(left<=right){
            int middle=(left+right)/2;
            int middleValue=array1[middle];

            if(compare>middleValue){
                left=middle+1;
            }else if(compare<middleValue){
                right=middle-1;
            }else return 1;
        }
        return 0;
    }
}