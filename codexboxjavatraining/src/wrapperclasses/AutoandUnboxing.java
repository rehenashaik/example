package wrapperclasses;

public class AutoandUnboxing {
    //autoBoxing
    private int a=54;
    private Integer b=a;
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public Integer getB() {
        return b;
    }
    public void setB(Integer b) {
        this.b = b;
    }
    //unboxing
  private   Integer obj=1;
    float f=obj;

    public Integer getObj() {
        return obj;
    }

    public void setObj(Integer obj) {
        this.obj = obj;
    }

    public float getF() {
        return f;
    }

    public void setF(float f) {
        this.f = f;
    }
}
