package homework5.hospital;

/* Создать программу для имитации работы клиники. Пусть в клинике будет три
врача: хирург, терапевт и дантист. Каждый врач имеет метод «лечить», но
каждый врач лечит по-своему. Так же предусмотреть класс «Пациент» с полем
«План лечения» и полем «Доктор». Создать объект класса «Пациент» и
добавить пациенту план лечения. У терапевта создать метод, который будет
назначать врача пациенту согласно плану лечения:
Если план лечения имеет код 1 – назначить хирурга и выполнить метод лечить.
Если план лечения имеет код 2 – назначить дантиста и выполнить метод
лечить.
Если план лечения имеет любой другой код – назначить терапевта и
выполнить метод
лечить. */

public class Hospital {
    public static void main(String[] args) {
        Surgeon surgeon = new Surgeon();
        Dentist dentist = new Dentist();
        Therapist therapist = new Therapist();
        Patient patient1 = new Patient(1);
        Patient patient2 = new Patient(2);
        Patient patient3 = new Patient(3);
        therapist.chooseDoctor(patient1, surgeon, dentist);
        therapist.chooseDoctor(patient2, surgeon, dentist);
        therapist.chooseDoctor(patient3, surgeon, dentist);
        patient1.getHelp();
        patient2.getHelp();
        patient3.getHelp();
    }
}
