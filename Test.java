package solution;

import com.sun.javafx.font.*;
import lost.Lost;
import lost.Cardlost;
import lost.Booklost;
import java.util.Calendar;
public class Test extends Solution {
    static final int a = 4;

    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();
        Lost[] lostArray = new Lost[a];
        Lost[] receive = new Lost[a];
        calendar.set(2022,7,19);
        lostArray[0] = new Cardlost("张三", "菜鸟驿站",  3122101, 2021211155);
        lostArray[0].losttime=calendar.getTime();
        lostArray[1] = new Cardlost("李四", "莘莘食堂",  3122102, 2021211166);
        calendar.set(2022,6,19);
        lostArray[0].losttime=calendar.getTime();
        lostArray[2] = new Booklost("兴业苑2舍门口",  "管理学", 110);
        calendar.set(2022,5,19);
        lostArray[2].losttime=calendar.getTime();
        lostArray[3] = new Booklost("崇文门门口",  "c语言", 50);
        calendar.set(2022,4,19);
        lostArray[3].losttime=calendar.getTime();
        sortLost(lostArray);
        receive=selectByKeyword(lostArray,"莘莘食堂");
//receive数组中存的就是搜索出的结果。

    }

}

