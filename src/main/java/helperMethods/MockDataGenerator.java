package helperMethods;

import com.github.javafaker.Faker;

public class MockDataGenerator {
    Faker faker = new Faker();

    public String generateMockFirstName(){
        return faker.name().firstName();
    }
    public String generateMockLastName(){
        return faker.name().lastName();
    }
    public String generateMockPassword(){
        return faker.internet().password();
    }
}
