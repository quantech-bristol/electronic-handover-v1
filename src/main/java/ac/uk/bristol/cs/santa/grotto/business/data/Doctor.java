package ac.uk.bristol.cs.santa.grotto.business.data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.Instant;
import java.util.ArrayList;
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
        teams = new ArrayList<Team>();
        patients = new ArrayList<Patient>();
        pendingHandovers = new ArrayList<Handover>();
        lastRenewed = Date.from(Instant.now());
    }

    public Long getId() {
        return id;
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

    public void addPatient(Patient patient) {
        this.patients.add(patient);
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