import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);
        int lt=0, rt=people.length-1;

        while(lt<=rt) {
            if(limit >= people[lt]+people[rt]) {
                lt++;
                rt--;
                answer++;
            } else {
                answer++;
                rt--;
            }
        }
        return answer;
    }
}