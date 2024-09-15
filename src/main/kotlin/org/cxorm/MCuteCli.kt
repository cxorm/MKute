package org.cxorm

import kotlinx.cli.ArgParser
import kotlinx.cli.ArgType
import kotlinx.cli.default

fun main(args: Array<String>) {
    println("")

    // Initialize the ArgParser
    val parser = ArgParser("MCute CLI")

    // Define command-line arguments
    val name by parser.option(ArgType.String, shortName = "n", description = "Name of the user").default("Guest")
    val age by parser.option(ArgType.Int, shortName = "a", description = "Age of the user").default(18)

    // Parse the command-line arguments
    parser.parse(args)

    // Use the parsed arguments
    println("Hello, $name! You are $age years old.")
}
