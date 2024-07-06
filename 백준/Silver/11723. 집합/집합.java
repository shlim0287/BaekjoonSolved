import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb=new StringBuilder();
        Set<Integer> set=new HashSet<>();
        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine());
            String o = st.nextToken();
            if (o.equals("add")) {
                int r = Integer.parseInt(st.nextToken());
                set.add(r);
            } else if (o.equals("remove")) {
                int r = Integer.parseInt(st.nextToken());
                set.remove(r);
            } else if (o.equals("check")) {
                int r = Integer.parseInt(st.nextToken());
                if (set.contains(r)) {
                    sb.append("1").append("\n");
                } else {
                    sb.append("0").append("\n");
                }
            } else if (o.equals("toggle")) {
                int r = Integer.parseInt(st.nextToken());
                if (set.contains(r)) {
                    set.remove(r);
                } else {
                    set.add(r);
                }
            } else if (o.equals("all")) {
                for(int j=1;j<=20;j++){
                    set.add(j);
                }
            } else if (o.equals("empty")) {
                set.clear();
            }
        }
        System.out.println(sb.toString());
    }
}
