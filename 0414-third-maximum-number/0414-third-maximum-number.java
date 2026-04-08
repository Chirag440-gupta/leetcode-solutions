class Solution {
    public int thirdMax(int[] nums) {
        Long f=null,s=null,t=null;
        for(int num:nums){
            if((f != null && num == f) ||
               (s != null && num == s) ||
               (t != null && num == t)){
                continue;
            }

            if(f==null || num>f){
                t=s;
                s=f;
                f=(long)num;
            }
           else if(s==null || num>s){
            t=s;
            s=(long)num;
           }
           else if(t==null || num>t){
            t=(long)num;
           }
        }
        return (t==null)? f.intValue():t.intValue();
    }
}