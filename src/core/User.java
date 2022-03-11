package core;

public class User {
    private String name;
    private String email;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    static class address{
         private String country;
         private String city;

         public String getCountry() {
             return country;
         }

         public void setCountry(String country) {
             this.country = country;
         }

         public String getCity() {
             return city;
         }

         public void setCity(String city) {
             this.city = city;
         }

        @Override
        public String toString() {
            return "address{" +
                    "country='" + country + '\'' +
                    ", city='" + city + '\'' +
                    '}';
        }
    }
}
class Main{
    public static void main(String[] args) {
        User user=new User();
        user.setEmail("anassohail.as@gmail.com");
        user.setName("Anas");
        User.address userLocation=new User.address();
        userLocation.setCity("Karachi");
        userLocation.setCountry("Pakistan");
        System.out.println(user.toString());
        System.out.println(userLocation.toString());

    }
}
