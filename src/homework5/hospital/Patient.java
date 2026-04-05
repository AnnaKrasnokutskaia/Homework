package homework5.hospital;

public class Patient {
    int treatmentPlan;
    Doctor doctor;

    public Patient(int treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    void getHelp(){
        System.out.println("Пациент c планом лечения " + this.treatmentPlan + " идёт к врачу, а тот...");
        doctor.cure();
    }
}
