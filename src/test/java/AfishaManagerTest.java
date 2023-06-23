import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class AfishaManagerTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/bonus.csv")
    void addFilmTest() {
        AfishaManager object = new AfishaManager();
        String newFilm = "Onward";
        String expectation = "Onward";
        Assertions.assertEquals(expectation, object.addFilm(newFilm));
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/bonus.csv")
    void findAllTest(String obj1, String obj2, String obj3) {
        AfishaManager object = new AfishaManager();
        String[] expectation = {"Faster and furious", "Gentlemen", "Hotel Belgrad"};
        object.addFilm(obj1);
        object.addFilm(obj2);
        object.addFilm(obj3);
        Assertions.assertArrayEquals(object.findAll(), expectation);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/bonus.csv")
    void findLastTest(String obj1, String obj2, String obj3, String obj4, String obj5, String obj6) {
        AfishaManager object = new AfishaManager();
        String[] expectation = {obj1, obj2, obj3, obj4};
        object.addFilm(obj1);
        object.addFilm(obj2);
        object.addFilm(obj3);
        object.addFilm(obj4);
        Assertions.assertArrayEquals(expectation, object.findLast());

        object.addFilm(obj5);
        String[] expectation2 = {obj1, obj2, obj3, obj4, obj5};
        Assertions.assertArrayEquals(expectation2, object.findLast());

        object.addFilm(obj6);
        String[] expectation3 = {obj2, obj3, obj4, obj5, obj6};
        Assertions.assertArrayEquals(expectation3, object.findLast());
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/bonus.csv")
    void FindLastTest(String obj1, String obj2, String obj3, String obj4, String obj5) {
        AfishaManager object = new AfishaManager(3);
        String[] expectation = {obj1, obj2};
        object.addFilm(obj1);
        object.addFilm(obj2);
        Assertions.assertArrayEquals(expectation, object.findLast());

        String[] expectation2 = {obj3, obj4, obj5};
        object.addFilm(obj3);
        object.addFilm(obj4);
        object.addFilm(obj5);
        Assertions.assertArrayEquals(expectation2, object.findLast());
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/bonus.csv")
    void getFilmsTest(String obj1, String obj2, String obj3, String obj4, String obj5) {
        AfishaManager object = new AfishaManager(5);
        object.addFilm(obj1);
        object.addFilm(obj2);
        object.addFilm(obj3);
        object.addFilm(obj4);
        object.addFilm(obj5);
        String[] expectation = {"Faster and furious", "Gentlemen", "Hotel Belgrad", "Onward", "Bloodshot"};
        Assertions.assertArrayEquals(expectation, object.getFilms());
        String expectation2 = obj1;
        Assertions.assertEquals(expectation2, object.getFilms(0));
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/bonus.csv")
    void setFilmsTest(String obj1, String obj2, String obj3, String obj4, String obj5) {
        AfishaManager object = new AfishaManager();
        String[] expectation = {obj1,obj2,obj3,obj4,obj5};
        object.setFilms(expectation);
        Assertions.assertArrayEquals(expectation,object.getFilms());
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/bonus.csv")
    void getFilmNumTest(String obj1, String obj2, String obj3) {
        AfishaManager object = new AfishaManager(4);
        object.addFilm(obj1);
        object.addFilm(obj2);
        object.addFilm(obj3);
        int expectation = 4;
        Assertions.assertEquals(expectation, object.getFilmNum());
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/bonus.csv")
    void setFilmNumTest() {
        AfishaManager object = new AfishaManager(2);
        int expectation = 5;
        object.setFilmNum(5);
        Assertions.assertEquals(expectation, object.getFilmNum());
    }
}