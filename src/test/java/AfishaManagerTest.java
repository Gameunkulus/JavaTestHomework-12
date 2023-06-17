import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AfishaManagerTest {

    @Test
    void addFilmTest() {
        AfishaManager object = new AfishaManager();
        String newFilm = "Onward";
        String expectation = "Onward";
        Assertions.assertEquals(expectation, object.addFilm(newFilm));
    }

    @Test
    void findAllTest() {
        AfishaManager object = new AfishaManager();
        String obj1 = "Faster and furious";
        String obj2 = "Gentlemen";
        String obj3 = "Hotel Belgrad";
        String[] expectation = {obj1, obj2, obj3};
        object.addFilm(obj1);
        object.addFilm(obj2);
        object.addFilm(obj3);
        Assertions.assertArrayEquals(object.findAll(), expectation);
    }

    @Test
    void findLastTest() {
        AfishaManager object = new AfishaManager();
        String obj1 = "Faster and furious";
        String obj2 = "Gentlemen";
        String obj3 = "Hotel Belgrad";
        String obj4 = "Onward";
        String obj5 = "Bloodshot";
        String obj6 = "Van Vielder";
        String[] expectation = {obj1, obj2, obj3, obj4};
        object.addFilm(obj1);
        object.addFilm(obj2);
        object.addFilm(obj3);
        object.addFilm(obj4);
        Assertions.assertArrayEquals(expectation, object.findLast());
        object.addFilm(obj5);
        object.addFilm(obj6);
        String[] expectation2 = {obj2, obj3, obj4, obj5, obj6};
        Assertions.assertArrayEquals(expectation2,object.findLast());
    }

    @Test
    void FindLastTest() {
        AfishaManager object = new AfishaManager(3);
        String obj1 = "Faster and furious";
        String obj2 = "Gentlemen";
        String obj3 = "Hotel Belgrad";
        String obj4 = "Onward";
        String obj5 = "Bloodshot";
        String[] expectation = {obj1, obj2};
        object.addFilm(obj1);
        object.addFilm(obj2);
        Assertions.assertArrayEquals(expectation, object.findLast());
        object.addFilm(obj3);
        object.addFilm(obj4);
        object.addFilm(obj5);
        String[] expectation2 = {obj3, obj4, obj5};
        Assertions.assertArrayEquals(expectation2, object.findLast());
    }
}