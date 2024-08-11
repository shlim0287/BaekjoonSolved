import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        
        int answer=0;
        ArrayList<String> db=new ArrayList<>();
        
        if(cacheSize==0){
            return answer+=cities.length *5;
        }
        for(int i=0;i<cities.length;i++){
            String city=cities[i].toUpperCase();
            
            if(db.contains(city)){
                db.remove(city);
                db.add(city);
                answer+=1;
            }else{
                if(db.size()==cacheSize){
                    db.remove(0);
                }
                
                db.add(city);
                answer+=5;
            }
        }
        return answer;
    }
}