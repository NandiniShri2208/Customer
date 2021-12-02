public class Member {
    String name;
    int age;
    int phoneNumber;
    String address;
    int salary;
    void printSalary(){
        System.out.println(salary);
    }

}
class Employee extends Member{
    int specialization;
    Employee(){
        age=12;
        name="nandu";
        phoneNumber=9878;
        salary=12000;
        address="ram nagar";
    }
}
class Manager extends Member{
    int department;
    Manager(){
        age=10;
        name="khush";
        phoneNumber=975555;
        address="gaura nagar";
    }
}
class TestMember{
    public static void main(String[] args) {
       Employee obj=new Employee();
       obj.printSalary();
    }
}