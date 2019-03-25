package thread;

public class ThreadClass extends Thread{

    public String name="";
    public String lastName="";

    public ThreadClass(String name,String lastName){
        this.name=name;
        this.lastName=lastName;
    }

    @Override
    public void run() {
        System.out.println("Name: "+name+" LastName: "+lastName);
    }
}
