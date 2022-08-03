import java.math.BigDecimal;
import java.util.*;

public class Brigade {

    public Brigade() {
    }

    public Brigade(ArrayList<Employee> employeeArrayList) {
        this.employeeArrayList = employeeArrayList;
    }

    private ArrayList<Employee> employeeArrayList;
    private BigDecimal totalCoast;
    private HashMap<Professions, Integer> totalSkillsCount;

    public BigDecimal getTotalCoast(ArrayList<Employee> employeeArrayList) {
        BigDecimal salary = new BigDecimal(0);
        for (Employee employee : employeeArrayList) {
            salary = salary.add(employee.getSalary());
        }
        return salary;
    }

    public Map<Professions, Integer> getTotalSkillsCount(ArrayList<Employee> employeeArrayList) {

        List<Professions> listSkills = new ArrayList<>();
        for (Employee employee : employeeArrayList) {
            listSkills.addAll(employee.getSkills());
        }

        Map<Professions, Integer> totalSkillsCount = new HashMap<>();

        for (Professions profession : listSkills) {
            if (totalSkillsCount.containsKey(profession)) {
                totalSkillsCount.put(profession, totalSkillsCount.get(profession) + 1);
            } else {
                totalSkillsCount.put(profession, 1);
            }
        }
        return totalSkillsCount;
    }

    public ArrayList<Employee> getEmployeeArrayList() {
        return employeeArrayList;
    }

    public void setEmployeeArrayList(ArrayList<Employee> employeeArrayList) {
        this.employeeArrayList = employeeArrayList;
    }

    public HashMap<Professions, Integer> getTotalSkillsCount() {
        return totalSkillsCount;
    }

    public void setTotalSkillsCount(HashMap<Professions, Integer> totalSkillsCount) {
        this.totalSkillsCount = totalSkillsCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Brigade brigade = (Brigade) o;
        return Objects.equals(employeeArrayList, brigade.employeeArrayList) && Objects.equals(totalCoast, brigade.totalCoast) && Objects.equals(totalSkillsCount, brigade.totalSkillsCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeArrayList, totalCoast, totalSkillsCount);
    }

    @Override
    public String toString() {
        return "Brigade{" +
                "employeeArrayList=" + employeeArrayList +
                ", totalCoast=" + totalCoast +
                ", totalSkillsCount=" + totalSkillsCount +
                '}';
    }
}
