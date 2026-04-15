class Student {
    private String name;
    private int rollNo;
    private String[] subjects = new String[5];
    public Student(String name, int rollNo, String[] subjects) {
        this.name = name;
        this.rollNo = rollNo;
        this.subjects = subjects;
    }
    public String getName() 
    { 
        return name; 
    }
    public int getRollNo() 
    { 
        return rollNo; 
    }
    public String[] getSubjects() 
    { 
        return subjects; 
    }
}
class TabulationSheet {
    private String subjectName;
    private int rollNos[] = new int[3];
    private int marks[] = new int[3];
    private int index = 0;
    
    public TabulationSheet(String subjectName) {
        this.subjectName = subjectName;
    }
    public void addEntry(int rollNo, int mark) {
        rollNos[index] = rollNo;
        marks[index] = mark;
        index++;
    }
    public int getMarks(int rollNo) {
        for (int i = 0; i < index; i++) {
            if (rollNos[i] == rollNo)
                return marks[i];
        }
        return 0;
    }
}
    
class MarkSheet {
    private String studentName;
    private int rollNo;
    private int[] marks = new int[5];
    public MarkSheet(String studentName, int rollNo) {
        this.studentName = studentName;
        this.rollNo = rollNo;
    }
    public void addMarks(int index, int mark) {
        marks[index] = mark;
    }
    public void printMarkSheet(String[] subjects) {
        System.out.println("\nMark Sheet");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + rollNo);
        for (int i = 0; i < 5; i++) {
            System.out.println(subjects[i] + ": " + marks[i]);
        }
    }
}

class p12{
    public static void main(String[] args) {
        String subjects[]= {"Math", "Physics", "Chemistry", "Biology", "English"};
        Student s1 = new Student("Amit", 1, subjects);
        Student s2 = new Student("Ravi", 2, subjects);
        Student s3 = new Student("Neha", 3, subjects);
        TabulationSheet[] tabs = new TabulationSheet[5];
        for (int i = 0; i < 5; i++)
        tabs[i] = new TabulationSheet(subjects[i]);
        tabs[0].addEntry(1, 80); tabs[0].addEntry(2, 75); tabs[0].addEntry(3, 90);
        tabs[1].addEntry(1, 70); tabs[1].addEntry(2, 85); tabs[1].addEntry(3, 88);
        tabs[2].addEntry(1, 78); tabs[2].addEntry(2, 72); tabs[2].addEntry(3, 81);
        tabs[3].addEntry(1, 88); tabs[3].addEntry(2, 79); tabs[3].addEntry(3, 85);
        tabs[4].addEntry(1, 90); tabs[4].addEntry(2, 82); tabs[4].addEntry(3, 87);
        Student[] students = {s1, s2, s3};
        for (Student s : students) {
            MarkSheet ms = new MarkSheet(s.getName(), s.getRollNo());
            for (int i = 0; i < 5; i++) {
                ms.addMarks(i, tabs[i].getMarks(s.getRollNo()));
            }
            ms.printMarkSheet(subjects);
        }
    }
}
    