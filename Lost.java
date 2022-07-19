package lost;
import com.sun.org.apache.xpath.internal.objects.XObject;
import solution.Solution;

import java.util.Date;

public  class Lost{
    public String name;
    public String location;
    public Date losttime;

    public Lost(String name, String location) {//时间为已经丢失的时间小时
        this.setlocation(location);
        this.setname(name);
    }

    public Lost(String location) {
        this.setlocation(location);
    }
    public Lost(){//无参构造
    }

    public void setname(String name){
        this.name=name;//获得时间，地点，名字
    }
    public void setlocation(String location){
        this.location=location;//获得时间，地点，名字
    }
    public void setlosttime(Date losttime){
        this.losttime=losttime;//获得时间，地点，名字
    }

    public String getname(){//返回名字
        return name;
    }//输出时间，地点，名字
    public String getlocation(){//返回名字
        return location;
    }//输出时间，地点，名字
    public Date getlosttime(){return losttime;}//输出时间，地点，名字
    }








