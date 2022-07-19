package solution;

import lost.Lost;

public class Solution {

    public static void sortLost(Lost[] lostArray) {
        for (int i = 0; i <= lostArray.length - 1; i++) {
            for (int j = i; j <= lostArray.length - 1; j++) {
                if (lostArray[j].losttime.compareTo(lostArray[j + 1].losttime) < 0) {
                    Lost temp = lostArray[j];
                    lostArray[j] = lostArray[j + 1];
                    lostArray[j + 1] = temp;
                }
            }
        }
    }

    public static Lost[] selectByKeyword(Lost[] lostArray, String keyword) {
        int j = 0;
        Lost[]result=new Lost[100];
        for (int i = 0; i < lostArray.length; i++) {
            if (lostArray[i].location == keyword) {
                result[j]=lostArray[i];
                        j++;
            }
        }
             return result;

    }
}


