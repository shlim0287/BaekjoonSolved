import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = br.readLine().split(" ");  
        String num1 = new StringBuilder(numbers[0]).reverse().toString();
        String num2 = new StringBuilder(numbers[1]).reverse().toString();
        
        System.out.println(Math.max(Integer.parseInt(num1), Integer.parseInt(num2)));
    }
}
