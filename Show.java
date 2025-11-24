import java.util.ArrayList;
import java.util.List;

// Обычный спектакль
class Show {
    private String title;
    private int duration; // в минутах
    private Director director;
    private List<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public Director getDirector() {
        return director;
    }

    // Добавить нового актёра в спектакль
    // Если такой актёр уже есть (equals), не добавляем и пишем предупреждение
    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Актёр " + actor + " уже участвует в спектакле \"" + title + "\".");
            return;
        }
        listOfActors.add(actor);
    }

    // Распечатать информацию о режиссёре
    public void printDirectorInfo() {
        System.out.println("Режиссёр спектакля \"" + title + "\": " +
                director.getName() + " " + director.getSurname());
    }

    // Распечатать список актёров
    public void printActors() {
        for (Actor actor : listOfActors) {
            // имя, фамилия и в скобках рост
            System.out.println(actor.getName() + " " + actor.getSurname()
                    + " (" + actor.getHeight() + ")");
        }
    }

    // Заменить одного актёра другим по фамилии
    public void replaceActor(Actor newActor, String oldSurname) {
        for (int i = 0; i < listOfActors.size(); i++) {
            Actor current = listOfActors.get(i);
            if (current.getSurname().equals(oldSurname)) {
                listOfActors.set(i, newActor);
                System.out.println("В спектакле \"" + title + "\" актёр "
                        + current.getName() + " " + current.getSurname()
                        + " заменён на " + newActor.getName() + " " + newActor.getSurname() + ".");
                return;
            }
        }
        System.out.println("Актёр с фамилией \"" + oldSurname + "\" в спектакле \"" +
                title + "\" не найден.");
    }
}