fun main()
{
    var alphabets: MutableList<Char> = mutableListOf()

    for (a in 'A'..'Z')
    {
        alphabets.add(a)
    }
    print(alphabets)
}