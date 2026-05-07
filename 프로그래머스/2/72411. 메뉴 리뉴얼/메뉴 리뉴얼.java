import java.util.*;

class Solution {
    static Map<String, Integer> map;
    static int max;
    
    public String[] solution(String[] orders, int[] course) {
        List<String> answer = new ArrayList<>();
        
        for(int courseSize : course) {
            map = new HashMap<>();
            max = 0;
            
            for(String order : orders) {
                char[] arr = order.toCharArray();
                Arrays.sort(arr);
                
                combination(arr, courseSize, 0, new StringBuilder());
            }
            
            for(String key : map.keySet()) {
                int count = map.get(key);
                
                if(count >= 2 && count == max) {
                    answer.add(key);
                }
            }
        }
        
        Collections.sort(answer);
        return answer.toArray(new String[0]);
    }
    
    private void combination(char[] arr, int courseSize, int start, StringBuilder sb) {
        if(sb.length() == courseSize) {
            String menu = sb.toString();
            
            map.put(menu, map.getOrDefault(menu, 0) + 1);
            max = Math.max(max,map.get(menu));
            
            return;
        }
        
        for(int i = start; i < arr.length; i++) {
            sb.append(arr[i]);
            
            combination(arr, courseSize, i + 1, sb);
            
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}