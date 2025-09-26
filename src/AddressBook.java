import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddies;

    public AddressBook() {
        buddies = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo aBuddy) {
        if (aBuddy != null) {
            buddies.add(aBuddy);
        }
    }

    public void removeBuddy(BuddyInfo buddy) {
        buddies.remove(buddy);
    }

    public void listBuddies() {
        for (BuddyInfo buddy : buddies) {
            System.out.println("Name: " + buddy.getName());
            System.out.println("Address: " + buddy.getAddress());
            System.out.println("Phone Number: " + buddy.getPhoneNumber());
            System.out.println();
        }
    }
    
    //Main method test
    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}
