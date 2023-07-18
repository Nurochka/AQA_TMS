package hw6.Clinic;

public enum TreatmentPlan {

    First(1), Second(2), Third(3);

    private int planNumber;

    TreatmentPlan(int planNumber) {
        this.planNumber = planNumber;
    }

}

