import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.radio.Radio;

public class TestRadio {
    @Test
    public void shouldSetNumber() {
        Radio num = new Radio();
        num.setCurrentNumber(8);
        int expected = 8;
        int actual = num.getCurrentNumber();
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldNotSetNumberAboveMax() {
        Radio num = new Radio();
        num.setCurrentNumber(239);
        int expected = 2;
        int actual = num.getCurrentNumber();
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void moveToNextNumber() {
        Radio num = new Radio();
        num.setCurrentNumber(7);
        int expected = 8;
        int actual = num.next();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void moveToNextIfNumberAboveMax() {
        Radio num = new Radio();
        num.setCurrentNumber(9);
        int expected = 0;
        int actual = num.next();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void moveToPrevNumber() {
        Radio num = new Radio();
        num.setCurrentNumber(7);
        int expected = 6;
        int actual = num.prev();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void moveToPrevIfNumberUnderMin() {
        Radio num = new Radio();
        num.setCurrentNumber(0);
        int expected = 9;
        int actual = num.prev();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void moveUnderMaxVolume() {
        Radio value = new Radio();
        value.currentNumberVolume = 7;
        int expected = 8;
        int actual = value.increaseVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void moveAboveMaxVolume() {
        Radio value = new Radio();
        value.currentNumberVolume = 10;
        int expected = 10;
        int actual = value.increaseVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void moveAboveMinVolume() {
        Radio value = new Radio();
        value.currentNumberVolume = 7;
        int expected = 6;
        int actual = value.decreaseVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void moveUnderMinVolume() {
        Radio value = new Radio();
        value.currentNumberVolume = 0;
        int expected = 0;
        int actual = value.decreaseVolume();
        Assertions.assertEquals(expected, actual);

    }

}