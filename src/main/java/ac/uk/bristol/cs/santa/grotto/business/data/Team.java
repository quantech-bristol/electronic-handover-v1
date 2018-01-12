package ac.uk.bristol.cs.santa.grotto.business.data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;
import java.util.Map;


//probably should actually do roles not teams for hierchal dependence

@Entity
public class Team {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @NotNull
    private Admin admin;

    @ManyToMany
    @NotNull
    private List<Doctor> doctors;

    @NotNull
    private String department;

    //Cant work out how to make it work
//    @OneToMany
//    @NotNull
//    private List<String> riskFields;

    //wont work for some reason
//    @OneToMany
//    @NotNull
//    private List<String> testFields;


    public Team() {
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

//    public List<String> getRiskFields() {
//        return riskFields;
//    }
//
//    public void setRiskFields(List<String> riskFields) {
//        this.riskFields = riskFields;
//    }

//    public List<String> getTestFields() {
//        return testFields;
//    }
//
//    public void setTestFields(List<String> testFields) {
//        this.testFields = testFields;
//    }
}