package cs.unitec.steve.a7424quiztournament.models;

public enum Category {
    ANY("Any", 0),

    GENERAL_KNOWLEDGE("General Knowledge", 1),

    ENTERTAINMENT_BOOKS("Entertainment: Books", 2),
    ENTERTAINMENT_FILM("Entertainment: Film", 3),
    ENTERTAINMENT_MUSIC("Entertainment: Music", 4),
    ENTERTAINMENT_MUSICALS_THEATRES("Entertainment: Musicals & Theatres", 5),
    ENTERTAINMENT_TELEVISION("Entertainment: Television", 6),
    ENTERTAINMENT_VIDEO_GAME("Entertainment: Video Games", 7),
    ENTERTAINMENT_BOARD_GAME("Entertainment: Board Games", 8),
    ENTERTAINMENT_COMICS("Entertainment: Comics", 9),
    ENTERTAINMENT_JAPANESE_ANIME_MANGA("Entertainment: Japanese Anime & Manga", 10),
    ENTERTAINMENT_CARTOON_ANIMATIONS("Entertainment: Cartoon & Animations", 11),

    SCIENCE_NATURE("Science & Nature", 12),
    SCIENCE_COMPUTERS("Science: Computers", 13),
    SCIENCE_MATHEMATICS("Science: Mathematics", 14),
    SCIENCE_GADGETS("Science: Gadgets", 15),

    MYTHOLOGY("Mythology", 16),
    SPORTS("Sports", 17),
    GEOGRAPHY("Geography", 18),
    HISTORY("History", 19),
    POLITICS("Politics", 20),
    ART("Art", 21),
    CELEBRITIES("Celebrities", 22),
    ANIMALS("Animals", 23),
    VEHICLES("Vehicles", 24);

    private final String text;
    private final int id;

    Category(String text, int id) {
        this.text = text;
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public int getId() {
        return id;
    }

}

