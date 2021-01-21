package Two05;

public class student {
    private String xm;
    private String nl;
    private String dz;
    private String xh;

    public student() {
    }

    public student(String xm, String nl, String dz, String xh) {
        this.xm = xm;
        this.nl = nl;
        this.dz = dz;
        this.xh = xh;
    }

    public String getXm() {
        return xm;
    }

    public String getNl() {
        return nl;
    }

    public String getDz() {
        return dz;
    }

    public String getXh() {
        return xh;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public void setNl(String nl) {
        this.nl = nl;
    }

    public void setDz(String dz) {
        this.dz = dz;
    }

    public void setXh(String xh) {
        this.xh = xh;
    }
}
