import java.time.LocalDate;
import java.util.Arrays;

/**
 * @author artem
 * @version 1.0
 * @project ТП Java. ЛР 9
 * @date 02.04.2022 20:14
 * @class Contract
 */
public class Contract {
    private EducationForm formOfEducation;
    private PaymentForm paymentForm;
    private LocalDate dateOfSigningContract;
    private Exemption exemption;
    private Person[] parents;

    public Contract() {
    }

    public Contract(EducationForm formOfEducation, PaymentForm paymentForm, LocalDate dateOfSigningContract, Exemption exemption, Person[] parents) {
        this.formOfEducation = formOfEducation;
        this.paymentForm = paymentForm;
        this.dateOfSigningContract = dateOfSigningContract;
        this.exemption = exemption;
        this.parents = parents;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "formOfEducation=" + formOfEducation +
                ", paymentForm=" + paymentForm +
                ", dateOfSigningContract=" + dateOfSigningContract +
                ", exemption=" + exemption +
                ", parents=" + Arrays.toString(parents) +
                '}';
    }

    public EducationForm getFormOfEducation() {
        return formOfEducation;
    }

    public void setFormOfEducation(EducationForm formOfEducation) {
        this.formOfEducation = formOfEducation;
    }

    public PaymentForm getPaymentForm() {
        return paymentForm;
    }

    public void setPaymentForm(PaymentForm paymentForm) {
        this.paymentForm = paymentForm;
    }

    public LocalDate getDateOfSigningContract() {
        return dateOfSigningContract;
    }

    public void setDateOfSigningContract(LocalDate dateOfSigningContract) {
        this.dateOfSigningContract = dateOfSigningContract;
    }

    public Exemption getExemption() {
        return exemption;
    }

    public void setExemption(Exemption exemption) {
        this.exemption = exemption;
    }

    public Person[] getParents() {
        return parents;
    }

    public void setParents(Person[] parents) {
        this.parents = parents;
    }
}
