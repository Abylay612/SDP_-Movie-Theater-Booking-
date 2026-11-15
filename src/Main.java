import factory.factories.IMAXTicketFactory;
import factory.factories.StandardTicketFactory;
import factory.factories.TicketFactory;
import factory.tickets.ITicket;

void main() {
    System.out.println("=== ЗАПУСК СИСТЕМЫ БРОНИРОВАНИЯ КИНОТЕАТРА ===");
    System.out.println("--- Проверка паттерна: Фабричный метод (Factory Method) ---\n");

    // 1. Создаем билет через фабрику IMAX
    TicketFactory imaxFactory = new IMAXTicketFactory();
    ITicket imaxTicket = imaxFactory.createTicket("Interstellar", 1, 4, 10, 2500.0);

    System.out.print("Создан билет: ");
    imaxTicket.printTicketInfo();

    System.out.println();

    // 2. Создаем билет через фабрику Стандартных билетов
    TicketFactory standardFactory = new StandardTicketFactory();
    ITicket standardTicket = standardFactory.createTicket("Avatar 2", 2, 7, 15, 1500.0);

    System.out.print("Создан билет: ");
    standardTicket.printTicketInfo();

    // Позже здесь появятся теги для других паттернов (Builder, Strategy, Observer и т.д.)
}