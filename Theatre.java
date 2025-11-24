public class Theatre {
    public static void main(String[] args) {
        // 1. Три актёра
        Actor actor1 = new Actor("Иван", "Иванов", "male", 180);
        Actor actor2 = new Actor("Пётр", "Петров", "male", 175);
        Actor actor3 = new Actor("Анна", "Сидорова", "female", 168);

        // 2. Два режиссёра
        Director director1 = new Director("Сергей", "Сергеев", "male", 10);
        Director director2 = new Director("Мария", "Кузнецова", "female", 7);

        // 3. Автор музыки и хореограф (обычные Person)
        Person composer = new Person("Людвиг", "Бетховен", "male");
        Person choreographer = new Person("Майя", "Плисецкая", "female");

        // 4. Три спектакля: обычный, опера и балет
        Show drama = new Show("Гроза", 120, director1);

        Opera opera = new Opera(
                "Волшебная флейта",
                150,
                director2,
                composer,
                "Принц Тамино, ночь, змеи и немного магии...",
                30
        );

        Ballet ballet = new Ballet(
                "Лебединое озеро",
                140,
                director1,
                composer,
                "История принца Зигфрида и заколдованной принцессы Одетты.",
                choreographer
        );

        // 5. Распределяем актёров по спектаклям
        drama.addActor(actor1);
        drama.addActor(actor2);

        opera.addActor(actor2);
        opera.addActor(actor3);

        ballet.addActor(actor1);
        ballet.addActor(actor3);

        // 6. Для каждого спектакля выведем список актёров
        System.out.println("=== Список актёров обычного спектакля ===");
        drama.printActors();

        System.out.println("\n=== Список актёров оперного спектакля ===");
        opera.printActors();

        System.out.println("\n=== Список актёров балетного спектакля ===");
        ballet.printActors();

        // 7. Заменяем актёра в одном из спектаклей
        System.out.println("\n=== Заменяем актёра в опере ===");
        opera.replaceActor("Петров", actor1); // заменим Петрова на Иванова
        opera.printActors();

        // 8. Пытаемся заменить несуществующего актёра в другом спектакле
        System.out.println("\n=== Пытаемся заменить несуществующего актёра в балете ===");
        ballet.replaceActor("Несуществующий", actor2);

        // 9. Для оперы и балета выводим текст либретто
        System.out.println("\n=== Либретто оперы ===");
        opera.printLibretto();

        System.out.println("\n=== Либретто балета ===");
        ballet.printLibretto();
    }
}