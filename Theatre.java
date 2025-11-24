public class Theatre {
    public static void main(String[] args) {
        // 1. Создаём актёров
        Actor actor1 = new Actor("Иван", "Иванов", Gender.MALE, 180);
        Actor actor2 = new Actor("Пётр", "Петров", Gender.MALE, 175);
        Actor actor3 = new Actor("Анна", "Сидорова", Gender.FEMALE, 165);

        // 2. Создаём режиссёров
        Director director1 = new Director("Михаил", "Сергеев", Gender.MALE, 10);
        Director director2 = new Director("Ольга", "Николаева", Gender.FEMALE, 5);

        // 3. Автор музыки и хореограф (как строки)
        String musicAuthor = "П. И. Чайковский";
        String choreographer = "Мариус Петипа";

        // 4. Создаём три спектакля: обычный, оперный и балет
        Show drama = new Show("Гроза", 120, director1);

        Opera opera = new Opera(
                "Евгений Онегин",
                160,
                director2,
                musicAuthor,
                "Либретто оперы «Евгений Онегин»...",
                40
        );

        Ballet ballet = new Ballet(
                "Лебединое озеро",
                140,
                director2,
                musicAuthor,
                "Либретто балета «Лебединое озеро»...",
                choreographer
        );

        // 5. Распределяем актёров по спектаклям
        drama.addActor(actor1);
        drama.addActor(actor2);

        opera.addActor(actor2);
        opera.addActor(actor3);

        ballet.addActor(actor1);
        ballet.addActor(actor3);

        // 6. Для каждого спектакля выводим список актёров
        System.out.println("Актёры драматического спектакля:");
        drama.printActors();
        System.out.println();

        System.out.println("Актёры оперы:");
        opera.printActors();
        System.out.println();

        System.out.println("Актёры балета:");
        ballet.printActors();
        System.out.println();

        // 7. Заменяем актёра в одном из спектаклей и снова выводим список
        System.out.println("Заменяем актёра во «Грозе» (Петров -> Сидорова):");
        drama.replaceActor(actor3, "Петров");
        System.out.println("Актёры драматического спектакля после замены:");
        drama.printActors();
        System.out.println();

        // 8. Пытаемся заменить несуществующего актёра в другом спектакле
        System.out.println("Пробуем заменить несуществующего актёра в опере:");
        opera.replaceActor(actor1, "Несуществующий");
        System.out.println();

        // 9. Выводим либретто для оперы и балета
        System.out.println("Либретто оперы:");
        opera.printLibretto();
        System.out.println();

        System.out.println("Либретто балета:");
        ballet.printLibretto();
    }
}
