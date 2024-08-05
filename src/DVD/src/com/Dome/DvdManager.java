package DVD.src.com.Dome;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DvdManager {
    List<List<Dvd>> dvds = new ArrayList<>(5);
    Scanner input = new Scanner(System.in);

    public DvdManager() {
        for (int i = 0; i < 5; i++) {
            dvds.add(new ArrayList<>());
        }
    }

    public void init() {
        dvds.get(0).add(new Dvd("11", 0, 10, "2024-1-1"));
        dvds.get(1).add(new Dvd("22", 0, 10, "2024-1-2"));
        dvds.get(2).add(new Dvd("33", 0, 10, "2024-1-3"));
    }

    public void queryAllDvd() {
        System.out.println("dvd的信息如下：");
        for (int i = 0; i < dvds.size(); i++) {
            List<Dvd> dvdList = dvds.get(i);
            for (Dvd dvd : dvdList) {
                System.out.println((i + 1) + "、" + dvd.dvdInfo());
            }
        }
    }

    public void addDvd() {
        System.out.println("请输入待添加的dvd的名称：");
        String inputDvd = input.next();
        boolean flag = findDvdByName(inputDvd);
        if (flag) {
            System.out.println("对不起，你添加的dvd已经存在！");
            return;
        }
        Dvd newDvd = new Dvd(inputDvd, 0, 0, "");
        dvds.get(findFirstNonFullIndex()).add(newDvd);
        System.out.println("dvd添加成功！");
    }

    private int findFirstNonFullIndex() {
        for (int i = 0; i < dvds.size(); i++) {
            if (dvds.get(i).size() < 10) {
                return i;
            }
        }
        dvds.add(new ArrayList<>()); // 创建一个新的列表
        return dvds.size() - 1;
    }

    public boolean findDvdByName(String dvdName) {
        for (List<Dvd> dvdList : dvds) {
            for (Dvd dvd : dvdList) {
                if (dvdName.equals(dvd.getName())) {
                    return true;
                }
            }
        }
        return false;
    }

    public void deleteDvd() {
        System.out.println("请输入待删除的dvd的名称：");
        String inputDvd = input.next();
        for (List<Dvd> dvdList : dvds) {
            for (int i = 0; i < dvdList.size(); i++) {
                if (dvdList.get(i).getName().equals(inputDvd)) {
                    dvdList.remove(i);
                    System.out.println("dvd删除成功！");
                    return;
                }
            }
        }
        System.out.println("对不起，未找到要删除的dvd！");
    }

    public void lendDvd() {
        System.out.println("请输入待借出的dvd的名称：");
        String inputDvd = input.next();
        for (List<Dvd> dvdList : dvds) {
            for (Dvd dvd : dvdList) {
                if (dvd.getName().equals(inputDvd)) {
                    if (dvd.getStatus() == 1) {
                        System.out.println("对不起，该dvd已经被借出！");
                    } else {
                        dvd.setStatus(1);
                        dvd.setCount(dvd.getCount() + 1);
                        System.out.println("请输入借出日期（格式：yyyy-mm-dd）：");
                        String lendDate = input.next();
                        dvd.setLendDate(lendDate);
                        System.out.println("dvd借出成功！");
                    }
                    return;
                }
            }
        }
        System.out.println("对不起，未找到要借出的dvd！");
    }

    public void returnDvd() {
        System.out.println("请输入归还的dvd的名称：");
        String inputDvd = input.next();
        for (List<Dvd> dvdList : dvds) {
            for (Dvd dvd : dvdList) {
                if (dvd.getName().equals(inputDvd)) {
                    if (dvd.getStatus() == 0) {
                        System.out.println("该dvd未被借出，无需归还！");
                    } else {
                        dvd.setStatus(0);
                        dvd.setLendDate("");
                        System.out.println("dvd归还成功！");
                    }
                    return;
                }
            }
        }
        System.out.println("对不起，未找到要归还的dvd！");
    }

    public void rankDvds() {
        List<Dvd> allDvds = new ArrayList<>();
        for (List<Dvd> dvdList : dvds) {
            allDvds.addAll(dvdList);
        }
        allDvds.sort((d1, d2) -> d2.getCount() - d1.getCount());
        System.out.println("dvd借出次数排行如下：");
        for (int i = 0; i < allDvds.size(); i++) {
            System.out.println((i + 1) + "、" + allDvds.get(i).dvdInfo());
        }
    }

    public void showMenu() {
        init();
        int choice;
        do {
            System.out.println("欢迎进入音像管理系统");
            System.out.println("1.添加DVD");
            System.out.println("2.查看所有DVD的信息");
            System.out.println("3.删除某个DVD");
            System.out.println("4.借出DVD");
            System.out.println("5.归还DVD");
            System.out.println("6.排行");
            System.out.println("7.退出");
            System.out.println("请选择：");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    addDvd();
                    break;
                case 2:
                    queryAllDvd();
                    break;
                case 3:
                    deleteDvd();
                    break;
                case 4:
                    lendDvd();
                    break;
                case 5:
                    returnDvd();
                    break;
                case 6:
                    rankDvds();
                    break;
                case 7:
                    System.out.println("退出系统。");
                    return;
                default:
                    System.out.println("无效的选择，请重新选择！");
            }
        } while (true);
    }

    public static void main(String[] args) {
        new DvdManager().showMenu();
    }
}