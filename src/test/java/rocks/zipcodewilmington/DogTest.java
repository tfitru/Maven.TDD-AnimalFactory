package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`

    @Test
    public void defaultConstructorTest() {
        // Given

        String expectedName = "Mike";
        Date expectedDate = new Date();
        Integer expectedId = 213;


        // When
        Dog dog = new Dog(null,null,expectedId);
        dog.setName(expectedName);
        dog.setBirthDate(expectedDate);

        // Then
        String actualName = dog.getName();
        Date actualDate = dog.getBirthDate();
        Integer actualId = dog.getId();
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedDate, actualDate);
        Assert.assertEquals(expectedId, actualId);
    }

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        String givenName = "Milo";


        // When (a dog's name is set to the given name)
        Dog dog = new Dog(givenName, null, null);



        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();

        Assert.assertEquals(dogName, givenName);


    }
    // TODO - Create tests for `speak`

    @Test
    public void speakTest() {
        // Given
        Dog dog = new Dog (null, null, null);
        String expectedSpeak = "bark!";

        // Then
        String actualSpeak = dog.speak();
        Assert.assertEquals(expectedSpeak, actualSpeak);

    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`

    @Test
    public void setBirthDatTest() {
        // Given
        Dog dog = new Dog(null, null, null);
        Date expectedBirthDate = new Date(2002, 4, 20);


        // When
        dog.setBirthDate(expectedBirthDate);


        // Then

        Date actualDate = dog.getBirthDate();
        Assert.assertEquals(expectedBirthDate, actualDate);

    }
    // TODO - Create tests for `void eat(Food food)`

    @Test
    public void eatTest() {
        // Given
        Dog dog = new Dog(null, null, null);
        Food foodExpected = new Food();



        // When
        dog.eat(foodExpected);
        Integer expectedMealsEaten = 1;


        // Then
        Integer actualNumberOfMealsEaten = dog.getNumberOfMealsEaten();
        Assert.assertEquals(expectedMealsEaten, actualNumberOfMealsEaten);

    }


    // TODO - Create tests for `Integer getId()`
    @Test
    public void integerGetId() {
        // Given
        Integer expectedId = 335;

        // When
        Dog dog = new Dog(null, null, expectedId);

        // Then
        Integer actualId = dog.getId();
        Assert.assertEquals(expectedId, actualId);


    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`

    @Test
    public void inheritanceAnimalTest() {
        Dog dog = new Dog(null,null,null);
        Assert.assertTrue(dog instanceof Animal);
    }


    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void inheritanceMammalTest() {
        Dog dog = new Dog(null, null, null);
        Assert.assertTrue(dog instanceof Mammal);
    }

}
