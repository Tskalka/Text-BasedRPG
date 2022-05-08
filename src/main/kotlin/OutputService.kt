class OutputService {

    // In charge of everything that is displayed to the terminal.

    // Starts the story, prompts the user input.
    fun storyStart(name: String)
    {
        println("You awake in a cold, dark jail cell. You remember nothing except your name, $name.")
        println("Everything you try to think of what happened, nothing comes to mind except for a headache.")
        println("Every part of your being screams that you are in danger. ")
        println("You need to escape!")
        println("What will you do?")
    }
    // Inspect used in the beginning room
    fun inspectStart()
    {
        println("You being to search around the room you don't find any other exit")
        println("You do find a stick that could be used as a lock pick")
        println("LOCK PICK ADDED!")
    }

    // Open used in the beginning room: No lockpick
    fun openStart()
    {
        println("You attempt to open the door, you try brute forcing it!")
        println("You make a lot of noise, but have no success opening the door")
    }

    // Attempts to go east in the beginning room
    fun eastStart()
    {
        println("You are in a locked room...you're stuck.")
    }
    // Attempts to go west in the beginning room
    fun westStart()
    {
        println("You are in a locked room...you're stuck.")
    }
    // Displays all the available actions to the terminal.
    fun helpAction()
    {
        println("_______________________")
        println("Action types:")
        println("LOOK: looks around the room, (repeats room description)")
        println("EAST: follows the east hallway")
        println("WEST: follows the west hallway")
        println("INSPECT: inspects the room for items, secrets etc.")
        println("OPEN: attempts to open the door in the room")
        println("_______________________")
    }

    // Opens the door with the lock pick
    fun openDoor()
    {
        println("After fiddling with the lock pick, the door opens!")
        println("You enter into the large, dark hallway.")
        println("")
    }

    // Prints end game screen to the terminal.
    fun gameOver()
    {
        println("You managed to escape! Thanks for playing!!")
    }

}