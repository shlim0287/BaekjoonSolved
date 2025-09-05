import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for(int i=m;i<=n;i++){
            if(isPrime(i)){
                list.add(i);
                sum+=i;
            }
        }
        if(list.size()==0){
            System.out.println("-1");
        }else{
        System.out.println(sum);
        System.out.println(list.get(0));
        }
    }
    
    private static boolean isPrime(int num){
        if(num<2){
            return false;
        }
        if(num==2){
            return true;
        }
        if(num%2==0){
            return false;
        }
        for(int i=3;i*i<=num;i+=2){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}