# Healthcare Management System

The Healthcare Management System is a Python program designed to assist healthcare professionals in managing patient information and medical records. It allows doctors to diagnose patients and maintain their medical history.

## Features

- **Patient Management:** Create and manage patient records with details such as name, age, gender, and medical history.
- **Diagnosis:** Doctors can diagnose patients and add diagnosis details to their medical history.
- **Medical History Display:** View the medical history of patients, including diagnosis and other medical records.

## How to Use

1. Create instances of the `Patient` class to represent individual patients.
2. Create instances of the `Doctor` class to represent healthcare professionals.
3. Use the `add_medical_record` method of the `Patient` class to add medical records to a patient's history.
4. Use the `diagnose_patient` method of the `Doctor` class to diagnose a patient and add the diagnosis to their medical history.
5. Use the `display_medical_history` method of the `Patient` class to view a patient's medical history.

## Example

```python
# Create patient
patient1 = Patient("John Doe", 35, "Male")

# Create doctor
doctor1 = Doctor("Dr. Smith", "Cardiologist")

# Doctor diagnoses patient
doctor1.diagnose_patient(patient1, "Hypertension")

# Display patient's medical history
patient1.display_medical_history()

```

## Contributing

Contributions to improve the Healthcare Management System project are welcome! Fork the repository, make your changes, and submit a pull request.

## Credits

This project was created by Jeel patel.
