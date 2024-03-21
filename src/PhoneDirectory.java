import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneDirectory {
    private Map<String, Set<String>> phoneBook;

    public PhoneDirectory() {
        phoneBook = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        if (phoneBook.containsKey(lastName)) {
            phoneBook.get(lastName).add(phoneNumber);
        } else {
            Set<String> phoneNumbers = new HashSet<>();
            phoneNumbers.add(phoneNumber);
            phoneBook.put(lastName, phoneNumbers);
        }
    }

    public Set<String> get(String lastName) {
        return phoneBook.getOrDefault(lastName, new HashSet<>());
    }

    public static void main(String[] args) {
        PhoneDirectory directory = new PhoneDirectory();

        // Adding entries to the phone directory
        directory.add("Smith", "1234567890");
        directory.add("Johnson", "9876543210");
        directory.add("Smith", "5555555555");

        // Searching for phone numbers by last name
        System.out.println("Phone numbers for Smith: " + directory.get("Smith"));
        System.out.println("Phone numbers for Johnson: " + directory.get("Johnson"));
        System.out.println("Phone numbers for Doe: " + directory.get("Doe"));
    }
}
