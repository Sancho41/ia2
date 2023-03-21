package src

data class Student(
    val chromosomes: List<Subject>
) {
    companion object {
        const val CHROMOSOME_SIZE = 30
    }
}
