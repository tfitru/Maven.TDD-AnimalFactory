package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

import static rocks.zipcodewilmington.animals.animal_storage.CatHouse.getCatById;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {

    private CatHouse catHouse = new CatHouse();

    // TODO - Create tests for 'Integer getNumberOfCats()'

    @Test
    public void getNumberOfCatsTest() {
        // Given
        Cat cat = new Cat("Dino", new Date(), 25);
        Integer expectedNumberOfCats = 1;
        catHouse.clear(); // Need to clear out any other animals that may be inside

        // When
        catHouse.add(cat);
        Integer actualNumberOfCats = catHouse.getNumberOfCats();

        // Then
        Assert.assertEquals(expectedNumberOfCats, actualNumberOfCats);

    }


    // TODO - Create tests for `void add(Cat cat)`

    @Test
    public void addCatTest() {
        //Given
        Cat cat = new Cat("Milo", new Date(), 30);
        String expectedAdd = "Milo";

        // When
        catHouse.add(cat);
        Cat actualAdd = getCatById(30);

        // Then
        Assert.assertEquals(expectedAdd, actualAdd.getName());

    }


    // TODO - Create tests for `void remove(Integer id)`

    @Test
    public void removeIntegerIdTest() {
        //Given
        Cat cat = new Cat("Samson", new Date(), 50);
        Integer expectedRemove = null;


        // When
        catHouse.add(cat);
        catHouse.remove(50);
        Cat actualRemove = catHouse.getCatById(50);

        // Then
        Assert.assertEquals(expectedRemove, actualRemove);

    }


    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void removeIdTest() {
        //Given
        Cat cat = new Cat("Cupid", new Date(), 80);
        Cat expectedRemove = null;

        //When
        catHouse.add(cat);
        catHouse.remove(80);
        Cat actualRemoved = catHouse.getCatById(80);

        //Then
        Assert.assertEquals(expectedRemove, actualRemoved);

    }

    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void getCatByIdTest() {
        // Given
        Cat cat = new Cat("Robin", new Date(), 90);

        //When
        catHouse.add(cat);


        // Then
        Cat actualCatId = catHouse.getCatById(90);
        Assert.assertEquals(cat, actualCatId);


    }

}
