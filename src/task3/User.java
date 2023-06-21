package task3;

public class User {
    private String firstname;
    private Tweet tweet;
    private String lastname;
    private String login;
    private String password;

    public User(String firstname, String lastname, String login, String password, String text) {
        this.firstname = firstname;
        this.tweet = new Tweet(text);
        this.lastname = lastname;
        this.login = login;
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String showTweet() {
        return tweet.getTweetText();
    }
}
