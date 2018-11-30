package data;

// single raw data describe which information need to be given for a single month
public class SingleRawData {
    public double sales;
    public double radioadd;

    public SingleRawData(double sales, double radioadd) {
        this.sales = sales;
        this.radioadd = radioadd;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getRadioadd() {
        return radioadd;
    }

    public void setRadioadd(double radioadd) {
        this.radioadd = radioadd;
    }
}
