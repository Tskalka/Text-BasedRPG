class InputService {

    private var currentInput:String = ""

    fun getInput():String
    {
        currentInput = readln()
        return currentInput
    }

    fun checkHelp():Boolean
    {
        return currentInput.lowercase() == "help"
    }

    fun checkLook():Boolean
    {
        return currentInput.lowercase() == "look"
    }

    fun checkInspect():Boolean
    {
        return currentInput.lowercase() == "inspect"
    }

    fun checkOpen():Boolean
    {
        return currentInput.lowercase() == "open"
    }

    fun checkEast():Boolean
    {
        return currentInput.lowercase() == "east"
    }

    fun checkWest():Boolean
    {
        return currentInput.lowercase() == "west"
    }

}