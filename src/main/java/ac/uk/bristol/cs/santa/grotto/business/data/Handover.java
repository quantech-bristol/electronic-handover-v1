package ac.uk.bristol.cs.santa.grotto.business.data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Handover {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @NotNull
    private Patient patient;

    @ManyToOne
    @NotNull
    private Doctor originDoctor;

    @ManyToOne
    @NotNull
    private Doctor recipientDoctor;

    @NotNull
    private String note;

    @NotNull
    private Boolean accepted;

    public Handover() {
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getOriginDoctor() {
        return originDoctor;
    }

    public void setOriginDoctor(Doctor originDoctor) {
        this.originDoctor = originDoctor;
    }

    public Doctor getRecipientDoctor() {
        return recipientDoctor;
    }

    public void setRecipientDoctor(Doctor recipientDoctor) {
        this.recipientDoctor = recipientDoctor;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Boolean getAccepted() {
        return accepted;
    }

    public void setAccepted(Boolean accepted) {
        this.accepted = accepted;
    }
}