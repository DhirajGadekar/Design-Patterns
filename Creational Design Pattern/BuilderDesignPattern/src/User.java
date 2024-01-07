class User {

    private final int userId;
    private final String username;
    private final String emailId;
    private User(UserBuilder buider) {

        this.userId = buider.userId;
        this.username = buider.username;
        this.emailId = buider.emailId;
    }
    public int getUserId() {
        return userId;
    }
    public String getUsername() {
        return username;
    }
    public String getEmailId() {
        return emailId;
    }
    
    @Override
    public String toString() {
     
        return this.userId + " : " + this.username + " : " +  this.emailId;
    }

    static class UserBuilder {

        private int userId;
        private String username;
        private String emailId;

        private UserBuilder() {

        }

        public static UserBuilder builder() {

            return new UserBuilder();
        }
        public UserBuilder setUserId(int userId) {
            this.userId = userId;
            return this;
        }

        public UserBuilder setUsername(String username) {
            this.username = username;
            return this;
        }

        public UserBuilder setEmailId(String emailId) {
            this.emailId = emailId;
            return this;
        }
        
        public User build() {

            User user = new User(this);
            return user;
        }
    }
}