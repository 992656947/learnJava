package chapter01.src.com.ne;


import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public  class CustomerServer {
    private int cid;
    private List<Customer> customers;

    public CustomerServer(int cid, List<Customer> customers) {
        this.cid = cid;
        this.customers = customers;
    }

    public void addCustomer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = scanner.nextLine();
        System.out.println("请输入性别：");
        String gender = scanner.nextLine();
        System.out.println("请输入年龄：");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        System.out.println("请输入邮箱：");
        String email = scanner.nextLine();

        this.cid++;
        customers.add(new Customer(this.cid, name, gender, age, email));
        System.out.println("添加成功!");
    }

    public void deleteCustomer() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入编号：");
            int cid = scanner.nextInt();
            Iterator<Customer> iterator = customers.iterator();
            boolean found = false;
            while (iterator.hasNext()) {
                Customer customer = iterator.next();
                if (customer.getCid() == cid) {
                    iterator.remove();
                    found = true;
                    System.out.println("删除成功！");
                    break;
                }
            }
            if (!found) {
                System.out.println("没有该记录！");
                continue;
            }
            break;
        }
    }

    public void changeCustomer() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入编号：");
            int cid = scanner.nextInt();
            Customer updateCustomer = null;
            for (Customer customer : customers) {
                if (customer.getCid() == cid) {
                    updateCustomer = customer;
                    break;
                }
            }
            if (updateCustomer == null) {
                System.out.println("没有该记录！");
                continue;
            }

            scanner.nextLine(); // Consume the newline
            System.out.printf("请输入姓名(%s)：\n", updateCustomer.getName());
            String name = scanner.nextLine();
            System.out.printf("请输入性别(%s)：\n", updateCustomer.getGender());
            String gender = scanner.nextLine();
            System.out.printf("请输入年龄(%d)：\n", updateCustomer.getAge());
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume the newline
            System.out.printf("请输入邮箱(%s)：\n", updateCustomer.getEmail());
            String email = scanner.nextLine();

            updateCustomer.setName(name);
            updateCustomer.setGender(gender);
            updateCustomer.setAge(age);
            updateCustomer.setEmail(email);
            break;
        }
    }

    public void checkCustomer() {
        for (Customer customer : customers) {
            System.out.printf("编号:%d\t姓名:%s\t性别:%s\t年龄:%d\t邮箱:%s\n",
                    customer.getCid(), customer.getName(), customer.getGender(),
                    customer.getAge(), customer.getEmail());
        }
    }
}
