package src


fun main() {
    val population = Population.generateNewPopulation()

    population.students.forEachIndexed { index, student ->
        println("Student[$index]: ${student.chromosomes}")
    }
}
