package generator;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * medicalrecord
 * @author 
 */
@Table(name="medicalrecord")
public class Medicalrecord implements Serializable {
    @Id
    @GeneratedValue
    @GeneratedValue(generator = "JDBC")
    private String medicalrecordid;

    private static final long serialVersionUID = 1L;

    public String getMedicalrecordid() {
        return medicalrecordid;
    }

    public void setMedicalrecordid(String medicalrecordid) {
        this.medicalrecordid = medicalrecordid;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Medicalrecord other = (Medicalrecord) that;
        return (this.getMedicalrecordid() == null ? other.getMedicalrecordid() == null : this.getMedicalrecordid().equals(other.getMedicalrecordid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMedicalrecordid() == null) ? 0 : getMedicalrecordid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", medicalrecordid=").append(medicalrecordid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}