/*
*Клас містить в собі перерахування всіх місяців року і до якої
* пори року вони належать, також містить змінну, яка фіксує кількість днів в кожному місяці
*/
package task1;

public enum Months {

    JANUARY(31, Seasons.WINTER),
    FEBRUARY(28, Seasons.WINTER),
    MARCH(31, Seasons.SPRING),
    APRIL(30, Seasons.SPRING),
    MAY(31, Seasons.SPRING),
    JUNE(31, Seasons.SUMMER),
    JULY(30, Seasons.SUMMER),
    AUGUST(31, Seasons.SUMMER),
    SEPTEMBER(30,Seasons.AUTUMN),
    OCTOBER(31, Seasons.AUTUMN),
    NOVEMBER(30, Seasons.AUTUMN),
    DECEMBER(31, Seasons.WINTER);
    int days;
    Seasons season;

    /**Конструктор присвоює кількість днів і приналежність місяця до пори року*/
    Months(int days, Seasons season){
        this.days = days;
        this.season = season;
    };


    /**Метод дозволяє витягнути данні про кількість днів у місяці*/
    public int getDays() {
        return days;
    }

    /**Метод дозволяє витягнути данні про приналежність місяця до пори року*/
    public Seasons getSeason() {
        return season;
    }
}
