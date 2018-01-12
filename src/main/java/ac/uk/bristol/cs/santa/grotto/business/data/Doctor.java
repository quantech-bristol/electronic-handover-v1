package ac.uk.bristol.cs.santa.grotto.business.data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Entity
public class Doctor {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String title;

    @NotNull
    private String firstNames;

    @NotNull
    private String lastName;

    @NotNull
    private String email;

    @OneToMany
    @NotNull
    private List<Team> teams;

    //HAD to change this as cant work out if its one to many etc and it wont compile
    @OneToMany
    @NotNull
    private List<Patient> patients;

    @NotNull
    private Date lastRenewed;

    @OneToMany
    @NotNull
    private List<Handover> pendingHandovers;


    public Doctor() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstNames() {
        return firstNames;
    }

    public void setFirstNames(String firstNames) {
        this.firstNames = firstNames;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    public Date getLastRenewed() {
        return lastRenewed;
    }

    public void setLastRenewed(Date lastRenewed) {
        this.lastRenewed = lastRenewed;
    }

    public List<Handover> getPendingHandovers() {
        return pendingHandovers;
    }

    public void setPendingHandovers(List<Handover> pendingHandovers) {
        this.pendingHandovers = pendingHandovers;
    }
}