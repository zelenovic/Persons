
public class Person {
    
   private String name;
   private String surname;
   private String jmbg;
   private int age;
   private String gender;
   
   public String getName() {
       return name;
   }
   
   public void setName(String name) {
       this.name = name;
   }
   
   public String getSurname() {
       return surname;
   }
   
   public void setSurname(String surname) {
       this.surname = surname;
   }
   
   public String getJmbg() {
       return jmbg;
   }
   
   public void setJmbg(String jmbg) {
       this.jmbg = jmbg;
   }
   
   public int getAge() {
       return  age;
   }
   
   public void setAge(int age) {
       this.age = age;
   }
   
   public String getGender() {
       return gender;
   }
   
   public void setGender(String gender) {
       this.gender = gender;
   }
   
   public Person() {
       this.name = "defaultName";
       this.surname = "defaultSurname";
       this.jmbg = "defaultJmbg";
       this.age = 0;
       this.gender = "defaultGender";
   }
   
   public Person(String name, String surname, String jmbg, int age, String gender) {
       this.name = name;
       this.surname = surname;
       this.jmbg = jmbg;
       this.age = age;
       this.gender = gender;
   }
   
   public void showData() {
       System.out.println("Name is: " + getName());
       System.out.println("Surname is: " + getSurname());
       System.out.println("Jmbg is: " + getJmbg());
       System.out.println("Age is: " + getAge());
       System.out.println("Gender is: " + getGender());
       System.out.println();
   }
   
}
