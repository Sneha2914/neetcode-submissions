class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> res = new ArrayList<>();
        int i=0;
        int j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]>nums2[j] && j<nums2.length){
                j++;
            }
            else if(nums1[i]<nums2[j] && i<nums1.length){
                i++;
            }
            else if(nums1[i]==nums2[j]){
                if(res.isEmpty() || nums1[i]!=res.get(res.size()-1))
                {
                     res.add(nums1[i]);
                }
                i++;
                j++;
            }
        }
        int k=0;
        int [] ans = new int[res.size()];
        for(int r : res){
            ans[k++]=r;
        }
        return ans;
    }
}