class Solution
{
	public int maxProduct(int A[])
	{
		int max = 1; 
        int min = 1; 
        int ans = Integer.MIN_VALUE; 
        for (int i : A){
            if (i < 0){
                int temp = max; 
                max = min; 
                min = temp; 
            }
            max = Math.max(i, i * max); 
            min = Math.min( i, i * min); 
            ans = Math.max(max, ans); 
            
        }
        return ans; 
	}
}