package tda.darkarmy.doctorappointment.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String date;
    private Long doctorId;
    private Long patientId;
    private String status;
    private String patientName;
    private String doctorName;

    public Appointment() {
    }

    public Appointment(Long id, String date, Long doctorId, Long patientId, String status) {
        this.id = id;
        this.date = date;
        this.doctorId = doctorId;
        this.patientId = patientId;
        this.status = status;
    }

    public Appointment(Long id, String date, Long doctorId, Long patientId, String status, String patientName, String doctorName) {
        this.id = id;
        this.date = date;
        this.doctorId = doctorId;
        this.patientId = patientId;
        this.status = status;
        this.patientName = patientName;
        this.doctorName = doctorName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", doctorId=" + doctorId +
                ", patientId=" + patientId +
                ", status='" + status + '\'' +
                ", patientName='" + patientName + '\'' +
                ", doctorName='" + doctorName + '\'' +
                '}';
    }
}
