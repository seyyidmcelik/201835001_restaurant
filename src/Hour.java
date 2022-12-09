import java.util.ArrayList;

public class Hour<T> extends BookedTables {
    T start;
    T end;
    ArrayList<T> hours = new ArrayList<T>();

    public Hour() {

    }

    public T getStart() {
        return start;
    }

    public void setStart(T start) {
        this.start = start;
    }

    public T getEnd() {
        return end;
    }

    public void setEnd(T end) {
        this.end = end;
    }

    public Hour(T start, T end) {
        this.start = start;
        this.end = end;
    }

    public T workingHourAtStart() {
        return (T) this.start;
    }

    public T workingHourAtEnd() {
        return (T) this.end;
    }
}
