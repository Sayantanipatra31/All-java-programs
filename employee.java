class Emp{
    int salary;
    String name;
    public Emp()
    {
        System.out.println("hello");
    }
    public int getsalary()
    {
        return salary;
    }
    public String getname()
    {
        return name;
    }
    public void setname(String n)
    {
       name=n;
    }
    public void setsalary(int s)
    {
        salary=s;
    }
}

public class employee {
    public static void main(String[] args) {
        Emp harry= new Emp();
        harry.setname("sayantani");
        System.out.println(harry.getname());
        harry.setsalary(4000);
        System.out.println(harry.getsalary());
    }
    
}
