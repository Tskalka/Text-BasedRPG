class Director {

    private var isGameRunning: Boolean = true
    private var player = Actor()
    private var input = InputService()
    private var output = OutputService()

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

    private fun getInputs()
    {
        input.getInput()
    }
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