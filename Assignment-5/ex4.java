public class ex4 {
    String name;
    static int paymentPerHour = 200;
    int workingHour;

    ex4(String name , int wH){
        this.workingHour = wH;
        this.name = name;
    }
    int calculateSalary(){
        return this.workingHour * paymentPerHour;
    }
    public static void main(String[] args){
        ex4 c1 = new ex4("yash",8);
        ex4 c2 = new ex4("Meet",5);
        ex4 e1 = new ex4("Vraj",7);
        ex4 e2 = new ex4("Jeet",9);
        System.out.println("------ Contractors ------");
        System.out.println("Name   : "+c1.name+"\nSalary : "+c1.calculateSalary());
        System.out.println("Name   : "+c2.name+"\nSalary : "+c2.calculateSalary());
        System.out.println("\n------ Employees ------");
        System.out.println("Name   : "+e1.name+"\nSalary : "+e1.calculateSalary());
        System.out.println("Name   : "+e2.name+"\nSalary : "+e2.calculateSalary());
    }
}
