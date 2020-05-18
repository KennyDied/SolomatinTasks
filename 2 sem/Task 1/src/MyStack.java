public interface MyStack<E> {
    boolean push(E item); //добавить элемент в начало
    E pop (); //удаляет верхний с возвращением
    E peekStack(); //возвращает верхний без удаления
}
