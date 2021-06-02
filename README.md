# Spring Framework intro

- Implement UserService and UserDao
  
    ```java
      public interface UserService {
          void add(User user);
      
          List<User> listUsers();
      }
    ```
- Create a Main class. Configure ApplicationContext

- In the Main class show how you are saving User into DB and reading him back

- Configure DataSource

- Understand the main concepts of Spring framework:
    - ApplicationContext
    - Bean
    - Bean Autowiring
    - Difference between @Bean and @Autowired and @Qualifier
    - What means each annotation used in videos?

__You can check yourself using this__ [checklist](https://mate-academy.github.io/jv-program-common-mistakes/java-spring/intro/java-spring-intro)
