package Exercise5_2;

/**
 *
 * @author Huynh Tan Hoa
 * @version 1.0
 * @since 13/9/2016
 */
public class SumThread extends Thread {

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

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public SumThread(int lo, int hi, int[] arr) {
        this.lo = lo;
        this.hi = hi;
        this.arr = arr;
    }

    private int lo, hi;
    private int[] arr;
    private int sum = 0;

    @Override
    public void run() {
        for (int i = this.lo; i < this.hi; i++) {
            this.sum += this.arr[i];
        }
    }
}
