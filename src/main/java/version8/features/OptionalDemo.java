package version8.features;

import java.util.Optional;

/**
 * @author ilariacorda on 14/08/2017.
 * @project Java-Code-Experiments
 */

public class OptionalDemo
{
    public static void main (String[] args)
    {
        Profile profile1 = new Profile("Trevor", "Page");

        outputProfile(profile1);

        Profile profile2 = new Profile("Jane", "Doe");
        profile2.setMiddleName(Optional.of("Lane"));
        outputProfile(profile2);

        Profile profile3 = new Profile("John", "Doe");
        profile3.setMiddleName(Optional.of("D."));
        profile3.setHobbies(Optional.of("Music, Golf"));
        outputProfile(profile3);
    }

    private static void outputProfile(Profile profile)
    {
        System.out.println("First Name: " + profile.getFirstName().trim());
        profile.getMiddleName().ifPresent(middleName -> System.out.println("Middle Name: " + middleName));
        System.out.println("Last Name: " + profile.getLastName().trim());
        profile.getFullName().ifPresent(fullName -> System.out.println("Full name: " + fullName));
        System.out.println("Hobbies: " + profile.getHobbies().orElse("no hobbies listed"));
        System.out.println();

    }
}
