package objects;

import data.DayMonth;

public class ProceedsAndEstimate {
    private double price = 0;
    private final int[][] COUNTOFDAY = new int[12][30];
    public final double[][] PROCEEDS = new double[12][30];

    public void setPrice(double price){
        this.price = price;
    }

    public void addProceed(int count){
        COUNTOFDAY[DayMonth.month][DayMonth.day] += count;
        PROCEEDS[DayMonth.month][DayMonth.day] =  price * COUNTOFDAY[DayMonth.month][DayMonth.day];
    }

    public double getProceed(int Month, int Day){
        System.out.printf("В " + Day + " день " + Month + " месяца выручка составила ");
        return PROCEEDS[Month][Day];
    }

    public int getCount(int Month, int Day){
        return COUNTOFDAY[Month][Day];
    }
}
