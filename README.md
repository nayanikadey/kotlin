Start with hello world program

`println("Hello, World !")`

Read name from console using readLine() and store in val variable.

`val name = readLine()`

Pass name in println statement using string template

`println("Hello, $name")`

Add ! mark after name to show the exciation level and call length function on name

`println("Hello, $name ${"!".repeat(name.length)}")`

Talk about nullable concept in kotlin when using above name?.length

`println("Hello, $name ${"!".repeat(name?.length)}")`

Talk about if as expression by doing null check on name

`val message = if(name == null) name else "Stranger"`

Change the above to null safe call

`val message = name ?: "Stranger"`

Create printName() function and move the printing logic inside it

`fun printName(message: String) {
     println("Hello, $message ${"!".repeat(message.length)}")
 }`
 
Pass excitation level as parameter to printName and for Stranger pass 0 as excitation level
Talk about default parameter

`fun printName(message: String, excitationLevel: String = 0) {
      println("Hello, $message ${"!".repeat(excitationLevel)}")
}`

Pass greeting as a parameter that for Stranger we pass Hi and for user we pass Hello.
Talk about named function parameters

For User
`printName(message = message, excitationLevel = message.length, greeting = "Hello")`

For Stranger
`printName(message = message, greeting = "Hi")`

`fun printName(greeting: String, message: String, excitationLevel: String = 0) {
      println("$greeting, $message ${"!".repeat(excitationLevel)}")
}`

Start new program with entering a number and reading it using readline() and print the same number

`println("Enter number: ")
 val number = readLine()?.toInt()
 println("The number entered is $number")
`

The above code throws NumberFormatException for String values. Use try/catch for the exception

`try {
 val number = readLine()?.toInt()
} catch(ex: NumberformatException) {
println("Not a number !")
return
}
println("The number entered is $number") //This code now shows compile time error as number is not accessible here
`

To solve the compile time error, we extract number out of the try catch block. Talk about how try block can return value

`val number = try {
  readLine()?.toInt()
} catch(ex: NumberformatException) {
println("Not a number !")
return
}
println("The number entered is $number")
`

Now remove try/catch block by using readLine().toIntOrNull() method on number

`val number = readLine()?.toIntOrNull()`

Check if number is null using if block

`if(number == null) {
println("Not a number !")
return
}`

Lets try to create a game, create a secret number using Random() and try to guess it with the above input number

`val secret: Int = Random.nextInt(100)
if(number < secret) {
println("Too small !")
} else if(number > secret) {
println("Too big !")
} else {
println("You got it !")
}
`

Introduce loops and try guessing the secret number by 5 chances. Also talk about range operator used below.

`for(i in 4..0)` 

Use while instead of for loop

`var i = 0
while(i < 5){
i++
}`

Convert the above if to when now. Talk about how when can be used as a statement

`when(number.compareTo(secret)) {
-1 -> println("Too small !")
0 -> {
println("You got it !")
return
}
-1 -> println("Too big !")
}`

Instead of println, just return the messages and save it in a variable called result. Talk about when as an expression and its return value

`
val result = when(number.compareTo(secret)) {
             -1 -> "Too small !"
             0 -> "You got it !"
             -1 -> "Too big !"
             else -> ""
             }
println(result)
`