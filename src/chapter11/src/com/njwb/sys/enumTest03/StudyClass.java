package chapter11.src.com.njwb.sys.enumTest03;

public enum  StudyClass implements Target {
    ENG_BASE("少儿英语基础班"){
        @Override
        public void meaning() {
            System.out.println("基础学习");
        }
    },ENG_MIDDLE("少儿英语中级班"){
        @Override
        public void meaning() {
            System.out.println("中级学习");
        }
    },ENG_RAISE("少儿英语提高班"){
        @Override
        public void meaning() {
            System.out.println("提高学习");
        }
    };
    private String className;

    private StudyClass(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }
}
