package ac.uk.bristol.cs.santa.grotto.business.data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by csxds on 26/11/2017.
 */
@Entity
public class Grotto {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String address;

    @OneToMany(mappedBy = "grotto", cascade = CascadeType.ALL)
    private List<Event> events = new ArrayList<>();


    public Grotto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public boolean addEvent(Event event) {
        event.setGrotto(this);
        return this.events.add(event);
    }

    public boolean removeEvent(Object o) {
        return events.remove(o);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Event> getEvents() {
        return events;
    }

}
