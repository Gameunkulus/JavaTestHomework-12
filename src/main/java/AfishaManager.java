public class AfishaManager {

    String[] films = new String[0];
    int filmNum = 5;

    public String addFilm(String film) {
        String[] newList = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            newList[i] = films[i];
        }
        newList[newList.length - 1] = film;
        films = newList;
        return newList[newList.length - 1];
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int resultLength = filmNum;
        if (resultLength > films.length) {
            return films;
        } else {
            String[] listLast = new String[resultLength];
            int diff = films.length - resultLength;
            for (int i = 0; i < resultLength; i++) {
                listLast[i] = films[diff + i];
            }
            return listLast;

        }
    }

    public String[] findLast(int filmNum) {

        int resultLength = filmNum;

        if (resultLength > films.length) {
            return films;
        } else {
            String[] listLast = new String[resultLength];
            int diff = films.length - resultLength;
            for (int i = 0; i < resultLength; i++) {
                listLast[i] = films[diff + i];
            }
            return listLast;
        }
    }
}
