class Patient:
    def __init__(self, name, age, gender, medical_history=None):
        self.name = name
        self.age = age
        self.gender = gender
        self.medical_history = medical_history or []

    def add_medical_record(self, record):
        self.medical_history.append(record)

    def display_medical_history(self):
        print(f"Medical History for Patient {self.name}:")
        for record in self.medical_history:
            print(record)


class Doctor:
    def __init__(self, name, specialization):
        self.name = name
        self.specialization = specialization

    def diagnose_patient(self, patient, diagnosis):
        patient.add_medical_record(f"Diagnosis by Dr. {self.name}: {diagnosis}")


def main():
    # Create patient
    patient1 = Patient("John Doe", 35, "Male")

    # Create doctor
    doctor1 = Doctor("Dr. Smith", "Cardiologist")

    # Doctor diagnoses patient
    doctor1.diagnose_patient(patient1, "Hypertension")

    # Display patient's medical history
    patient1.display_medical_history()


if __name__ == "__main__":
    main()
