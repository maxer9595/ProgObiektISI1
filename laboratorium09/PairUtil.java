package pl.edu.uwm.wmii.marcelmrozowski.laboratorium09;

public class PairUtil<T> {

    public PairUtil() {
        first = null;
        second = null;
    }

    public PairUtil (T first, T second) {
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
    static public <T> void swap(PairUtil<T> p){
        T temp = p.first;
        p.first=p.second;
        p.second=temp;
    }


    private T first;
    private T second;
}
