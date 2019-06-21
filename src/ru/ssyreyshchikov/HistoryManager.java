package ru.ssyreyshchikov;

public class HistoryManager implements Storable {
    /**
     * Добавление операции в список истории операций
     *
     * @param operation структура данных, описывающая операццию
     */
    @Override
    public void add(Operation operation) {

    }

    /**
     * Получение операции по индексу
     *
     * @param index индекс в массиве или списке операций
     * @return объект описывающий операцию
     */
    @Override
    public Operation get(int index) {
        return null;
    }

    /**
     * Удаление всей истории операций
     */
    @Override
    public void clear() {

    }
}
