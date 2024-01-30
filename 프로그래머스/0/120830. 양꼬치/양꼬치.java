class Solution {
    public int solution(int n, int k) {
        int sheepPrice=12000;
        int beverage=2000;
        int totalPrice=sheepPrice*n + beverage*k;
        int discountPrice=n/10;
        int answer = totalPrice-discountPrice*2000;
        return answer;
    }
}