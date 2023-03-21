package src

enum class Activities(val values: AreaValues) {
    READING_CLUB(AreaValues(10, 80, 10)),
    THEATER_GROUP(AreaValues(10, 90, 10)),
    SCIENCE_CULB(AreaValues(70, 10, 90)),
    ROBOTICS_TEAM(AreaValues(60, 10, 100)),
    MUSIC_GROUP(AreaValues(20, 80, 20)),
    DEBATE_CLUB(AreaValues(20, 90, 20)),
    VOLUNTEERING(AreaValues(50, 50, 50)),
    LANGUAGE_CLUB(AreaValues(10, 90, 20)),
    DANCE_GROUP(AreaValues(10, 80, 30)),
    SPORTS_TEAM(AreaValues(10, 70, 100)),
}
