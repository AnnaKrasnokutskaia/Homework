package homework5.hospital;

public class Therapist extends Doctor {
    @Override
    void cure() {
        super.cure();
    }

    void chooseDoctor (Patient patient, Surgeon surgeon, Dentist dentist){
        if (patient.treatmentPlan == 1) {
            patient.doctor = surgeon;
        } else if (patient.treatmentPlan == 2){
            patient.doctor = dentist;
        } else {
            patient.doctor = this;
        }
    }
}
