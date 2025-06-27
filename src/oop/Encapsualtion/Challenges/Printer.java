package oop.Encapsualtion.Challenges;

public class Printer {
    private int  tonerLevel;
    private int  pagesPrinted;
    private boolean  duplex;

    public int getTonerLevel() {
        return tonerLevel;
    }

    public void setTonerLevel(int tonerLevel) {
        this.tonerLevel = tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public void setPagesPrinted(int pagesPrinted) {
        this.pagesPrinted = pagesPrinted;
    }

    public boolean getDuplex() {
        return duplex;
    }

    public void setDuplex(boolean duplex) {
        this.duplex = duplex;
    }

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel =(tonerLevel <=100&&tonerLevel>=0)?tonerLevel:0 ;
        this.duplex = duplex;
    }
    public int addToner(int tonerAmount)
    {
        if((tonerAmount+this.tonerLevel)>100 ||(tonerAmount+this.tonerLevel)<0  ) return -1;
        this.tonerLevel+=tonerAmount;

        return (this.tonerLevel);

    }
    public int printPages(int pages) {
        int jobPages = duplex ? (pages / 2 + pages % 2) : pages;
        this.pagesPrinted += jobPages;
        return jobPages;
    }


    @Override
    public String toString() {
        return "Printer{" +
                "tonerLevel=" + tonerLevel +
                ", pagesPrinted=" + pagesPrinted +
                ", duplex=" + duplex +
                '}';
    }
}
