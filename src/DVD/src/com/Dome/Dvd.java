package DVD.src.com.Dome;

public  class Dvd {
    private String Name;
    private int Status;
    private int Count;
    private String lendDate;

    public Dvd() { }
    public Dvd(String name, int status, int count, String lendDate) {
        Name = name;
        Status = status;
        Count = count;
        this.lendDate = lendDate;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }

    public int getCount() {
        return Count;
    }

    public void setCount(int count) {
        Count = count;
    }

    public String getLendDate() {
        return lendDate;
    }

    public void setLendDate(String lendDate) {
        this.lendDate = lendDate;
    }

//    public abstract void info();
    public String dvdInfo(){
        return "dvd的名称："+Name+",当前状态"+(Status==0?"未借出":"已借出")+",借出次数："+Count+(Status==0?"":",借出日期"+lendDate);
    }

}

