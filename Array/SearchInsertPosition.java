class Solution
{
    public int searchInsert(int[] arr, int t) 
    {
        int count = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] < t)
            {
                count += 1;
            }
        }
        return count;
    }
}