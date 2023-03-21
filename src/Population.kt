package src

data class Population private constructor(
    val students: List<Student>
) {

    companion object {
        const val POPULATION_SIZE = 100

        fun generateNewPopulation(): Population {
            val students = (0 until POPULATION_SIZE).map {
                val chromossomes = (0 until Student.CHROMOSOME_SIZE).map {
                    Subject.values().random()
                }
                Student(chromossomes)
            }

            return Population(students)
        }
    }
}
