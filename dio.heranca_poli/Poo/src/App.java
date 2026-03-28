import domain.Employee;
import domain.Manager;
import domain.Salesman;

public class App {
    public static void main(String[] args) throws Exception {
 
        printEmployee(new Manager());
        printEmployee(new Salesman());


    }

    public static void printEmployee(Employee employee){
        
        //if(employee instanceof Manager){
            //employee.setName("João");
            //((Manager)employee).setLogin("João");
            //((Manager)employee).setPassword("123456");
            

            //System.out.printf("=======%s========\n",employee.getClass().getCanonicalName());
            //System.out.println(((Manager)employee).getName());
            //System.out.println(((Manager)employee).getLogin());
           // System.out.println(((Manager)employee).getPassword());
           
        //}
        switch (employee) {
            case Manager manager -> {
                 manager.setName("João");
                 manager.setCode("123");
                manager.setSalary(5000);

                manager.setLogin("João");
                manager.setPassword("123456");
                manager.setCommission(1200);
            

                System.out.printf("=======%s========\n",employee.getClass().getCanonicalName());
                System.out.println(manager.getCode());
                System.out.println(manager.getName());
                System.out.println(manager.getSalary());
                System.out.println(manager.getLogin());
                System.out.println(manager.getPassword());
                System.out.println(manager.getFullSalary(500));
            }
            case Salesman salesman ->{
                salesman.setName("Lucas");
                salesman.setCode("456");
                salesman.setSalary(2100);
                salesman.setPercentPerSold(10);
                salesman.setSoldAmount(1000);
        

                System.out.printf("=======%s========\n",employee.getClass().getCanonicalName());
                System.out.println(salesman.getCode());
                System.out.println(salesman.getName());
                System.out.println(salesman.getSalary());
                System.out.println(salesman.getPercentPerSold());
                System.out.println(salesman.getSoldAmount());
                
            }
                
                
        }
        System.out.println(employee.getFullSalary());
        System.out.println("===============");
    }
}
