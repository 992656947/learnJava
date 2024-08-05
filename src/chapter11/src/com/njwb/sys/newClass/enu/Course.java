package chapter11.src.com.njwb.sys.newClass.enu;

public enum Course implements Target {
    U1("少儿基础班"){
        @Override
        public void target() {
            System.out.println("会读就可以了。。。");
        }
    },U2("少儿中级班"){
        @Override
        public void target() {
            System.out.println("会写就可以了。。。");
        }
    },U3("少儿高级班"){
        @Override
        public void target() {
            System.out.println("会写会读就可以了。。。");
        }
    };
    private String name;

    private Course(String name) {
        this.name  = name ;
    }

    @Override
    public void target() { }
}


interface Target{
    void target();
}


