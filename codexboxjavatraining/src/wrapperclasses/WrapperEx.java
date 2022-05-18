package wrapperclasses;

public class WrapperEx {
   double d;
   Double r = Double.valueOf(d);
    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public Double getR() {
        return r;
    }
    public void setR(Double r) {
        this.r = r;
    }
}
