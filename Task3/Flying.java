package Task3;


import java.util.Objects;

public class Flying extends Birds{
    private String typeOfMovement;
    public Flying(String nameAnimal, int yearsOfAnimal) {
        super(nameAnimal, yearsOfAnimal);
    }
    public void toFly() {
        System.out.println("Летай");
    }
    @Override
    public void go() {
        System.out.println("Ходить");
    }

    @Override
    public void eat() {
        System.out.println("Ешь грызунов и личинки");
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flying flying = (Flying) o;
        return typeOfMovement.equals(flying.typeOfMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfMovement);
    }
    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    public void setTypeOfMovement(String typeOfMovement) {
        if (typeOfMovement != null && !typeOfMovement.isBlank() && !typeOfMovement.isEmpty()){
            this.typeOfMovement = typeOfMovement;}
    }
}