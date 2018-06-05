
public class Teacher extends Person {
    
    private String mainSubject;
    private int yearsOfExperience;
    
    public String getMainSubject() {
        return mainSubject;
    }
    
    public void setMainSubject(String mainSubject) {
        this.mainSubject = mainSubject;
    }
    
    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
    
    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
    
    public Teacher(String name, String surname, String jmbg, int age, String gender) {
        super(name, surname, jmbg, age, gender);
    }
    
    public Teacher(String name, String surname, String jmbg, int age, String gender, String mainSubject, int yearsOfExperience) {
        super(name, surname, jmbg, age, gender);
        this.mainSubject = mainSubject;
        this.yearsOfExperience = yearsOfExperience;
    }
    
    @Override
    public void showData() {
        System.out.println("Main subject: " + getMainSubject());
        System.out.println("Years of experience: " + getYearsOfExperience());
        super.showData();
    }
    
}
