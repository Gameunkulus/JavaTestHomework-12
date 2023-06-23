public class AfishaManager {

    private String[] films = new String[0];
    private int filmNum = 5;

    public String[] getFilms() {
        return films;
    }

    public String getFilms(int i) {
        return films[i];
    }

    public void setFilms(String[] films) {
        this.films = films;
    }

    public int getFilmNum() {
        return filmNum;
    }

    public void setFilmNum(int filmNum) {
        this.filmNum = filmNum;
    }

    public AfishaManager(int filmNum) {
        setFilmNum(filmNum);
    }

    public AfishaManager() {
    }

    public String addFilm(String film) {
        int filmLength = getFilms().length;
        String[] newList = new String[filmLength + 1];
        for (int i = 0; i < filmLength; i++) {
            newList[i] = getFilms(i);
        }
        newList[newList.length - 1] = film;
        setFilms(newList);
        return newList[newList.length - 1];
    }

    public String[] findAll() {
        return getFilms();
    }

    public String[] findLast() {
        int resultLength = getFilmNum();
        int filmLength = getFilms().length;

        if (resultLength > filmLength) {
            return getFilms();
        } else {
            String[] listLast = new String[resultLength];
            int diff = filmLength - resultLength;
            for (int i = 0; i < resultLength; i++) {
                listLast[i] = getFilms(diff + i);
            }
            return listLast;
        }
    }
}
