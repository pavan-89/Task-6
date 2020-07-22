
public class App extends Thread
{
    public void run()
    {
        //System.out.print("hi");
        creategui11 a=new creategui11();
        a.createguifunction();
    }
    public static void main(String args[])
    {
        App t1=new App();
        t1.start();
    }
}
