package chat.repository;

public interface ICrudRepository<ID, E> {
    void add(E e); // fuge ein Element von Typ E hinzu
    void delete(ID id); //losche nach ID
    void update(ID id, E e); // erstelle update des Elementes mit einem neuen Element e
    E findbyId(ID id); //suche nach ID
}
