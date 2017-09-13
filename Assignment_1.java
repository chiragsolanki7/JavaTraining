/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_1;
import java.util.Scanner;
/**
 *
 * @author csolanki7
 */
public class Assignment_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner input = new Scanner(System.in);
      
      Employee [] employees = new Employee [5];
      Student []   student = new Student[5];
      
       for (int i=0; i <= 5; i++ ){ 
        
    
        System.out.println(" Enter the Student name:"); 
        String name = input.next(); 
        
        System.out.println(" Enter the student number:"); 
        int Phone = input.nextInt(); 
        
        System.out.println(" Enter the Email address of Student:"); 
        String Email = input.next();
        
        System.out.println(" Enter the employee status:"); 
        String status = input.next();
         
       
       student[i].setName(name);
       student[i].setPhonenumber(Phone);
       student[i].setEmail(Email);
       student[i].setClassstatus(status);
        i++;
      }
       
        
        System.out.printf("%20s%20s%20s%20s\n" , "Name" , "Phone" , " Email" , "Status" );

        for (int j=0; j <=5 ;j++){  
            
        System.out.printf("%20s%20s%20s%20s\n" ,student[j].getName(),student[j].getPhonenumber(),student[j].getEmail(),student[j].getClassstatus());
                     
        }
        
       
     
      for (int i=0; i <= 5; i++ ){ 
        
    
        System.out.println(" Enter the Employee name:"); 
        String name = input.next(); 
        
        System.out.println(" Enter the Employee number:"); 
        int Phone = input.nextInt(); 
        
        System.out.println(" Enter the Email address of Employee:"); 
        String Email = input.next();
        
        System.out.println(" Enter the employee salary:"); 
        int salary = input.nextInt();
         
       
        employees[i].setName(name);
        employees[i].setPhonenumber(Phone);
        employees[i].setEmail(Email);
        employees[i].setSalary(salary);
        i++;
        
       
           
      }
       
        
        System.out.printf("%20s%20s%20s%20s\n" , "Name" , "Phone" , " Email" , "Salary" );

        for (int j=0; j <=5 ;j++){  
            
        System.out.printf("%20s%20s%20s%20s\n" ,employees[j].getName(),employees[j].getPhonenumber(),employees[j].getEmail(),employees[j].getSalary());
                     
        }
        
       input.close();
        
   
        
        
    }
    

public class Person {
    private String name;
    private int phonenumber;
    private String email;

      public Person(String name,int ph,String email){
          this.name="";
          this.phonenumber=ph;
          this.email="";
     }
    
    
    
    /**
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String na) {
        this.name = na;
    }

    /**
     * @return the phonenumber
     */
    public int getPhonenumber() {
        return this.phonenumber;
    }

    /**
     * @param phonenumber the phonenumber to set
     */
    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String ema) {
        this.email = ema;
    }
    
    
    
}
public class Student extends Person {
    
    private String classstatus;
    
    public Student(String name, int phonenumber, String email) {
        super(name, phonenumber, email);
        this.classstatus=classstatus;
    }

    /**
     * @return the classstatus
     */
    public String getClassstatus() {
        return this.classstatus;
    }

    /**
     * @param classstatus the classstatus to set
     */
    public void setClassstatus(String classstatus) {
        this.classstatus = classstatus;
    }
    
}

public class Employee extends Person {
    
    private double salary;
    
    public Employee(String name, int phonenumber, String email,double salary) {
        super(name, phonenumber, email);
        this.salary=salary;
    }
    

    /**
     * @return the salary
     */
    public double getSalary() {
        return this.salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }
}

}

