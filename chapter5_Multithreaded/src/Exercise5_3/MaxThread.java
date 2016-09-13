package Exercise5_3;


/**
 *
 * @author Huynh Tan Hoa
 * @version 1.0
 * @since 13/9/2016
 */
public class MaxThread extends Thread {

    public int getLo() {
        return lo;
    }

    public void setLo(int lo) {
        this.lo = lo;
    }

    public int getHi() {
        return hi;
    }

    public void setHi(int hi) {
        this.hi = hi;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public MaxThread(int lo, int hi, int[] arr) {
        this.lo = lo;
        this.hi = hi;
        this.arr = arr;
    }

    private int lo, hi;
    private int[] arr;
    private int max = 0;

    @Override
    public void run() {
        for (int i = this.lo; i < this.hi; i++) {
            max = Math.max(arr[i], this.max);
        }
    }
}
