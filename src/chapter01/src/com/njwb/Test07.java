package chapter01.src.com.njwb;

import java.util.Scanner;

public class Test07 {
    public static void main(String args[]){
        boolean is_flag = true;
        Scanner input = new Scanner(System.in);
        double one = 100,two = 200,three = 300,sum = 0;
        double discount=1;

        while (is_flag){
            System.out.println("----------------------------");
            System.out.println("请选择购买商品编号：");
            System.out.println("1.T恤\t2.网球鞋\t3.网球拍\t");
            System.out.println("----------------------------");
            System.out.println();
            System.out.println("请输入商品编号：");
            int goods = input.nextInt();
            System.out.println("请输入购买数量：");
            int nums = input.nextInt();
            if (goods==1){
                System.out.println("T恤："+one+"\t数量"+nums+"\t合计"+nums*one);
            }else if(goods==2){
                System.out.println("网球鞋："+two+"\t数量"+nums+"\t合计"+nums*two);
            }else {
                System.out.println("网球拍："+three+"\t数量"+nums+"\t合计"+nums*three);
            }
            System.out.println("是否继续购买（y/n）");
            String choice = input.next();
            if ("y".equals(choice)){
                if (goods==1){
                    sum = one*nums;
                }else if(goods==2){
                    sum = two*nums;
                }else {
                    sum = three*nums;
                }
            }else if("n".equals(choice)){
                if(sum>=5000){
                    discount = 0.6;
                }else if(sum>=4000){
                    discount = 0.7;
                }else if(sum>=3000){
                    discount = 0.8;
                }
                is_flag = false;
                System.out.println("折扣："+discount);
                System.out.println("应付金额："+sum*discount);
                double money;
                System.out.println("输入你要付款的金额：");
                money = input.nextDouble();
                System.out.println("实付金额："+money);
                double aaa = money-sum*discount;
                System.out.println("找钱："+aaa);
            }else{
                System.out.println("未按规定输入，请重新输入！");
            }

        }
    }
}
