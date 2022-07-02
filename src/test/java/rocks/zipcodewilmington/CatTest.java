package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 50;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        String givenName = "Zula";


        // When (a dog's name is set to the given name)
        Cat cat = new Cat(givenName, null, null);



        // Then (we expect to get the given name from the dog)
        String dogName = cat.getName();

        Assert.assertEquals(dogName, givenName);


    }
    // TODO - Create tests for `speak`

    @Test
    public void speakTest() {
        // Given
        Cat cat = new Cat (null, null, null);
        String expectedSpeak = "meow!";

        // Then
        String actualSpeak = cat.speak();
        Assert.assertEquals(expectedSpeak, actualSpeak);

    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`

    @Test
    public void setBirthDatTest() {
        // Given
        Date expectedBirthDate = new Date(2002, 4, 20);


        // When
        Cat cat = new Cat(null, expectedBirthDate, null);


        // Then

        Date actualDate = cat.getBirthDate();
        Assert.assertEquals(expectedBirthDate, actualDate);

    }
    // TODO - Create tests for `void eat(Food food)`

    @Test
    public void eatTest() {
        // Given
        Cat cat = new Cat(null, null, null);
        Food foodExpected = new Food();



        // When
        cat.eat(foodExpected);
        Integer expectedMealsEaten = 1;


        // Then
        Integer actualNumberOfMealsEaten = cat.getNumberOfMealsEaten();
        Assert.assertEquals(expectedMealsEaten, actualNumberOfMealsEaten);

    }


    // TODO - Create tests for `Integer getId()`
    @Test
    public void integerGetId() {
        // Given
        Integer expectedId = 335;

        // When
        Cat cat = new Cat(null, null, expectedId);

        // Then
        Integer actualId = cat.getId();
        Assert.assertEquals(expectedId, actualId);


    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`

    @Test
    public void inheritanceAnimalTest() {
        Cat cat = new Cat(null,null,null);
        Assert.assertTrue(cat instanceof Animal);
    }


    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void inheritanceMammalTest() {
        Cat cat = new Cat(null, null, null);
        Assert.assertTrue(cat instanceof Mammal);
    }



}
