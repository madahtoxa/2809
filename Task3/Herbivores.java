package Task3;

import java.util.Objects;

public class Herbivores extends Animals {
    //Травоядные

    private String typeOfFood;

    public Herbivores(String nameAnimal, int yearsOfAnimal) {
        super(nameAnimal, yearsOfAnimal);
    }

    public void graze() {
        System.out.println("Выпас");
    }

    @Override
    public void go() {
        System.out.println("Пасись");
    }

    @Override
    public void eat() {
        System.out.println("Ешь траву");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Herbivores that = (Herbivores) o;
        return typeOfFood.equals(that.typeOfFood);

    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfFood);
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        if (typeOfFood != null && !typeOfFood.isBlank() && !typeOfFood.isEmpty()) {
            this.typeOfFood = typeOfFood;
        }
    }
}

