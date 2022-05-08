class InputService {
    // In charge of all the user input in the program.
    private var currentInput:String = ""

    // Accepts user input, assigns it to the member variable currentInput
    fun getInput():String
    {
        currentInput = readln()
        return currentInput
    }
    // Bool: Checks for help in user input
    fun checkHelp():Boolean
    {
        return currentInput.lowercase() == "help"
    }

    // Bool: Checks for look in user input
    fun checkLook():Boolean
    {
        return currentInput.lowercase() == "look"
    }
    // Bool: Checks for inspect in user input

    fun checkInspect():Boolean
    {
        return currentInput.lowercase() == "inspect"
    }

    // Bool: Checks for open in user input
    fun checkOpen():Boolean
    {
        return currentInput.lowercase() == "open"
    }
    // Bool: Checks for east in user input
    fun checkEast():Boolean
    {
        return currentInput.lowercase() == "east"
    }

    // Bool: Checks for west in user input
    fun checkWest():Boolean
    {
        return currentInput.lowercase() == "west"
    }

}