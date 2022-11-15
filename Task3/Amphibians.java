package Task3;

public class Amphibians extends Animals {
    //Земноводные
    private String livingEnvironment;

    public Amphibians(String nameAnimal, int yearsOfAnimal) {
        super(nameAnimal, yearsOfAnimal);
    }

    public void hunt() {
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment != null && !livingEnvironment.isBlank() && !livingEnvironment.isEmpty())
            this.livingEnvironment = livingEnvironment;
    }
}
