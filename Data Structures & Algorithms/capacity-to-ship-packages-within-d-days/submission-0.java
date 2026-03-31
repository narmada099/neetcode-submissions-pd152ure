class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l=0;
        int r=0;
        for(int w:weights){
          l=Math.max(l,w);
          r+=w;
        }
        int res=r;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(canShip(weights,days,mid)){
                res=mid;
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return res;
    }

    boolean canShip(int[] weights,int days, int cap){
        int usedDays=1;
        int curr=0;
        for(int w:weights){
            if(curr+w<=cap){
                curr+=w;
            }else{
                curr=w;
                usedDays++;
                if(usedDays>days){
                    return false;
                }
            }
        }
        return true;
    }
}