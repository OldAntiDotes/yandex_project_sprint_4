package theatre.shows;

import theatre.people.Actor;
import theatre.people.Director;

import java.util.ArrayList;
import java.util.List;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected List<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public void printDirector() {
        System.out.println("Режиссёр: " + director.getName() + " " + director.getSurname());
    }

    public void printActors() {
        System.out.println("Список актёров для спектакля \"" + title + "\":");
        if (listOfActors.isEmpty()) {
            System.out.println("  (в этом спектакле пока нет актёров)");
            return;
        }
        for (Actor actor : listOfActors) {
            System.out.println("- " + actor.getName() + " " + actor.getSurname()
                    + " (" + actor.getHeight() + ")");
        }
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Актёр " + actor + " уже участвует в спектакле \"" + title + "\". Не добавляем.");
        } else {
            listOfActors.add(actor);
        }
    }

    public void replaceActor(String surnameToReplace, Actor newActor) {
        for (int i = 0; i < listOfActors.size(); i++) {
            Actor current = listOfActors.get(i);
            if (current.getSurname().equalsIgnoreCase(surnameToReplace)) {
                listOfActors.set(i, newActor);
                System.out.println("В спектакле \"" + title + "\" актёр "
                        + current + " заменён на " + newActor + ".");
                return;
            }
        }
        System.out.println("Актёр с фамилией " + surnameToReplace
                + " не найден в спектакле \"" + title + "\".");
    }

    public String getTitle() {
        return title;
    }
}
