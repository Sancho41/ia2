package src

enum class Subject(val values: AreaValues) {
    PORTUGUESE_LANGUAGE(AreaValues(0, 1, 0)),
    LITERATURE(AreaValues(0, 1, 0)),
    MODERN_FOREIGN_LANGUAGE(AreaValues(0, 1, 0)),
    ARTS(AreaValues(0, 1, 0)),
    PHYSICAL_EDUCATION(AreaValues(0, 1, 0)),
    MATHEMATICS(AreaValues(0, 0, 1)),
    PHYSICS(AreaValues(0, 0, 1)),
    CHEMISTRY(AreaValues(0, 0, 1)),
    BIOLOGY(AreaValues(1, 0, 0)),
    HISTORY(AreaValues(0, 1, 0)),
    GEOGRAPHY(AreaValues(0, 1, 0)),
    SOCIOLOGY(AreaValues(0, 1, 0)),
    PHILOSOPHY(AreaValues(0, 1, 0)),
    ENVIRONMENTAL_EDUCATION(AreaValues(1, 0, 1)),
    HEALTH_EDUCATION(AreaValues(1, 0, 1)),
    ETHICS_AND_CITIZENSHIP(AreaValues(0, 1, 1));
}
