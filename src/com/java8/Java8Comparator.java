import java.util.*;public class HelloWorld{
     public static void main(String []args){  
		 System.out.println("Hello World");       
		 List<Employee> list=new ArrayList<>();    
		 list.add(new Employee("puneet",32,"Indrapuram"));    
		 list.add(new Employee("ashish",32,"Indrapuram"));     
		 list.add( new Employee("pawan",26,"Indrapuram"));    
		 list.add( new Employee("amit",28,"noida"));     
		 Collections.sort(list, Comparator.comparing(Employee::getAddress).thenComparing(Employee::getAge).thenComparing(Employee::getName)); 
		 list.forEach(emp -> System.out.println(emp.getName()));     }    }
		 class Employee{        
		 private String name;   
		 private int  age;    
		 private String address;        
		 Employee(String name, int age, String address){ 
		 this.address=address;        
		 this.age=age;        
		 this.name=name;    
		 }    
		 public String getAddress(){
		 return address;   
		 }         
		 public void setAddress(String address){ 
		 this.address=address;   
		 }        
		 public int  getAge(){
		 return age ;    
		 }        
		 public void setAge(int age){
		 this.age=age;   
		 }        
		 public String getName(){       
		 return name;    }         
		 public void setName(String name){ 
		 this.name=name;    
		 }
		 }
