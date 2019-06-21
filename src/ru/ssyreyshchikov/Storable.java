package ru.ssyreyshchikov;

public interface Storable {
    /**Добавление операции в список истории операций
     * @param operation структура данных, описывающая операццию
     */
    void add(Operation operation);

    /**Получение операции по индексу
     * @param index индекс в массиве или списке операций
     *              @return объект описывающий операцию
     */
    Operation get(int index);

    /**
     * Удаление всей истории операций
     */
    void clear();
}
