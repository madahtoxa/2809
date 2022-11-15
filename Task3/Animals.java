package Task3;

public abstract class Animals {
    private String nameAnimal;
    private int yearsOfAnimal;

    public Animals(String nameAnimal, int yearsOfAnimal) {
        this.nameAnimal = nameAnimal;
        this.yearsOfAnimal = yearsOfAnimal;
    }

    public void eat() {

    }

    public void sleep() {

    }

    public void go() {

    }

    public String getNameAnimal() {
        return nameAnimal;
    }

    public void setNameAnimal(String nameAnimal) {
        if (nameAnimal != null && !nameAnimal.isBlank() && !nameAnimal.isEmpty())
            this.nameAnimal = nameAnimal;
    }

    public int getYearsOfAnimal() {
        return yearsOfAnimal;
    }

    public void setYearsOfAnimal(int yearsOfAnimal) {
        if (yearsOfAnimal > 0)
            this.yearsOfAnimal = yearsOfAnimal;
    }
}