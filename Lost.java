package lost;
import com.sun.org.apache.xpath.internal.objects.XObject;
import solution.Solution;
public  class Lost{
    public String name;
    public String location;
    public long time;

    public Lost(String name, String location, long time) {//时间为已经丢失的时间小时
        this.setlocation(location);
        this.setname(name);
        this.settime(time);
    }

    public Lost(String location, long time) {
    }

    //丢失时间 单位：小时
    public void setname(String name){
        this.name=name;//获得时间，地点，名字
    }
    public void setlocation(String location){
        this.location=location;//获得时间，地点，名字
    }
    public void settime(long time){
        this.time=time;//获得时间，地点，名字
    }

    public String getname(){//返回名字
        return name;
    }//输出时间，地点，名字
    public String getlocation(){//返回名字
        return location;
    }//输出时间，地点，名字
    public long gettime(){return time;}//输出时间，地点，名字

    }








