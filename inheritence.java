class Base{
    public int x;
    public int getx()
    {
        System.out.println("i am in base");
        return x;
    }
    public void setx(int a)
    {
        x=a;
    }
}
class derived extends Base{
    public int y;
    public int getY() {
        System.out.println("i am in derived");
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}

public class inheritence {
    public static void main(String[] args) {
        derived d = new derived();
        d.setx(67);
        System.out.println(d.getx());
        

    }
}
