import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

public class Employee {

    private List<Professions> skills;
    private BigDecimal salary;

    public Employee(){};

    public Employee(List<Professions> skills, BigDecimal salary) {
        this.skills = skills;
        this.salary = salary;
    }

    public List<Professions> getSkills() {
        return skills;
    }

    public void setSkills(List<Professions> skills) {
        this.skills = skills;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(skills, employee.skills) && Objects.equals(salary, employee.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(skills, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "skills=" + skills +
                ", salary=" + salary +
                '}';
    }
}
