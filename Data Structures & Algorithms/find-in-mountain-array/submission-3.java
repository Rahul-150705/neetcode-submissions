/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int left=0;
        int right=mountainArr.length()-1;
        while(left<right)
        {
            int mid=left+(right-left)/2;
            int m=mountainArr.get(mid);
            int r=mountainArr.get(mid+1);
            if(m<r)
            {
                left=mid+1;
            }
            else
            {
                right=mid;
            }
        }
        int peak=left;
        int result=binarysearchleft(target,mountainArr,0,left); // left side
        if(result!=-1)
        {
            return result;
        }
        return binarysearchright(target,mountainArr,left+1,mountainArr.length()-1);
    }
    private int binarysearchleft(int target,MountainArray mountainArr,int left,int right)
    {
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            int val=mountainArr.get(mid);
            if(val<target)
            {
                left=mid+1;
            }
            else if(val>target)
            {
                right=mid-1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
    private int binarysearchright(int target,MountainArray mountainArr,int left,int right)
    {
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            int val=mountainArr.get(mid);
            if(val>target)
            {
                left=mid+1;
            }
            else if(val<target)
            {
                right=mid-1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}