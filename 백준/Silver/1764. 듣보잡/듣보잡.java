import java.util.*;
import java.io.*;
public class Main{
     public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st=new StringTokenizer(br.readLine());
        int d=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());

        Set<String> setD=new HashSet<>();

        for(int i=0;i<d;i++){
            setD.add(br.readLine());
        }

        ArrayList<String> list=new ArrayList<>();

        for (int i = 0; i < b; i++) {
            String bo = br.readLine();
            if(setD.contains(bo)){
                list.add(bo);
            }
        }
        Collections.sort(list);
        bw.write(list.size()+"\n");

        for (String s : list) {
            bw.write(s+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}