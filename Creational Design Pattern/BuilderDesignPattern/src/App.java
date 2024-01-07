public class App {
    public static void main(String[] args) {
        
        User user1 = User.UserBuilder.builder()
                    .setUserId(101)
                    .setUsername("dhirajgadekar")
                    .setEmailId("dhirajgadekar@gmail.com")
                    .build();
        
        User user2 = User.UserBuilder.builder()
            .setUserId(102)
            .setUsername("dhiraj")
            .build();

        User user3 = User.UserBuilder.builder()
            .setEmailId("gadekar@gmail.com")
            .setUsername("gadekar")
            .setUserId(103)
            .build();

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
    }
}
