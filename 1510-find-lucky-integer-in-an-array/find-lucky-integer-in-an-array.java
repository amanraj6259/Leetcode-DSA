class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> mp = new HashMap<>();
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
        for(Integer a: arr)
        {
           
            mp.put(a,mp.getOrDefault(a,0)+1);
           
        }
        mp.forEach((a,b)->{
            if(a==b)
            {
                pq.add(a);
            }
            
        });
        if(pq.size()==0)
        return -1;
        else
        return pq.peek();
        
    }
}