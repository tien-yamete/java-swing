package Com.Model;

public class ModelUser {
    private int id;
    private String name;
    private String gender;
    private String dateOfBirth;
    private String phone;
    private String address;
    private String username;
    private String password;
    private String email;
    private String position;
    private byte[] image;

    public ModelUser(int id, String name, String gender, String dateOfBirth, String phone, String address, String username, String password, String email, String position, byte[] image) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.address = address;
        this.username = username;
        this.password = password;
        this.email = email;
        this.position = position;
        this.image = image;
    }

    

    public ModelUser(int id, String name, String gender, String dateOfBirth, String phone, String address, String username, String password, String email, String position) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.address = address;
        this.username = username;
        this.password = password;
        this.email = email;
        this.position = position;
    }

    public ModelUser(String name, String gender, String dateOfBirth, String phone, String address, String username, String password, String email, String position) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.address = address;
        this.username = username;
        this.password = password;
        this.email = email;
        this.position = position;
    }

    public ModelUser(String name, String gender, String dateOfBirth, String phone, String address, String username, String password, String email, String position, byte[] image) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.address = address;
        this.username = username;
        this.password = password;
        this.email = email;
        this.position = position;
        this.image = image;
    }


    public ModelUser() {
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
}
