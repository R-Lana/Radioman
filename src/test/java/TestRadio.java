import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.radio.Radio;

public class TestRadio {
    @Test
    public void shouldSetNumberWithoutChangeAmount() {
        Radio num = new Radio();
        num.setCurrentNumber(8);
        int expected = 8;
        int actual = num.getCurrentNumber();
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldNotSetNumberAboveMaxWithoutChangeAmount() {
        Radio num = new Radio();
        num.setCurrentNumber(8);
        num.setCurrentNumber(15);
        int expected = 8;
        int actual = num.getCurrentNumber();
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldSetNumberWithChangeAmount() {
        Radio num = new Radio(15);
        num.setCurrentNumber(8);
        int expected = 8;
        int actual = num.getCurrentNumber();
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldNotSetNumberAboveMaxWithChangeAmount() {
        Radio num = new Radio(15);
        num.setCurrentNumber(8);
        num.setCurrentNumber(20);
        int expected = 8;
        int actual = num.getCurrentNumber();
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void moveToNextNumber() {
        Radio num = new Radio(20);
        num.setCurrentNumber(15);
        int expected = 16;
        int actual = num.next();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void moveToNextIfNumberAboveMax() {
        Radio num = new Radio(20);
        num.setCurrentNumber(19);
        int expected = 0;
        int actual = num.next();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void moveToPrevNumber() {
        Radio num = new Radio(20);
        num.setCurrentNumber(16);
        int expected = 15;
        int actual = num.prev();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void moveToPrevIfNumberUnderMin() {
        Radio num = new Radio(20);
        num.setCurrentNumber(0);
        int expected = 19;
        int actual = num.prev();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void moveUnderMaxVolume() {
        Radio value = new Radio();
        value.setCurrentNumberVolume(70);
        int expected = 71;
        int actual = value.increaseVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void moveAboveMaxVolume() {
        Radio value = new Radio();
        value.setCurrentNumberVolume(100);
        int expected = 100;
        int actual = value.increaseVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void moveAboveMinVolume() {
        Radio value = new Radio();
        value.setCurrentNumberVolume(70);
        int expected = 69;
        int actual = value.decreaseVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void moveUnderMinVolume() {
        Radio value = new Radio();
        value.setCurrentNumber(0);
        int expected = 0;
        int actual = value.decreaseVolume();
        Assertions.assertEquals(expected, actual);

    }

}