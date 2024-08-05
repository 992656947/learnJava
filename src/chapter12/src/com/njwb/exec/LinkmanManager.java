package chapter12.src.com.njwb.exec;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkmanManager {

    private Scanner input=  new Scanner(System.in);
    private LinkedList<Linkman> linkmans = new LinkedList<>();


    public void showMenu(){
        linkmans.add(new Linkman("张三","15189838151"));
        linkmans.add(new Linkman("李四","17327875127"));
        linkmans.add(new Linkman("王五","13913318756"));
        linkmans.add(new Linkman("赵六","13403216754"));


        do{
            System.out.println("1.添加");
            System.out.println("2.修改");
            System.out.println("3.删除");
            System.out.println("4.查看");
            System.out.println("请选择：");
            System.out.println("--------------------------");
            int choice = input.nextInt();

            if(choice==1) {
                System.out.println("请输入名字：");
                String name = input.next();
                System.out.println("请请输入电话：");
                String phone = input.next();
                Linkman newLinkMan = new Linkman(name,phone);
                if(linkmans.contains(newLinkMan)) {
                    System.out.println("已经存在了");
                }else{
                    linkmans.add(new Linkman(name,phone));
                    System.out.println("添加成功！！！");
                }

            }else if(choice==2) {
                System.out.println("请输入要修改的联系人的名字：");
                String name =input.next() ;
                Linkman updateLinkman = null ;
                for(Linkman linkman :linkmans) {
                    if(linkman.getName().equals(name)) {
                        updateLinkman = linkman ;
                        break;
                    }
                }
                if(updateLinkman==null) {
                    System.out.println("集合中不存在指定的联系人");
                }else{
                    System.out.println("请输入新的电话");
                    updateLinkman.setPhoneNumber(input.next());
                    System.out.println("修改成功！！");
                }


            }else if(choice==3) {

            }else if(choice==4) {
                for(Linkman linkman :linkmans) {
                    System.out.println(linkman.toString());
                }
            }
        }while(true) ;
    }

    public static void main(String[] args) {
        LinkmanManager linkmanManager = new LinkmanManager();
        linkmanManager.showMenu();
    }


}
