package JavaPackage;
public class Student{
    String name;
    int phy, chem, math;
    Student(String n, int p, int c, int m){
        this.name = n;
        this.phy = p;
        this.chem = c;
        this.math = m;
    }
    public void totalScore(){
        int total = this.phy +this.chem+this.math;
        System.out.println("The Total Marks is: "+total);
    }
    public void percentage(){
        float perc = (this.phy +this.chem+this.math / 300) *( 100);
        System.out.println("Percentage is: "+perc);
    }
    public void details(){
        System.out.println("Name: "+this.name);
        System.out.println("Phy: "+this.phy);
        System.out.println("Chem: "+this.chem);
        System.out.println("Math: "+this.math);
        this.totalScore();
        this.percentage();
    }
    public static void main(String[] args) {
        Student s1 = new Student("Sanjith", 100, 96, 89);
        s1.details();
    }
    
}
