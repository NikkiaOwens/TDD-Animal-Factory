package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Test
    public void addDogTest() {
        // given
        Dog expected = new Dog();
        Integer id = expected.getId();

        // when
        DogHouse.add(expected);
        Dog actual = DogHouse.getDogById(id);

        // then
        Assert.assertEquals(expected, actual);
    }



    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeDogTest() {
        // given
        Dog dogToBeAdded = new Dog("null", null,  0);
        DogHouse.add(dogToBeAdded);
        Integer id = dogToBeAdded.getId();

        // when
        DogHouse.remove(id);
        Dog retrievedDog = DogHouse.getDogById(id);

        // then
        Assert.assertNull(retrievedDog);
    }


    // TODO - Create tests for `void remove(Cat cat)`

    @Test
    public void removeDogIdTest() {
        // given
        Dog dogToBeAdded = new Dog(null, null,  0);
        DogHouse.add(dogToBeAdded);
        Integer id = dogToBeAdded.getId();

        // when
        DogHouse.remove(dogToBeAdded);
        Dog retrievedDog = DogHouse.getDogById(id);

        // then
        Assert.assertNull(retrievedDog);
    }


    @Test
    public void getNumberOfDogsTest() {
        // given there is a cat to be added
        Dog dog = new Dog();

        // given that I count number of cats before add
        int numberOfDogsBeforeAdd = DogHouse.getNumberOfDogs();

        // given that I add one cat, my expected should be numberOfCatsBeforeAdd + 1
        int expected = numberOfDogsBeforeAdd + 1;

        // given that I have added a cat
        DogHouse.add(dog);

        // when I get the number of cats after the add
        int actual = DogHouse.getNumberOfDogs();

        // then
        Assert.assertEquals(expected, actual);




    }
}
