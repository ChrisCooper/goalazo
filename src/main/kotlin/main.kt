fun main(args: Array<String>) {

    val goals = GoalManager()

    val goalList = listOf(
            Goal("Get a part-time English-teaching job", listOf(
                    Action("Ask both programs about weeks off")
            )),
            Goal("Find a part-time coding tutor oppotunity", listOf(
                    Action("Apply on one site")
            ))
    )

    goals.addGoals(goalList)

    goals.addGoal(Goal("Improve personal site", listOf(
            Action("Find a template, preferably SCSS")
    )))


    val nextAction: Action = goals.giveMeAnAction()

    nextAction.iDidYouAndNextActionIs("")
}

class Goal(title: String, actions: List<Action>)
class Action(title: String)

class GoalManager {
    val goals: ArrayList<Goal> = ArrayList()

    fun addGoal(goal: Goal) {
        goals.add(goal)
    }

    fun addGoals(goalList: List<Goal>) {
    }

    fun giveMeAnAction(): Action {


    }


}