package Chapter8.UserExceptions;

/**
 * Throw illegal argument exception if the student name is null or less than 3
 * characters, test 1 and test 2 are less than 0 or over 100
 */
public class Student {
    private String stNumber, stName;
    private int test1, test2, assignment;
    private int examMark;

    public Student(String stNumber, String stName, int test1, int test2, int assignment, int examMark) {
        setStNumber(stNumber);
        setStName(stName);
        setTest1(test1);
        setTest2(test2);
        setAssignment(assignment);
        setExamMark(examMark);
    }

    public int getExamMark() {
        return examMark;
    }

    public void setExamMark(int examMark) {
        this.examMark = examMark;
    }

    public String getStNumber() {
        return stNumber;
    }

    public void setStNumber(String stNumber) {
        this.stNumber = stNumber;
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        if(stName == null || stName.length() <= 3) {
            throw new IllegalArgumentException("The length of the student name cannot be less than 4 characters!");
        }
        this.stName = stName;
    }

    public int getTest1() {
        return test1;
    }

    public void setTest1(int test1) {
        if(test1 > 100 || test1 < 0) {
            throw new IllegalArgumentException("Test 1 Results cannot be less than 0 or grater than 100");
        }
        this.test1 = test1;
    }

    public int getTest2() {
        return test2;
    }

    public void setTest2(int test2) {
        if(test2 > 100 || test2 < 0) {
            throw new IllegalArgumentException("Test 2 Results cannot be less than 0 or grater than 100");
        }
        this.test2 = test2;
    }

    public int getAssignment() {
        return assignment;
    }

    public void setAssignment(int assignment) {
        if(assignment > 100 || assignment < 0) {
            throw new IllegalArgumentException("Assignment Results cannot be less than 0 or grater than 100");
        }
        this.assignment = assignment;
    }

    /**
     * Add the following methods:
     * 1. calcSemesterMark() calculates and returns semester mark as:
     * (33% of test 1) + (34% of test 2) + (33% of assignment)
     *
     * 2. calcFinalMark() receives exam mark as parameter then calculates and returns final mark as:
     * the average of semester and exam mark
     */

    public double calcSemesterMark() throws NoExamEntryException {
        double semesterMark =  (this.test1 * 0.33) + (this.test2 * 0.34) + (this.assignment * 0.33);
        if(semesterMark < 45) {
            throw new NoExamEntryException("Student (" + getStName() + ") does not qualify for an exam" +
                    "\nThe current semester mark is " + semesterMark);
        }
        return semesterMark;
    }

    public double calcFinalMark(int examMark) throws NoExamEntryException {
        return (examMark + calcSemesterMark())/ 2;
    }

    @Override
    public String toString() {
        return ""; /* +  "Student No: " + getStNumber()
                + "\nTest 1 : " + getTest1()
                + "\nTest 2: " + getTest2()
                + "\nAssignment: " + getAssignment()
                + "\nSemester mark: " + calcSemesterMark()
                + "\nExam mark: " + getExamMark()
                + "\nFinal Mark: " + calcFinalMark(examMark);*/
    }
}
//8.2 page 26