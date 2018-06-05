
public class Main {
    
    public static void main(String[] args) {
        
        Person p1 = new Person();
        
        p1.showData();
        
        p1.setName("Milan");
        p1.setSurname("Zelenovic");
        p1.setJmbg("1234123412345");
        
        p1.showData();
        
        Person p2 = new Person("Petar", "Petrovic", "3123213213211", 23, "male");
        p2.showData();
        
        Student studentJovan = new Student("Jovan", "Jovanovic", "1234123412345", 28, "male");
        studentJovan.setCurrentYear(4);
        studentJovan.setIndexNumber("321/10");
        
        studentJovan.showData();
        
        Student studentMarija = new Student("Marija", "Marijanovic", "1234012340123", 30, "female", "321/12", 3);
        studentMarija.showData();
        
        Teacher teacherJohn = new Teacher("John", "Wayne", "1233211233213", 40, "male", "Astrology", 10);
        teacherJohn.showData();
        
    }
    
}
