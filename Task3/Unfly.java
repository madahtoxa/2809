package Task3;

import java.util.Objects;

public class Unfly extends Birds {

    private String typeOfMovement;

    public Unfly(String nameAnimal, int yearsOfAnimal) {
        super(nameAnimal, yearsOfAnimal);
    }
    public void walk() {
        System.out.println("walk!");
    }
    @Override
    public void go() {
        System.out.println("go!");
    }
    @Override
    public void eat() {
        System.out.println("eat!");
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Unfly that = (Unfly) o;
        return typeOfMovement.equals(that.typeOfMovement);
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