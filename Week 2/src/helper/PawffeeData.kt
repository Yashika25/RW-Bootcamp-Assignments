package helper

import model.animals.Cat
import model.caffe.Product
import model.caffe.Receipt
import model.caffe.Sponsorship
import model.people.Employee
import model.people.Patron
import model.shelter.Shelter

val ShelterOne = Shelter("S1", "Kitty Caty Club", 2)
val ShelterTwo = Shelter("S2", "Pawwee Pet Shop", 3)

val shelterOneCats = setOf(
        Cat("S1C1", "Misty", "F", "S1", mutableSetOf(Sponsorship("569", "S1C1"))),
        Cat("S2C2", "Pistaus", "M", "S1", mutableSetOf(Sponsorship("254", "S1C2"), Sponsorship("896", "S1C2")))
)

val shelterTwoCats = setOf(
        Cat("S2C1", "Cammi", "F", "S2", mutableSetOf(Sponsorship("348", "S2C1"), Sponsorship("456", "S2C1"))),
        Cat("S2C2", "Tulip", "F", "S2", mutableSetOf(Sponsorship("157", "S2C2"), Sponsorship("627", "S2C2"), Sponsorship("760", "S2C2"))),
        Cat("S2C3", "Kalo", "M", "S2", mutableSetOf(Sponsorship("555", "S2C3")))
)

val testEmployees = setOf(
        Employee("569",
                "Yashika",
                "Kalra",
                "yashika@gmail.com",
                "+9568246951",
                250000.0,
                "1546re489a8942",
                "01/08/2016"),

        Employee("254",
                "Lalit",
                "Khanna",
                "lalit@gmail.com",
                "+8169137694",
                50000.0,
                "9f456ew1894jf5",
                "15/05/2010"),

        Employee("896",
                "Seema",
                " ",
                "seema@gmail.com",
                "+9478626488",
                50000.0,
                "695ee489948da46",
                "15/05/2010")
)

val testPatrons = setOf(
        Patron("348",
                "Mahima",
                "Sharma",
                "mahima@gmail.com",
                "+9568412687"),

        Patron("456",
                "Simran",
                "Bhalla",
                "simran@gmail.com",
                "+8888884444"),

        Patron("157",
                "Leena",
                "Kumari",
                "leena@gmail.com",
                "+7896531596"
        ),

        Patron("627",
                "Deepika",
                "Bansal",
                "deepika@gmail.com",
                "+7569564569"),

        Patron("760",
                "Ankit",
                "Kumar",
                "ankit@gmail.com",
                "+7233654954"),

        Patron("555",
                "Sumit",
                " ",
                "sumit@gmail.com",
                "+9856246518")
)

val coffee = Product("1", 25.0, "Cold Coffee")
val espresso = Product("2", 10.0, "Espresso")
val sandwitch = Product("3", 5.0, "Sandwitch")
val pizza = Product("4", 35.0, "Pizza Slice")

val testProducts = setOf(coffee, espresso, sandwitch, pizza)

val testReceiptsOne = mutableSetOf(
        Receipt(
                "1",
                listOf(coffee, espresso, sandwitch, sandwitch, sandwitch, sandwitch),
                55.0,
                "348"
        ),

        Receipt(
                "2",
                listOf(coffee, pizza),
                60.0,
                "456"
        ),

        Receipt(
                "3",
                listOf(espresso, pizza),
                45.0,
                "760"
        )
)

val testReceiptsTwo = mutableSetOf(
        Receipt(
                "4",
                listOf(coffee, coffee, pizza, sandwitch, sandwitch),
                130.0,
                "555"
        ),

        Receipt(
                "5",
                listOf(espresso, sandwitch, espresso),
                25.0,
                "157"
        ),

        Receipt(
                "6",
                listOf(espresso, pizza, coffee),
                70.0,
                "627"
        )
)