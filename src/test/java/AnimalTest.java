import org.junit.jupiter.api.Assertions;

class AnimalTest {

    Animal animal = new Animal();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        animal.setName("Leo");
        animal.setSpecies("Löwe");
        animal.setAge(3);
        animal.setAnimalLoud("Roarr");
    }


    @org.junit.jupiter.api.Test
    void giveAnimalLoud() {
        String result="Roarr";
        Assertions.assertEquals(result, animal.giveAnimalLoud());

    }

}