package homework5;

public class Therapist extends Doctor {
    @Override
    public void treat() {
        System.out.println("терапевт выполняет лечение");
    }

    // Метод для назначения врача пациенту согласно плану лечения
    public void assignDoctor(Patient patient) {
        System.out.println("Терапевт назначает");

        // Получаем план лечения пациента
        int plan = patient.getTreatmentPlan();
        Doctor assignedDoctor;

        // Назначение врача пациенту
        if (plan == 1) {
            System.out.println("План лечения: хирургия.");
            assignedDoctor = new Surgeon();
        } else if (plan == 2) {
            System.out.println("План лечения: стоматология.");
            assignedDoctor = new Dentist();
        } else {
            System.out.println("План лечения: общая терапия");
            assignedDoctor = this; // Назначает самого себя (терапевта)
        }

        // Назначаем выбранного врача пациенту
        patient.setDoctor(assignedDoctor);

        // Выполняем лечение
        System.out.print("Лечение: ");
        patient.getDoctor().treat();
    }
}
