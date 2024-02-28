package UserName.SpringBoot.DTO;

public class PersonDTO {

	private String firstName;
    private String middleName;
    private String lastName;


    @Override
    public String toString() {
        return "PersonDTO{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
