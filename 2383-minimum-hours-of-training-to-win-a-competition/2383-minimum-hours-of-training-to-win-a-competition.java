class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int se=0;
         for(int n:energy){
            se+=n;  //10
         }
        int te=se+1; //11
        int e = Math.max(0, te - initialEnergy);  //11-5=>6

        int a=0;

        for(int i=0;i<experience.length;i++){
             if(initialExperience <= experience[i]){
                int need=  experience[i] - initialExperience +1;
                a+=need;

                initialExperience+=need;
            }
            initialExperience +=experience[i];
        }
        return a+e;
    }
}