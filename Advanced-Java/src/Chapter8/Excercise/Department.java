package Chapter8.Excercise;

public class Department {
    private String departmentName;
    private String departmentId;
    private int maxEmployees;

    public Department(String departmentName, String departmentId, int maxEmployees) throws DepartmentException
    {
        if (departmentName == null || departmentName.length() != 2)
        {
            throw new DepartmentException(departmentName, departmentId, maxEmployees, "Department name must consist of exactly two letters.");
        }

        if ((departmentId.length() != 3 && (Integer.valueOf(departmentId) < 100 || Integer.valueOf(departmentId) > 499)))
        {
            throw new DepartmentException(departmentName, departmentId, maxEmployees, "Department ID must be a three-digit number between 100 and 499 inclusive.");
        }

        if (maxEmployees < 4 || maxEmployees > 10)
        {
            throw new DepartmentException(departmentName, departmentId, maxEmployees, "Number of employees must be between 4 and 10 inclusive.");
        }

        this.departmentName = departmentName;
        this.departmentId = departmentId;
        this.maxEmployees = maxEmployees;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public int getMaxEmployees() {
        return maxEmployees;
    }

    public void setMaxEmployees(int maxEmployees) {
        this.maxEmployees = maxEmployees;
    }

    @Override
    public String toString()
    {
        return "Department{" +
                " Organisation Department='" + departmentName + "'" +
                ", Department ID = '" + departmentId + "'" +
                ", Number of Employees = " + maxEmployees +
                " }";
    }
}

