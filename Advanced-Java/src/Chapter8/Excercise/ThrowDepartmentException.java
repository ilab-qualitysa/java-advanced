package Chapter8.Excercise;

public class ThrowDepartmentException
{
    public static void main(String[] args)
    {
        Department[] departments = new Department[6];
        Object[][] departmentData = {
                {"IT", "101", 5},
                {"HR", "499", 4},
                {"ABC", "200", 6},
                {"FN", "50", 7},
                {"MK", "150", 3},
                {"RD", "300", 11}
        };

        for (int i = 0; i < departmentData.length; i++)
        {
            try {
                departments[i] = new Department(
                        (String) departmentData[i][0],
                        (String) departmentData[i][1],
                        (int) departmentData[i][2]
                );
                System.out.println("Successfully created: " + departments[i]);
            } catch (DepartmentException e) {
                System.out.println("Failed to create department: " + e.getMessage());
            }
        }
    }
}
