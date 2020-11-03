public class Counter {
    private int max;
    private int min;
    private int count;

    public Counter() {
        this.max = 100;
        this.min = 0;
        this.count = 0;
    }

    public Counter(int min, int max, int count) {
        if(max < min) {
            this.max = min;
            this.min = max;
        } else {
            this.max = max;
            this.min = min;
        }
        if(count > max) this.count = max;
        else if(count < min) this.count = min;
        else this.count = count;
    }

    public void increase() {
        if(count < max) count++;
        else count = min;
    }

    public void decrease() {
        if(count > min) count--;
        else count = max;
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "range " + min +
                "-" + max +
                ", counter value " + count;
    }
}
