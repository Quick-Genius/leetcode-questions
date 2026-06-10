class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        
        int max=0;

        for(int i=0;i<order.length;i++){
            if(order[i]>max){
                max=order[i];
            }
        }

        int f[]= new int[max+1];

        for(int i=0;i<order.length;i++){
            f[order[i]]++;
        }

        for(int i=0;i<friends.length;i++){
            f[friends[i]]++;
        }

        int m=0;
        for(int i=0;i<order.length;i++){
            if(f[order[i]]==2){
                friends[m]=order[i];
                m++;
            }
        }
        return friends;
    }
}