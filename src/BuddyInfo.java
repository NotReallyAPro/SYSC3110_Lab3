public class BuddyInfo {
    private String name;
    private String address;
    private String phoneNumber;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public BuddyInfo() {
        this("Homer", "742 Evergreen Terrace", "(939) 555-0113");
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo();

        System.out.println("Hello " + buddy.getName());
    }
}
