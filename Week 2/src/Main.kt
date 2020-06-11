import helper.CafeController
import helper.testEmployees
import helper.testProducts

fun main() {

    val cafeController = CafeController() // print out the data here using CafeController functions

    cafeController.adoptCat("S2C1", testEmployees.first())
    println("Adopted cats ${cafeController.getAdoptedCats()}")

    println(cafeController.getNumberOfAdoptionsPerShelter())
    println(cafeController.getUnadoptedCats())

    cafeController.showNumberOfNonEmployeeCustomersForDay("Monday")
    cafeController.showNumberOfReceiptsForDay("Tuesday")

    println(cafeController.getAdopters())
    println(cafeController.getWorkingEmployees())
    println(cafeController.getTopSellingProducts())

    cafeController.sellItems(testProducts.toList(), "348")

}