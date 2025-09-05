import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();
        int n= sc.nextInt();
        List<Integer> list = primes(m,n);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        
    }
    private static List<Integer> primes(int m, int n){
        boolean[] arr = new boolean[n+1];
        Arrays.fill(arr, true);
        arr[0] = false;
        if(n>=1){
            arr[1]=false;
        }
        
        for(int i=2;i*i<=n;i++){
            if(arr[i]){
                for(int j =i*i;j<=n;j+=i){
                    arr[j]=false;
                }
            }
        }
        List<Integer> primes = new ArrayList<>();
        for(int i=m;i<=n;i++){
            if(arr[i]){
                primes.add(i);
            }
        }
        return primes;
    }
}