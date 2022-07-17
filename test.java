package solution;

import lost.Lost;
import lost.cardlost;
import lost.Booklost;
public class test extends Solution {
    static final int a = 4;

    public static void main(String[] args) {
        Lost[] lostArray = new Lost[a];
        Lost[] receive = new Lost[a];
        lostArray[0] = new cardlost("张三", "菜鸟驿站", 9, 03122101, 2021211155);//time:9代表已丢失9小时,以此类推
        lostArray[1] = new cardlost("李四", "莘莘食堂", 10, 03122102, 2021211166);
        lostArray[2] = new Booklost("兴业苑2舍门口", 9, "管理学", 110);
        lostArray[3] = new Booklost("崇文门门口", 12, "c语言", 50);
        sortLost(lostArray);
        receive=selectByKeyword(lostArray,"莘莘食堂");
//receive数组中存的就是搜索出的结果。

    }

}

