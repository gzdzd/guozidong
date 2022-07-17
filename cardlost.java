package lost;
  public  class cardlost extends Lost {//对Lost进行继承
     long xuehao;
    long banji;
     public cardlost(String name, String location, long time,long banji, long xuehao) {
         super(name, location, time);
         this.setbanji(banji);
         this.setxuehao(xuehao);
     }//失主，丢失位置，时间，班级，学号输入
    public void  setxuehao(long xuehao){
        this.xuehao= xuehao;
    }
    //学号赋值
    public void  setbanji(long banji){
         this.banji=banji;
    }
    //班级赋值
    public long getxuehao(){//返回学号
         return xuehao;
      }
      public long banji(){//返回班级
         return banji;
      }


    }

