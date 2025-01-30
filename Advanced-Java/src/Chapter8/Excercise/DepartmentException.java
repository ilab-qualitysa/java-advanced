package Chapter8.Excercise;

public class DepartmentException extends Exception
{
    public DepartmentException(String departmentName, int departmentId, int maxEmployees, String message)
    {
        super("Error in Department: '" + departmentName + "', Department ID: '" + departmentId + "', Number of Employees Employees: " + maxEmployees + ". " + message);
    }
}
