package manager;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
public class Manager<T>{
        private List<T> items = new ArrayList<>();

        public void add(T item){
            items.add(item);
        }
        public void removeItem(T item){
            items.remove(item);
        }
        public List<T> getAll() {
            return new  ArrayList<>(items);
        }
        public int size (){
            return items.size();
        }
        public List<T> find(Predicate<T> condition){
            return items.stream().filter(condition).toList();
        }
    }

