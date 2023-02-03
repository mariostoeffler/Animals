public class Animal {

    private String name;
    private int age;
    private String species;
    private String animalLoud;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getAnimalLoud() {
        return animalLoud;
    }

    public void setAnimalLoud(String animalLoud) {
        this.animalLoud = animalLoud;
    }

    public String giveAnimalLoud() {
        return animalLoud;
    }

    public String getNameAndAge() {
        String result = getName() + " " + getAge();
        return result;
    }

    public String ageCategory() {
        String result = "old animal";
        if (getAge()>=0 & getAge()<=2)
            return result = "baby animal";
        else if (getAge()>2 && getAge()<=4)
            return result = "young animal";
            else return result;
    }

}
