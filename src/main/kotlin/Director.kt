class Director {

    private var isGameRunning: Boolean = true
    private var player = Actor()
    private var input = InputService()
    private var output = OutputService()

    // The main game loop, also creates the game tutorial and story.
    fun startGame()
    {
        prepareGame()
        while(isGameRunning)
        {
            getInputs()
            doOutputs()
        }
        output.gameOver()
    }

    // Takes in the users name and begins the story
    // minimal text-graphics started.
    private fun prepareGame()
    {
        println("WELCOME TO ESCAPE THE DUNGEON!")
        println("_____________________________________")
        println("What is your name?")
        player.name = input.getInput()
        println("Welcome " + player.name+"!")
        println("Type in certain actions to explore and interact with the world around you")
        println("You may type HELP for the action types at anytime")
        println("_____________________________________")
        output.storyStart(player.name)
    }

    // In charge of getting all the user input
    private fun getInputs()
    {
        input.getInput()
    }
    // In charge of the logic and displaying to the terminal
    private fun doOutputs()
    {

        if(input.checkHelp())
        {
            output.helpAction()
        }
        else if(input.checkLook())
        {
            output.storyStart(player.name)
        }
        else if(input.checkInspect())
        {
            output.inspectStart()
            player.lockPick = true
        }
        else if(input.checkOpen())
        {
            if(player.lockPick)
            {
                output.openDoor()
                isGameRunning = false
            }
            else {
                output.openStart()
            }
        }
        else if(input.checkWest())
        {
            output.westStart()
        }
        else if(input.checkEast())
        {
            output.eastStart()
        }



    }
}