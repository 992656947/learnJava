package chapter01.src.com.new7_16.pet2;

public class Pet {
    private String name;
    private int health;
    private String petType;
    private String strain;

    public void setName(String name){
        this.name = name;
    }
    public void setStrain(int choice){
        if (choice==1){
            this.strain="企鹅1";
        }else if(choice==2){
            this.strain="企鹅2";
        }else{
            System.out.println("错误的选择！");
        }
    }

    public void setDogStrain(int choice){
        if (choice==1){
            this.strain="拉布拉多";
        }else if(choice==2){
            this.strain="雪纳瑞";
        }else{
            System.out.println("错误的选择！");
        }
    }

    public void setHealth(int choice){
        if(choice<=100&&choice>=0){
            this.health=choice;
        }else{
            this.health =60;
        }
    }

    public void setPetType(int choice){
        if (choice==1){
            this.petType="狗狗";
        }else if(choice==2){
            this.petType="企鹅";
        }else{
            System.out.println("输入错误");
        }
    }

}
