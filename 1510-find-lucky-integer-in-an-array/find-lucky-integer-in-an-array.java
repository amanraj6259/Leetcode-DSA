class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> mp = new HashMap<>();
       // PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
        for(Integer a: arr)
        {
           
            mp.put(a,mp.getOrDefault(a,0)+1);
           
        }
        int maxi=-1;
        for(Map.Entry<Integer,Integer> entry : mp.entrySet())
        {
            int key = entry.getKey();
            int val = entry.getValue();
            if(key==val)
            maxi= Math.max(maxi,val);
        }
       
       
       return maxi;
        
    }
}

/*

| 📝                                                                               | Lambda can only access variables that are `final` or `effectively final` because lambdas capture values, not the variable itself. |
| -------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- |
| ❌ You tried to modify `maxi` inside the lambda → breaks `effectively final` rule |                                                                                                                                   |
| ✅ Fix by using loop, mutable wrapper (e.g. array), or streams                    |                                                                                                                                   |


*/
