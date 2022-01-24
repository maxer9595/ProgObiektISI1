package pl.edu.uwm.wmii.marcelmrozowski.laboratorium09;

public class Pair<T> {

    public Pair() {
        first = null;
        second = null;
    }

    public Pair (T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }
    public T getSecond() {
        return second;
    }

    public void setFirst (T newValue) {
        first = newValue;
    }
    public void setSecond (T newValue) {
        second = newValue;
    }
    public <T> void swap(Pair<T> p){
        T temp = p.first;
        p.first=p.second;
        p.second=temp;
    }


    private T first;
    private T second;
}

