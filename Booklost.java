package lost;
public  class Booklost extends Lost {//对Lost进行继承
   String shuming;
   long price;
    public Booklost( String location, long time,String shuming, long price) {
        super(location, time);
        this.setshuming(shuming);
        this.setprice(price);
    }
//输入丢失位置，时间，书名，价格
    public void  setshuming(String shuming){
        this.shuming= shuming;
    }
    public void  setprice(long price){
        this.price=price;
    }
    public String getshuming(){//返回学号
        return shuming;
    }
    public long price(){//返回班级
        return price;
    }
    }




