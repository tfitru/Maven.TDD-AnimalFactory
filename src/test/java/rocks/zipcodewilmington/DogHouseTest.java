package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

import static rocks.zipcodewilmington.animals.animal_storage.DogHouse.getDogById;
import static rocks.zipcodewilmington.animals.animal_storage.DogHouse.getNumberOfDogs;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {

    private DogHouse dogHouse = new DogHouse();


    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);


        // Then
        DogHouse.getNumberOfDogs();
    }

    // TODO - Create tests for `void add(Dog dog)`


    @Test
    public void addTest() {
        // Given
        Dog dog = new Dog("Neptune",new Date(),22);
        String expectedName = "Neptune";


        // When
        dogHouse.add(dog);
        Dog actual = getDogById(22);


        // Then
        Assert.assertEquals(expectedName, actual.getName()); // call get name b/c we want to check if the dog was added by the id
//      Get the number of Dogs, if true should give me 1



    }
    // TODO - Create tests for `void remove(Integer id)`

    @Test
    public void removeDogIdTest() {
        // Given
        Dog dog = new Dog("Neptune",new Date(),30);
        Integer expectedId = null;


        // When
        dogHouse.add(dog); // add the dog object
        dogHouse.remove(30); // remove the dog object
        Dog actualRemoved = getDogById(30); // check if it is removed


        // Then

        Assert.assertEquals(expectedId, actualRemoved);  // check if expectedId matches the actualId null
//      Get the number of Dogs, if true should give me 1

    }
    // TODO - Create tests for `void remove(Dog dog)`

    @Test
    public void removeDogTest() {
        // Given
        Dog dog = new Dog("Neptune", new Date(), 25);
        Integer expectedRemoved = null;


        // When
        dogHouse.add(dog);
        dogHouse.remove(dog);
        Dog actualRemoved = dogHouse.getDogById(25);

        //Then
        Assert.assertEquals(expectedRemoved, actualRemoved);

    }



    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void getDogByIdTest() {

        // Looking at the object Dog and checking for it
        // Given
        Dog dog = new Dog("Neptune", new Date(), 50);

        // When
        dogHouse.add(dog);
        Dog actualDog = getDogById(50);

        // Then
        Assert.assertEquals(dog, actualDog);


    }



}
