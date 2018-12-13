package masterung.th.in.androidthai.myangel;

public class UserModel {

    private String uidString, nameString, messageString;

    public UserModel() {
    }   // Constructor Getter Type

    public UserModel(String uidString, String nameString, String messageString) {
        this.uidString = uidString;
        this.nameString = nameString;
        this.messageString = messageString;
    }   // Constructor Setter Type


    public String getUidString() {
        return uidString;
    }

    public void setUidString(String uidString) {
        this.uidString = uidString;
    }

    public String getNameString() {
        return nameString;
    }

    public void setNameString(String nameString) {
        this.nameString = nameString;
    }

    public String getMessageString() {
        return messageString;
    }

    public void setMessageString(String messageString) {
        this.messageString = messageString;
    }
}
