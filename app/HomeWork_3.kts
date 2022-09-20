fun numb()
{
    var numbers: MutableList<Int> = mutableListOf()

    for (a in 1..10)
    {
        numbers.add(a)
    }
    print (numbers)
}

fun main() {
    numb()
}