package application.test;

public class Unit {

    private String name;
    private String code;
    private String lec;
    private int numOfPages;

    public Unit(String name, String code, String lec, int numOfPages) {
        this.name = name;
        this.code = code;
        this.lec = lec;
        this.numOfPages = numOfPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLec() {
        return lec;
    }

    public void setLec(String lec) {
        this.lec = lec;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }
}
