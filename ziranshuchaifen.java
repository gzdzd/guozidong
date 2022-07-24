package ziranshudechaifen;

import java.util.Scanner;

public class ziranshuchaifen {
    int n;
    int[] array = new int[10];

    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        result(0, 0, 0);
    }
    public void result(int a,int k,int m ){
       if(a==n) {
           for(int i=1;i<k;i++)
           System.out.println(array[i]+'+');
           System.out.println(array[k]);
       }
           for(int i=1;i<n;i++)
           {
               a=a+i;
               if(a<=n&&i>=m)
             array[k+1]=i;
             k++;
             result(a,k,i);
             k--;
           }
    }



}