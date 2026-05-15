class Solution {
    public int convertTime(String current, String correct) {
        int c=toMinutes(current);   //150
        int co=toMinutes(correct);    //275

        int d= co-c;   // 275-150=>125..
        int[] arr={60,15,5,1};
        int a=0;
        for(int ab:arr){
            a+=d/ab;
            d%=ab;
        }
        return a;
    }
    private int toMinutes(String time){
        String[] t=time.split(":");
        int h=Integer.parseInt(t[0]);
        int m=Integer.parseInt(t[1]);

        return h*60+m;
    }
}