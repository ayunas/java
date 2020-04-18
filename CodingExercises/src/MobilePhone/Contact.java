package MobilePhone;

public class Contact {

    String name;
    String number;

    Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    void showContact() {
        System.out.println("name : " + this.name);
        System.out.println("phone # : " + this.number + "\n");
    }



}
