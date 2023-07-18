package hw6.Clinic;

import hw6.lesson6.enums.DayofWeek;

public class Patient {
    private TreatmentPlan plan;
    private Doctor doctor;

    public Patient() {

    }

    public void setPlan(TreatmentPlan plan) {
        this.plan = plan;
    }

    public void setDoctor() {
        if (this.plan == TreatmentPlan.First) {
            this.doctor = new Surgeon();
            doctor.treat();
        } else if (this.plan == TreatmentPlan.Second){
            this.doctor = new Dantist();
            doctor.treat();
        } else {
            this.doctor = new Therapist();
            doctor.treat();
        }

    }


}
