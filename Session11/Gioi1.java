package Session11;
import java.util.*;
abstract class Employee{
    public int id;
    public String name;

    public abstract double calculateSalary();
    public void showInfo(){};
    public void input(Scanner sn){
        System.out.println("Nhập id: ");
        id = sn.nextInt();
        sn.nextLine();
        System.out.println("Nhập tên: ");
        name = sn.nextLine();
    }
}
interface BonusEligible{
    double calculateBonus();
}
class FullTimeEmployee extends Employee{
    @Override
    public double calculateSalary(){
        return 8000000;
    }
    double salary = calculateSalary();
    @Override
    public void showInfo(){
        System.out.println("id: "+id+
                " | name: "+name+
                " | salary: "+salary);
    }
}
class PartTimeEmployee extends Employee implements BonusEligible{
    public double workingHour;
    @Override
    public double calculateSalary(){
        return 30000*workingHour;
    }
    @Override
    public double calculateBonus(){
        return 50000;
    }
    double salary = calculateSalary()+calculateBonus();
    @Override
    public void showInfo(){
        System.out.println("id: "+id+
                " | name: "+name+
                " | salary: "+calculateSalary()+
                " | bonus: "+calculateBonus());
    }
}
public class Gioi1 {
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        String chose;
        int n,i=0;
        System.out.println("Nhập số nhân viên: ");
        n = sn.nextInt();
        sn.nextLine();
        Employee[] e = new Employee[n];
        while(i<n){
            System.out.println("Bạn là: FullTimeEmployee or PartTimeEmployee");
            chose = sn.nextLine();
            if(chose.equals("fulltime")){
                FullTimeEmployee fte = new FullTimeEmployee();
                fte.input(sn);
                e[i] = fte;
                i++;
            }else if(chose.equals("partime")){
                PartTimeEmployee pte = new PartTimeEmployee();
                pte.input(sn);
                e[i] = pte;
                i++;
            }else{
                System.out.println("Nhập lại: ");
            }
        }
        for (int j = 0; j < e.length; j++) {
            if(e[j] instanceof FullTimeEmployee){
                ((FullTimeEmployee)e[j]).showInfo();
            }else{
                ((PartTimeEmployee)e[j]).showInfo();
            }
        }

    }
}
