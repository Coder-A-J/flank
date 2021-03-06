package ftl.cli.firebase.test.android.models

import picocli.CommandLine

@CommandLine.Command(
    name = "models",
    headerHeading = "",
    synopsisHeading = "%n",
    descriptionHeading = "%n@|bold,underline Description:|@%n%n",
    parameterListHeading = "%n@|bold,underline Parameters:|@%n",
    optionListHeading = "%n@|bold,underline Options:|@%n",
    header = ["Information about available models"],
    description = ["Information about available models. For example prints list of available models to test against"],
    subcommands = [AndroidModelsListCommand::class],
    usageHelpAutoWidth = true
)
class AndroidModelsCommand : Runnable {
    override fun run() {
        CommandLine.usage(AndroidModelsCommand(), System.out)
    }
}
