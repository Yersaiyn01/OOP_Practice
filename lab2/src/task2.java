public class task2 {
    private String name;
    private int studentID;
    private int yearOfStudy;
    
    public task2(String name, int id) {
        this.name = name;
        this.studentID = id;
        this.yearOfStudy = 1;
    }
    
    public String getName() {
        return name;
    }
    
    public int getID() {
        return studentID;
    }
    
    public int getYearOfStudy() {
        return yearOfStudy;
    }
    
    public void incrementYear() {
        yearOfStudy++;
    }
    
    public static void main(String[] args) {
        task2 s1 = new task2("Yersaiyn", 1234);
        task2 s2 = new task2("Maralbekuly", 5432);
        
        System.out.println("Student 1: " + s1.getName() + ", ID: " + s1.getID() + ", Course: " + s1.getYearOfStudy() );
        System.out.println("Student 2: " + s2.getName() + ", ID: " + s2.getID());
        s1.incrementYear();
        System.out.println("After 1 year: " + " ,Course: "+s1.getYearOfStudy() + ", Student 1: " + s1.getName() + ", ID: " + s1.getID());

    }
}