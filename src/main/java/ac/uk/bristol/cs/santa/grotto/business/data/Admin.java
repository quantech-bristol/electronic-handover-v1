package ac.uk.bristol.cs.santa.grotto.business.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.List;


@Entity
public class Admin {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String Name;

    @OneToMany
    @NotNull
    private List<Team> managedTeams;


    public Admin() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public List<Team> getManagedTeams() {
        return managedTeams;
    }

    public void setManagedTeams(List<Team> managedTeams) {
        this.managedTeams = managedTeams;
    }
}