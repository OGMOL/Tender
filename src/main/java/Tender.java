import java.math.BigDecimal;
import java.util.Map;

public class Tender {

    private Map<Professions, Integer> necessaryProfessions;
    private BigDecimal maxTotalSalary;

    public Tender() {};

    public Tender(Map<Professions, Integer> necessaryProfessions, BigDecimal maxTotalSalary) {
        this.necessaryProfessions = necessaryProfessions;
        this.maxTotalSalary = maxTotalSalary;
    }

    public Map<Professions, Integer> getNecessaryProfessions() {
        return necessaryProfessions;
    }

    public void setNecessaryProfessions(Map<Professions, Integer> necessaryProfessions) {
        this.necessaryProfessions = necessaryProfessions;
    }

    public BigDecimal getMaxTotalSalary() {
        return maxTotalSalary;
    }

    public void setMaxTotalSalary(BigDecimal maxTotalSalary) {
        this.maxTotalSalary = maxTotalSalary;
    }
}
