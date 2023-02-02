/*
 Firma chce przechowywać informacje o swoich pracownikach w systemie. Każdy z rekordów definiujący pracownika powinien zawierać poniższe informacje:

            First name
            Last name
            Age (0…100)
            Gender (m or f)
            Personal ID number (e.g. 8306112507)

 Zadeklaruj zmienne potrzebne do zachowania informacji dla jednego pracownika, używając odpowiednich typów danych. Używaj opisowych nazw. Wprowadź i wyświetl przykładowe dane.
  */
package personalData;

public class PersonalData {

    String firstName;
    String lastName;
    int age;
    char gender;
    long personalIdNumber;

    public static void main(String[] args) {

        PersonalData worker1 = new PersonalData();
        worker1.firstName = "Ania";
        worker1.lastName = "Nowak";
        worker1.age = 26;
        worker1.gender = 'f';
        worker1.personalIdNumber = 95847362510l;

        System.out.println("imię:" + worker1.firstName);
        System.out.println("nazwisko:" + worker1.lastName);
        System.out.println("wiek:" + worker1.age);
        System.out.println("płeć:" + worker1.gender);
        System.out.println("pesel:" + worker1.personalIdNumber);

    }






}
