package version8.features;

/**
 * @author ilariacorda on 14/08/2017.
 * @project Java-Code-Experiments
 */

import java.util.Optional;

public class Profile
{
    private String firstName;
    private Optional<String> middleName = Optional.empty();
    private String lastName;
    private Optional<String> fullName = Optional.ofNullable(firstName);
    private Optional<String> hobbies = Optional.empty();

    public Profile (String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = Optional.ofNullable(firstName);
    }

    public String getFirstName()
    {
        return firstName;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public Optional<String> getMiddleName()
    {
        return middleName;
    }

    public void setMiddleName(Optional<String> middleName)
    {
        this.middleName = middleName;
    }

    public Optional<String> getHobbies()
    {
        return hobbies;
    }

    public void setHobbies(Optional<String> hobbies)
    {
        this.hobbies = hobbies;
    }

    public Optional<String> getFullName()
    {
        return fullName;
    }

    public void setFullName(Optional<String> fullName)
    {
        this.fullName = fullName;
    }
}