package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`

    @Test
    public void testAnimalCreate() {
        //Given
        Date expectedDate = new Date(2002, 5, 15);
        DogHouse dogHouse = new DogHouse();
        Integer expectedAnimalInDogHouse = 1;


        //When
        dogHouse.add(AnimalFactory.createDog("Milo", expectedDate));
        Integer actualAnimal = dogHouse.getNumberOfDogs();

        //Then
        Assert.assertEquals(expectedAnimalInDogHouse, actualAnimal);


    }


    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void createCatTest() {
        //Given
        Date expectedDate = new Date(2005, 7, 20);
        CatHouse catHouse = new CatHouse();
        Integer expectedAnimalInCatHouse = 1;


        //When
        catHouse.add(AnimalFactory.createCat("Nemo", expectedDate));
        Integer actualAnimalCat = catHouse.getNumberOfCats();

        //Then
        Assert.assertEquals(expectedAnimalInCatHouse, actualAnimalCat);
    }
}
