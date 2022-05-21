//


public class Email {

    private final String FIRST_NAME;
    private final String LAST_NAME;
    private final String DOMAIN;
    private final String EXTENSION;

    public Email(String firstName, String lastName, String domain, String extension)
    {
        FIRST_NAME = firstName;
        LAST_NAME = lastName;
        DOMAIN = domain;
        EXTENSION = extension;
    }

    public String generateEmail()
    {
        return FIRST_NAME + "." + LAST_NAME + "@" + DOMAIN + "." + EXTENSION;
    }
}