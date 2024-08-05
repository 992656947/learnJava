package chapter08.chapter08.src.com.njwb.comp;

public class Dvd implements Comparable<Dvd>{

    private String dvdName;

    private int status;

    //0表示未借出，1表示借出
    private int count ;


    private String lendDate="";

    public Dvd() {
    }

    public Dvd(String dvdName, int status, int count, String lendDate) {
        this.dvdName = dvdName;
        this.status = status;
        this.count = count;
        this.lendDate = lendDate;
    }

    public String getDvdName() {
        return dvdName;
    }

    public void setDvdName(String dvdName) {
        this.dvdName = dvdName;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getLendDate() {
        return lendDate;
    }

    public void setLendDate(String lendDate) {
        this.lendDate = lendDate;
    }


    public String dvdInfo(){
        return "dvd的名称："+this.dvdName+",当前状态："+(status==0?"未借出":"已借出")+",借出次数："+this.count+(status==0?"":",借出日期："+lendDate);
    }


    public int compareTo(Dvd o) {
//        if(this.count>o.count) {
//            return -1;
//        }else if(this.count==o.count) {
//            return 0;
//        }else {
//            return 1;
//        }

        return -(this.count-o.count);
    }
}
