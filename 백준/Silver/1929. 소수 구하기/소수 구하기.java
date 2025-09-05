import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m= sc.nextInt();
        int n= sc.nextInt();
        
        ArrayList<Integer> primes = new ArrayList<>();
        for(int i=m;i<=n;i++){
            if(isPrime(i)){
                primes.add(i);
            }
        }
        for(int i=0;i<primes.size();i++){
            System.out.println(primes.get(i));
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