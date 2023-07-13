 class Main {
    public static void main(String[] args) {
        
        Student student1 = new Student(1, "Jim", 2022, 3.6);
        
        
        student1.showDetail();
        
        
        student1.updateName("Pet");
        
        
        student1.showDetail();
        
        
        student1.updateAdmissionYear(2023);
        
        
        student1.updateGPA(3.5);
        
        
        student1.showDetail();
    }
}


public class Student {
    private int ID;
    private String name;
    private int admissionYear;
    private double GPA;
    
    public Student(int ID, String name, int admissionYear, double GPA) {
        this.ID = ID;
        this.name = name;
        this.admissionYear = admissionYear;
        this.GPA = GPA;
    }
    
    public void showDetail() {
        System.out.println("Student ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Admission Year: " + admissionYear);
        System.out.println("GPA: " + GPA);
    }
    
    public void updateName(String newName) {
        name = newName;
    }
    
    public void updateAdmissionYear(int newAdmissionYear) {
        admissionYear = newAdmissionYear;
    }
    
    public void updateGPA(double newGPA) {
        GPA = newGPA;
    }
}
