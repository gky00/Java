package array;

public class q2644 {
	    public int maxDivScore(int[] nums, int[] divisors) {
	        int [] points = new int [divisors.length];
	        for (int i = 0; i <nums.length; i ++){
	            for(int j=0;j<divisors.length;j ++){
	                if (nums[i]%divisors[j]==0)
	                points[j]++;
	            }
	        }
	        int maxPoint = points[0]; //5
	        int result = 0;
	        for (int i =0 ; i <points.length; i ++ ){
	            if (points[i]>maxPoint){ // 7 > 5 
	                result = points[i] ; //max = 7
	               
	            }
	            else if (points[i]==maxPoint){ //7 = 7 
	            result = Math.min(divisors[i],divisors[maxPoint]);
	            }
	        }
	        return result; 
	        }
	}

/**
class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < divisors.length; i++) {
            int d = divisors[i];
            int cnt = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] % d == 0) {
                    cnt++;
                }
            }
            map.put(d, cnt);
        }
        List<Map.Entry<Integer, Integer>> sortedMapList = new ArrayList<>(map.entrySet());
        Collections.sort(sortedMapList, (o1, o2) -> {
            if (o1.getValue() == o2.getValue()){
                return o1.getKey() - o2.getKey();
            }
            return o2.getValue() - o1.getValue();
        });
        return sortedMapList.get(0).getKey();
    }
} 
 */