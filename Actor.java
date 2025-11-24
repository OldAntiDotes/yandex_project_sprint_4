import java.util.Objects;

public class Actor extends Person {
    private double height; // рост

    public Actor(String name, String surname, String gender, double height) {
        super(name, surname, gender);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Actor)) return false;
        Actor actor = (Actor) o;
        return Double.compare(actor.height, height) == 0 &&
                java.util.Objects.equals(name, actor.name) &&
                java.util.Objects.equals(surname, actor.surname);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, surname, height);
    }

    @Override
    public String toString() {
        return name + " " + surname + " (" + height + ")";
    }
}