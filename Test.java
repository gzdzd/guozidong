package jisuanji;

public class Test extends Calculator{
    public static void main(String[] args) {
        Test a=new Test();
          double  ans=0;
       try
       {
           ans= a.getAnswer("（1 + 2 * （3 - 5）） * （2 - 1）");//输入，得结果
       }catch(Exception e){
           System.out.println("异常产生"+e);
       }
    }

    }


