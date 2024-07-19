/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
// fun main() {
//     var x = 5
//     println("Hello, Ankit!!!")
//     println("Ankit $x")
// }


//  fun main() {
//      var x: Int = 69
//      val y: Int = 96
//      x = 59
//     // y = 55 //val cant change
     
//  }


//  fun main() {
//      var x: Int = 69 //we can and can not define int or string
//      val y: Int = 96
//      var name: String = "Ankit" 
//      print("name is $name")
//  }


// null type variable
//  fun main() {
//      var myName: String? = null
//      print(myName)
//  }



//     fun main(){
//         val age = 23
//         if( age == 24) {
//             print("you can not vote");
//         } else {
//             print("play game");
//         }
//     }

   

//        fun main () {
//            val name = "Ankit"
//            when(name) {
//                "Ankit"-> {
//                    print("Handsome")
//                }
//                "Arpit"-> {
//                    print("wow")
//                }
//                else-> {
//                    print("kuch nhi")
//                }
//            }
//        }





/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
//         fun main(){
//             val names = arrayOf("Ankit", "Arpit", "Ayush")
//             for(name in names){
//                 println(name)
//             }
//             names.forEach {
//                 print(it)
//             }
//         }


//         fun main() {
//     val kotlin = "🙂"
//     println(kotlin)
// }


// fun main(){
//     print(operation(2,5))
// }
// fun operation(a: Int, b: Int) : Int {
//     return a+b
// }




// fun main(){
//     greetings(name = "Ankit", great="Good Morning")
// }
// fun operation(a: Int, b: Int) : Int = a+b
// fun greetings(great : String = "Good Night", name: String){
//     print("Hello $name, $great")
// }




// fun main(){
//     val output = operation(4, 5, { a, b ->
//         print("Adding these numbers")
//         a+b
//     })
//     print(output)
//     }
//     fun operation(a: Int, b: Int, operate: (Int, Int)-> Int): Int {
//         return operate(a, b)
//     }









//  OOPS

// fun main(){
//     val p1 = Person("Ankit")
//     print(p1.name)
// }
// class Person(_name : String) {
//     val name: String
//     init {
//         name = _name
//     }
// }


// fun main(){
//     val p1 = Person("Ankit")
//     print(p1.name)
// }
// class Person(val name : String) 




//filter & map

// fun main(){
//     val list = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)
//   val newList =  list.filter({ 
//         it % 2 == 0
//     }).map({
//       it*it
//   }).
    
//     forEach({
//         println("$it")
//     })
// }



// fun main(){
// val myName: String? = "Ankit"
// myName?.let {
//     print(myName)
// }
// }



     
    