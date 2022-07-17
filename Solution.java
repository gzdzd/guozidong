package solution;

import lost.Lost;
import lost.Booklost;
import lost.cardlost;

public class Solution {

    public static void sortLost(Lost[] lostArray) {
        for (int i = 0; i <= lostArray.length-1; i++) {
            for (int j = i; j <= lostArray.length-1; j++) {
                if (lostArray[j].time <= lostArray[j + 1].time) {
                    Lost temp = lostArray[j];
                    lostArray[j] = lostArray[j + 1];
                    lostArray[j + 1] = temp;
                }
            }
        }
    }
    public static Lost[] selectByKeyword(Lost[] lostArray, String keyword)
    {
        Lost found[] = new Lost[1];
        int j=0;
        for(int i=0;i<=lostArray.length-1;i++)
        {
            if(lostArray[i].location==keyword)
            {
                j++;
                break;
            }
        }
        return found;
    }
}


