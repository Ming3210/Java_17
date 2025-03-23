package B10;

class Contact {
    private static int nextId = 1;
    private int id;
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.id = nextId++;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Contact && phoneNumber.equals(((Contact) o).phoneNumber);
    }

    @Override
    public int hashCode() {
        return phoneNumber.hashCode();
    }

    @Override
    public String toString() {
        return "Contact{id=" + id + ", name='" + name + "', phoneNumber='" + phoneNumber + "'}";
    }
}